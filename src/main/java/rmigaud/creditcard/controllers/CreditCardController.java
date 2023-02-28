package rmigaud.creditcard.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import rmigaud.creditcard.models.CreditCard;
import rmigaud.creditcard.dtos.CreditScore;
import rmigaud.creditcard.repositories.CreditCardRepo;
import java.util.Objects;

@RestController
public class CreditCardController {
  @Autowired
  private CreditCardRepo cards;

  @Autowired
  private RestTemplate restTemplate;

  @PostMapping("/issue-new-card")
  boolean issueCard(@RequestBody CreditCard card) {

    if (getScore(card.getSsn()) >= 700) {
      cards.save(card);
      return true;
    }

    return false;
  }

  private int getScore(String ssn) {
    try {
      return Objects.requireNonNull(restTemplate.getForObject(
          "http://localhost:8080/creditscores/" + ssn, CreditScore.class))
          .getScore();
    } catch (NullPointerException npe) {
      return -1;
    }
  }
}
