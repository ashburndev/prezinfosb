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
public class Election {

  @Override
	public String toString() {
		return "Election [id=" + id + ", winnerPopularVote=" + winnerPopularVote + ", totalPopularVote="
				+ totalPopularVote + ", winnerElectoralVote=" + winnerElectoralVote + ", totalElectoralVote="
				+ totalElectoralVote + ", electionDate=" + electionDate + ", incumbWonElection=" + incumbWonElection
				+ ", president=" + president + "]";
	}

@Override
	public int hashCode() {
		return Objects.hash(electionDate, id, incumbWonElection, president, totalElectoralVote, totalPopularVote,
				winnerElectoralVote, winnerPopularVote);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Election other = (Election) obj;
		return Objects.equals(electionDate, other.electionDate) && Objects.equals(id, other.id)
				&& Objects.equals(incumbWonElection, other.incumbWonElection)
				&& Objects.equals(president, other.president)
				&& Objects.equals(totalElectoralVote, other.totalElectoralVote)
				&& Objects.equals(totalPopularVote, other.totalPopularVote)
				&& Objects.equals(winnerElectoralVote, other.winnerElectoralVote)
				&& Objects.equals(winnerPopularVote, other.winnerPopularVote);
	}

@Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private Long    winnerPopularVote;
  private Long    totalPopularVote;
  private Integer winnerElectoralVote;
  private Integer totalElectoralVote;
  private Date    electionDate;
  private Boolean incumbWonElection;

  // @ManyToOne(fetch = FetchType.LAZY, optional = false)
  // @JoinColumn(name = "president_id", nullable = false)
  // @OnDelete(action = OnDeleteAction.CASCADE)
  // @JsonIgnore
  // @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
  // private President president;

  @ManyToOne
  private President president;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Long getWinnerPopularVote() {
	return winnerPopularVote;
}

public void setWinnerPopularVote(Long winnerPopularVote) {
	this.winnerPopularVote = winnerPopularVote;
}

public Long getTotalPopularVote() {
	return totalPopularVote;
}

public void setTotalPopularVote(Long totalPopularVote) {
	this.totalPopularVote = totalPopularVote;
}

public Integer getWinnerElectoralVote() {
	return winnerElectoralVote;
}

public void setWinnerElectoralVote(Integer winnerElectoralVote) {
	this.winnerElectoralVote = winnerElectoralVote;
}

public Integer getTotalElectoralVote() {
	return totalElectoralVote;
}

public void setTotalElectoralVote(Integer totalElectoralVote) {
	this.totalElectoralVote = totalElectoralVote;
}

public Date getElectionDate() {
	return electionDate;
}

public void setElectionDate(Date electionDate) {
	this.electionDate = electionDate;
}

public Boolean getIncumbWonElection() {
	return incumbWonElection;
}

public void setIncumbWonElection(Boolean incumbWonElection) {
	this.incumbWonElection = incumbWonElection;
}

public President getPresident() {
	return president;
}

public void setPresident(President president) {
	this.president = president;
}

}

