package rmigaud.creditcard.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Date;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
@Entity
public class CreditCard {
  @Id
  private String ssn;
  private String firstName;
  private String lastName;
  private String cardNumber;
  private Date expireDate;
  private int securityCode;

  public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public Date getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(Date expireDate) {
    this.expireDate = expireDate;
  }

  public int getSecurityCode() {
    return securityCode;
  }

  public void setSecurityCode(int securityCode) {
    this.securityCode = securityCode;
  }
}
