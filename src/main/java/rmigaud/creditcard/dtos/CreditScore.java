package rmigaud.creditcard.dtos;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
public class CreditScore {
  private String ssn;
  private String firstName;
  private String lastName;
  private int score;

  public CreditScore() {
  }

  public CreditScore(String ssn, String firstName,
                     String lastName, int score) {
    this.ssn = ssn;
    this.firstName = firstName;
    this.lastName = lastName;
    this.score = score;
  }

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

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }
}
