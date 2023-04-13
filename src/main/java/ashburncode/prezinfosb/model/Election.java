package ashburncode.prezinfosb.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Election {

  public Election() {
    super();
  }

  public Election(Date electionDate, Boolean incumbWonElection, Integer winnerElectoralVote, Long winnerPopularVote,
      Integer totalElectoralVote, Long totalPopularVote) {
    super();
    this.electionDate = electionDate;
    this.incumbWonElection = incumbWonElection;
    this.winnerElectoralVote = winnerElectoralVote;
    this.winnerPopularVote = winnerPopularVote;
    this.totalElectoralVote = totalElectoralVote;
    this.totalPopularVote = totalPopularVote;
  }

  public Election(Long id, Date electionDate, Boolean incumbWonElection, Integer winnerElectoralVote,
      Long winnerPopularVote, Integer totalElectoralVote, Long totalPopularVote, Float percentWinnerElectoralVote,
      Double percentWinnerPopularVote, BigInteger someBIValue, BigDecimal someBDValue, President president) {
    super();
    this.id = id;
    this.electionDate = electionDate;
    this.incumbWonElection = incumbWonElection;
    this.winnerElectoralVote = winnerElectoralVote;
    this.winnerPopularVote = winnerPopularVote;
    this.totalElectoralVote = totalElectoralVote;
    this.totalPopularVote = totalPopularVote;
    this.percentWinnerElectoralVote = percentWinnerElectoralVote;
    this.percentWinnerPopularVote = percentWinnerPopularVote;
    this.someBIValue = someBIValue;
    this.someBDValue = someBDValue;
    this.president = president;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  // @GeneratedValue(generator = "hibernate_sequence")
  // @GenericGenerator(
  //   name = "hibernate_sequence",
  //   strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
  //   parameters = {
  //     @Parameter(name = "sequence_name", value = "hibernate_sequence"),
  //     @Parameter(name = "initial_value", value = "1"),
  //     @Parameter(name = "increment_size", value = "1")
  //     }
  // )
  private Long id;
  private Date electionDate;
  private Boolean incumbWonElection;
  private Integer winnerElectoralVote;
  private Long winnerPopularVote;
  private Integer totalElectoralVote;
  private Long totalPopularVote;

  // the percent values would probably be transient values in real application
  // they are here only to see what the data type in generated MySQL 8 will be
  private Float percentWinnerElectoralVote;
  private Double percentWinnerPopularVote;

  // the BigInteger and BigDecimal are here only to see data type in generated
  // MySQL 8 will be
  private BigInteger someBIValue;
  private BigDecimal someBDValue;

  // @ManyToOne(fetch = FetchType.LAZY, optional = false)
  // @JoinColumn(name = "president_id", nullable = false)
  // @OnDelete(action = OnDeleteAction.CASCADE)
  // @JsonIgnore
  // @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval =
  // true)
  // private President president;

  @JsonIgnore
  @ManyToOne
  private President president;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  public Integer getWinnerElectoralVote() {
    return winnerElectoralVote;
  }

  public void setWinnerElectoralVote(Integer winnerElectoralVote) {
    this.winnerElectoralVote = winnerElectoralVote;
  }

  public Long getWinnerPopularVote() {
    return winnerPopularVote;
  }

  public void setWinnerPopularVote(Long winnerPopularVote) {
    this.winnerPopularVote = winnerPopularVote;
  }

  public Integer getTotalElectoralVote() {
    return totalElectoralVote;
  }

  public void setTotalElectoralVote(Integer totalElectoralVote) {
    this.totalElectoralVote = totalElectoralVote;
  }

  public Long getTotalPopularVote() {
    return totalPopularVote;
  }

  public void setTotalPopularVote(Long totalPopularVote) {
    this.totalPopularVote = totalPopularVote;
  }

  public Float getPercentWinnerElectoralVote() {
    // return percentWinnerElectoralVote;
    if (totalElectoralVote == null || totalElectoralVote == 0L) {
      return 0.0f;
    }
    return (winnerElectoralVote.floatValue()) / (totalElectoralVote.floatValue());
  }

  public void setPercentWinnerElectoralVote(Float percentWinnerElectoralVote) {
    this.percentWinnerElectoralVote = percentWinnerElectoralVote;
  }

  public Double getPercentWinnerPopularVote() {
    // returnpercentWinnerPopularVote ;
    if (totalPopularVote == null || totalPopularVote == 0L) {
      return 0.0d;
    }
    return (Double) (winnerPopularVote.doubleValue()) / (Double) (totalPopularVote.doubleValue());
  }

  public void setPercentWinnerPopularVote(Double percentWinnerPopularVote) {
    this.percentWinnerPopularVote = percentWinnerPopularVote;
  }

  public BigInteger getSomeBIValue() {
    return someBIValue;
  }

  public void setSomeBIValue(BigInteger someBIValue) {
    this.someBIValue = someBIValue;
  }

  public BigDecimal getSomeBDValue() {
    return someBDValue;
  }

  public void setSomeBDValue(BigDecimal someBDValue) {
    this.someBDValue = someBDValue;
  }

  public President getPresident() {
    return president;
  }

  public void setPresident(President president) {
    this.president = president;
  }

  @Override
  public int hashCode() {
    return Objects.hash(electionDate, id, incumbWonElection, percentWinnerElectoralVote, percentWinnerPopularVote,
        president, someBDValue, someBIValue, totalElectoralVote, totalPopularVote, winnerElectoralVote,
        winnerPopularVote);
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
        && Objects.equals(percentWinnerElectoralVote, other.percentWinnerElectoralVote)
        && Objects.equals(percentWinnerPopularVote, other.percentWinnerPopularVote)
        && Objects.equals(president, other.president) && Objects.equals(someBDValue, other.someBDValue)
        && Objects.equals(someBIValue, other.someBIValue)
        && Objects.equals(totalElectoralVote, other.totalElectoralVote)
        && Objects.equals(totalPopularVote, other.totalPopularVote)
        && Objects.equals(winnerElectoralVote, other.winnerElectoralVote)
        && Objects.equals(winnerPopularVote, other.winnerPopularVote);
  }

  @Override
  public String toString() {
    return "Election [id=" + id + ", electionDate=" + electionDate + ", incumbWonElection=" + incumbWonElection
        + ", winnerElectoralVote=" + winnerElectoralVote + ", winnerPopularVote=" + winnerPopularVote
        + ", totalElectoralVote=" + totalElectoralVote + ", totalPopularVote=" + totalPopularVote
        + ", percentWinnerElectoralVote=" + percentWinnerElectoralVote + ", percentWinnerPopularVote="
        + percentWinnerPopularVote + ", someBIValue=" + someBIValue + ", someBDValue=" + someBDValue + ", president="
        + president + "]";
  }

}
