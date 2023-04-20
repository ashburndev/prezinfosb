package ashburncode.prezinfosb.model;

import java.util.Date;
import java.util.Objects;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Term {

  public Term() {
    super();
    this.createdAt = new Date();  // I don't think this is the right way to do this ??
  }

  public Term(Date begDate, Date endDate) {
    super();
    this.begDate = begDate;
    this.endDate = endDate;
    this.createdAt = new Date();  // I don't think this is the right way to do this ??
  }

  public Term(Long id, Date begDate, Date endDate, President president) {
    super();
    this.id = id;
    this.begDate = begDate;
    this.endDate = endDate;
//    this.creator = creator;
//    this.modifier = modifier;
//    this.createdAt = createdAt;
//    this.modifiedAt = modifiedAt;
    this.president = president;
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
  private Date begDate;
  private Date endDate;

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

  @JsonIgnore
  @ManyToOne
  private President president;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Date getBegDate() {
    return begDate;
  }

  public void setBegDate(Date begDate) {
    this.begDate = begDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
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

  public President getPresident() {
    return president;
  }

  public void setPresident(President president) {
    this.president = president;
  }

  @Override
  public int hashCode() {
    return Objects.hash(begDate, endDate);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Term other = (Term) obj;
    return Objects.equals(begDate, other.begDate) && Objects.equals(endDate, other.endDate);
  }

  @Override
  public String toString() {
    return "Term [id=" + id + ", begDate=" + begDate + ", endDate=" + endDate + ", modifiedAt=" + modifiedAt + "]";
  }

}
