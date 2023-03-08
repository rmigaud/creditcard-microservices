package rmigaud.creditcard;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.assertThat;
import rmigaud.creditcard.models.CreditCard;
import java.util.Date;

@SuppressWarnings("SameParameterValue")
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class CreditCardApplicationTests {
  final String CREDITCARD_ISSUE = "/creditcard/" + "/issue-new-card/";

  @Autowired
  TestRestTemplate testRestTemplate;

  private static CreditCard createCreditCard(String ssn, String firstName,
                                             String lastName,
                                             String cardNumber,
                                             Date expireDate,
                                             int securityCode) {

    CreditCard testCard = new CreditCard();
    testCard.setSsn(ssn);
    testCard.setFirstName(firstName);
    testCard.setLastName(lastName);
    testCard.setCardNumber(cardNumber);
    testCard.setExpireDate(expireDate);
    testCard.setSecurityCode(securityCode);
    return testCard;
  }
// How can I mock the CreditScore Check microservice from another project?
  @Test
  void contextLoads() {
    CreditCard card = createCreditCard("70012345", "firstName", "lastName",
        "cardNumber", new Date(), 123);
    ResponseEntity<Object> response =
        testRestTemplate.postForEntity(CREDITCARD_ISSUE, card, Object.class);
    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
  }
}
