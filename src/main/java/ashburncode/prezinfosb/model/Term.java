package ashburncode.prezinfosb.model;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Term {

  public Term(Date begDate, Date endDate) {
    super();
    this.begDate = begDate;
    this.endDate = endDate;
  }

  public Term(Long id, Date begDate, Date endDate, President president) {
    super();
    this.id = id;
    this.begDate = begDate;
    this.endDate = endDate;
    this.president = president;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private Date begDate;
  private Date endDate;

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

  public President getPresident() {
    return president;
  }

  public void setPresident(President president) {
    this.president = president;
  }

  @Override
  public int hashCode() {
    return Objects.hash(begDate, endDate, id, president);
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
    return Objects.equals(begDate, other.begDate) && Objects.equals(endDate, other.endDate)
        && Objects.equals(id, other.id) && Objects.equals(president, other.president);
  }

  @Override
  public String toString() {
    return "Term [id=" + id + ", begDate=" + begDate + ", endDate=" + endDate + ", president=" + president + "]";
  }

}
