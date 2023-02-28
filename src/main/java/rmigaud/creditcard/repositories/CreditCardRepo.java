package rmigaud.creditcard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rmigaud.creditcard.models.CreditCard;

public interface CreditCardRepo extends JpaRepository<CreditCard, String> {
}
