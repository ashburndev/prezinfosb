package ashburncode.prezinfosb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.ManyToOne;

import ashburncode.prezinfosb.President;

@Entity
public class Term {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Override
public String toString() {
	return "Term [id=" + id + ", begDate=" + begDate + ", endDate=" + endDate + ", president=" + president + "]";
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

private Date    begDate;
  private Date    endDate;

  @ManyToOne
  private President president;

}

