package ashburncode.prezinfosb.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

// import jakarta.persistence.Constraints.NotNull;
// import jakarta.persistence.Constraints.Size;
// import lombok.Data;

// @Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class President {

  public President() {
    super();
    this.createdAt = new Date();  // I don't think this is the right way to do this ??
  }

  public President(String firstName, String middleName, String lastName, String politicalParty) {
    super();
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.politicalParty = politicalParty;
    this.createdAt = new Date();  // I don't think this is the right way to do this ??
  }

  public President(String firstName, String middleName, String lastName, String politicalParty, Date firstInaugDate) {
    super();
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.politicalParty = politicalParty;
    this.firstInaugDate = firstInaugDate;
    this.createdAt = new Date();  // I don't think this is the right way to do this ??
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
//    this.creator = creator;
//    this.modifier = modifier;
//    this.createdAt = createdAt;
//    this.modifiedAt = modifiedAt;
    this.firstInaugAddress = firstInaugAddress;
    this.elections = elections;
    this.terms = terms;
    this.createdAt = new Date();  // I don't think this is the right way to do this ??
  }

  @Id
  // @GeneratedValue(strategy = GenerationType.AUTO)
  // @GeneratedValue(strategy = GenerationType.IDENTITY)
  // @GeneratedValue(strategy = GenerationType.SEQUENCE)
  // @GeneratedValue(strategy = GenerationType.TABLE)
  // @GeneratedValue(strategy = GenerationType.UUID)
 @GeneratedValue(generator = "hibernate_sequence")
 @GenericGenerator(name = "hibernate_sequence", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
     @Parameter(name = "sequence_name", value = "hibernate_sequence"), @Parameter(name = "initial_value", value = "1"),
     @Parameter(name = "increment_size", value = "1") })
  private Long id;
  private String firstName;
  private String middleName;
  private String lastName;
  private String politicalParty;
  private Date firstInaugDate;

  // https://www.baeldung.com/spring-data-annotations
  //  @CreatedBy
  //  User creator;
  //  @LastModifiedBy
  //  User modifier;
  @Column(name = "created_at", nullable = false, updatable = false)
  @CreatedDate
  Date createdAt;
  @LastModifiedDate
  Date modifiedAt;

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

//  public User getCreator() {
//    return creator;
//  }
//
//  public void setCreator(User creator) {
//    this.creator = creator;
//  }
//
//  public User getModifier() {
//    return modifier;
//  }
//
//  public void setModifier(User modifier) {
//    this.modifier = modifier;
//  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(Date modifiedAt) {
    this.modifiedAt = modifiedAt;
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
    return Objects.hash(firstInaugAddress, firstInaugDate, firstName, lastName, middleName, politicalParty);
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
    return Objects.equals(firstInaugAddress, other.firstInaugAddress)
        && Objects.equals(firstInaugDate, other.firstInaugDate) && Objects.equals(firstName, other.firstName)
        && Objects.equals(lastName, other.lastName) && Objects.equals(middleName, other.middleName)
        && Objects.equals(politicalParty, other.politicalParty);
  }

  @Override
  public String toString() {
    return "President [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
        + ", politicalParty=" + politicalParty + ", firstInaugDate=" + firstInaugDate + ", createdAt=" + createdAt
        + ", modifiedAt=" + modifiedAt + "]";
  }

}
