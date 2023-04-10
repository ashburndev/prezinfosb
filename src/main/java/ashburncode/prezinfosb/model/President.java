package ashburncode.prezinfosb.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import ashburncode.prezinfosb.model.Election;
import ashburncode.prezinfosb.model.Term;

// import jakarta.persistence.Constraints.NotNull;
// import jakarta.persistence.Constraints.Size;
// import lombok.Data;

// @Data
@Entity
public class President {

  public President(String firstName, String middleName, String lastName, String politicalParty) {
    super();
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.politicalParty = politicalParty;
  }

  public President(Long id, String firstName, String middleName, String lastName, String politicalParty,
      Date firstInaugDate, String firstInaugAddress, List<Election> elections, List<Term> terms) {
    super();
    this.id = id;
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.politicalParty = politicalParty;
    this.firstInaugDate = firstInaugDate;
    this.firstInaugAddress = firstInaugAddress;
    this.elections = elections;
    this.terms = terms;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String firstName;
  private String middleName;
  private String lastName;
  private String politicalParty;
  private Date firstInaugDate;

  // @Size(max = 4000)
  // @Length(max = 4000)
  // @Column(length=4000) // generates MySQL 8 Type = "varchar(4000)"
  @Column(columnDefinition = "TEXT") // generates MySQL 8 Type = "text"
  private String firstInaugAddress;

  @OneToMany(mappedBy = "president", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Election> elections;

  @OneToMany(mappedBy = "president", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Term> terms;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPoliticalParty() {
    return politicalParty;
  }

  public void setPoliticalParty(String politicalParty) {
    this.politicalParty = politicalParty;
  }

  public Date getFirstInaugDate() {
    return firstInaugDate;
  }

  public void setFirstInaugDate(Date firstInaugDate) {
    this.firstInaugDate = firstInaugDate;
  }

  public String getFirstInaugAddress() {
    return firstInaugAddress;
  }

  public void setFirstInaugAddress(String firstInaugAddress) {
    this.firstInaugAddress = firstInaugAddress;
  }

  public List<Election> getElections() {
    return elections;
  }

  public void setElections(List<Election> elections) {
    this.elections = elections;
  }

  public List<Term> getTerms() {
    return terms;
  }

  public void setTerms(List<Term> terms) {
    this.terms = terms;
  }

  @Override
  public int hashCode() {
    return Objects.hash(elections, firstInaugAddress, firstInaugDate, firstName, id, lastName, middleName,
        politicalParty, terms);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    President other = (President) obj;
    return Objects.equals(elections, other.elections) && Objects.equals(firstInaugAddress, other.firstInaugAddress)
        && Objects.equals(firstInaugDate, other.firstInaugDate) && Objects.equals(firstName, other.firstName)
        && Objects.equals(id, other.id) && Objects.equals(lastName, other.lastName)
        && Objects.equals(middleName, other.middleName) && Objects.equals(politicalParty, other.politicalParty)
        && Objects.equals(terms, other.terms);
  }

  @Override
  public String toString() {
    return "President [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
        + ", politicalParty=" + politicalParty + ", firstInaugDate=" + firstInaugDate + ", firstInaugAddress="
        + firstInaugAddress + ", elections=" + elections + ", terms=" + terms + "]";
  }

}
