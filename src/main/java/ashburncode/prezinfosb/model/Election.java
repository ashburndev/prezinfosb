package ashburncode.prezinfosb.model;

import java.math.BigDecimal;
import java.math.BigInteger;
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
public class Election {

  public Election() {
    super();
    this.createdAt = new Date();  // I don't think this is the right way to do this ??
  }

  public Election(Date electionDate, Boolean incumbWonElection, Integer winnerElectoralVote, Long winnerPopularVote,
      Integer totalElectoralVote, Long totalPopularVote) {
    super();
    this.electionDate = electionDate;
    this.incumbWonElection = incumbWonElection;
    // this.winnerElectoralVote = winnerElectoralVote;
    // this.winnerPopularVote = winnerPopularVote;
    // this.totalElectoralVote = totalElectoralVote;
    // this.totalPopularVote = totalPopularVote;
    this.setWinnerElectoralVote(winnerElectoralVote);
    this.setWinnerPopularVote(winnerPopularVote);
    this.setTotalElectoralVote(totalElectoralVote);
    this.setTotalPopularVote(totalPopularVote);
    this.createdAt = new Date();  // I don't think this is the right way to do this ??
  }

  public Election(Long id, Date electionDate, Boolean incumbWonElection, Integer winnerElectoralVote,
      Long winnerPopularVote, Integer totalElectoralVote, Long totalPopularVote, Float percentWinnerElectoralVote,
      Double percentWinnerPopularVote, BigInteger zzzBigIntegerValue, BigDecimal zzzBigDecimalValue,
      Short zzzShortValue, Byte zzzByteValue, Character zzzCharacterValue, President president) {
    super();
    this.id = id;
    this.electionDate = electionDate;
    this.incumbWonElection = incumbWonElection;
    // this.winnerElectoralVote = winnerElectoralVote;
    // this.winnerPopularVote = winnerPopularVote;
    // this.totalElectoralVote = totalElectoralVote;
    // this.totalPopularVote = totalPopularVote;
    this.setWinnerElectoralVote(winnerElectoralVote);
    this.setWinnerPopularVote(winnerPopularVote);
    this.setTotalElectoralVote(totalElectoralVote);
    this.setTotalPopularVote(totalPopularVote);
    this.percentWinnerElectoralVote = percentWinnerElectoralVote;
    this.percentWinnerPopularVote = percentWinnerPopularVote;
    // this.creator = creator;
    // this.modifier = modifier;
    // this.createdAt = createdAt;
    // this.modifiedAt = modifiedAt;
    this.zzzBigIntegerValue = zzzBigIntegerValue;
    this.zzzBigDecimalValue = zzzBigDecimalValue;
    this.zzzShortValue = zzzShortValue;
    this.zzzByteValue = zzzByteValue;
    this.zzzCharacterValue = zzzCharacterValue;
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
  private Date electionDate;
  private Boolean incumbWonElection;
  private Integer winnerElectoralVote;
  private Long winnerPopularVote;
  private Integer totalElectoralVote;
  private Long totalPopularVote;

  // The percent values would probably be transient values in real application.
  // They
  // are here only to see what the column type will be in the generated MySQL 8
  // table.
  private Float percentWinnerElectoralVote;
  private Double percentWinnerPopularVote;

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

  // These are here only to see what the column type will be in the generated
  // MySQL 8 table.
  @JsonIgnore
  private BigInteger zzzBigIntegerValue;
  @JsonIgnore
  private BigDecimal zzzBigDecimalValue;
  @JsonIgnore
  private Short zzzShortValue;
  @JsonIgnore
  private Byte zzzByteValue;
  @JsonIgnore
  private Character zzzCharacterValue;

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
    if (this.winnerElectoralVote == null || this.totalElectoralVote == null || this.totalElectoralVote == 0L) {
      setPercentWinnerElectoralVote(Float.valueOf(0.0f));
    } else {
      setPercentWinnerElectoralVote(Float.valueOf(this.winnerElectoralVote.floatValue() / (this.totalElectoralVote.floatValue())));
    }
  }

  public Long getWinnerPopularVote() {
    return winnerPopularVote;
  }

  public void setWinnerPopularVote(Long winnerPopularVote) {
    this.winnerPopularVote = winnerPopularVote;
    if (this.winnerPopularVote == null || this.totalPopularVote == null || this.totalPopularVote == 0L) {
      this.percentWinnerPopularVote = Double.valueOf(0.0d);
    } else {
      this.percentWinnerPopularVote = Double.valueOf(this.winnerPopularVote.floatValue() / (this.totalPopularVote.floatValue()));
    }
  }

  public Integer getTotalElectoralVote() {
    return totalElectoralVote;
  }

  public void setTotalElectoralVote(Integer totalElectoralVote) {
    this.totalElectoralVote = totalElectoralVote;
    if (this.winnerElectoralVote == null || this.totalElectoralVote == null || this.totalElectoralVote == 0L) {
      setPercentWinnerElectoralVote(Float.valueOf(0.0f));
    } else {
      setPercentWinnerElectoralVote(Float.valueOf(this.winnerElectoralVote.floatValue() / (this.totalElectoralVote.floatValue())));
    }
  }

  public Long getTotalPopularVote() {
    return totalPopularVote;
  }

  public void setTotalPopularVote(Long totalPopularVote) {
    this.totalPopularVote = totalPopularVote;
    if (this.winnerPopularVote == null || this.totalPopularVote == null || this.totalPopularVote == 0L) {
      this.percentWinnerPopularVote = Double.valueOf(0.0d);
    } else {
      this.percentWinnerPopularVote = Double.valueOf(this.winnerPopularVote.floatValue() / (this.totalPopularVote.floatValue()));
    }
  }

  public Float getPercentWinnerElectoralVote() {
    return percentWinnerElectoralVote;
  }
  
  public void setPercentWinnerElectoralVote(Float percentWinnerElectoralVote) {
    this.percentWinnerElectoralVote = percentWinnerElectoralVote;
  }

  public Double getPercentWinnerPopularVote() {
    return percentWinnerPopularVote ;
  }

  public void setPercentWinnerPopularVote(Double percentWinnerPopularVote) {
    this.percentWinnerPopularVote = percentWinnerPopularVote;
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

  public BigInteger getZzzBigIntegerValue() {
    return zzzBigIntegerValue;
  }

  public void setZzzBigIntegerValue(BigInteger zzzBigIntegerValue) {
    this.zzzBigIntegerValue = zzzBigIntegerValue;
  }

  public BigDecimal getZzzBigDecimalValue() {
    return zzzBigDecimalValue;
  }

  public void setZzzBigDecimalValue(BigDecimal zzzBigDecimalValue) {
    this.zzzBigDecimalValue = zzzBigDecimalValue;
  }

  public Short getZzzShortValue() {
    return zzzShortValue;
  }

  public void setZzzShortValue(Short zzzShortValue) {
    this.zzzShortValue = zzzShortValue;
  }

  public Byte getZzzByteValue() {
    return zzzByteValue;
  }

  public void setZzzByteValue(Byte zzzByteValue) {
    this.zzzByteValue = zzzByteValue;
  }

  public Character getZzzCharacterValue() {
    return zzzCharacterValue;
  }

  public void setZzzCharacterValue(Character zzzCharacterValue) {
    this.zzzCharacterValue = zzzCharacterValue;
  }

  public President getPresident() {
    return president;
  }

  public void setPresident(President president) {
    this.president = president;
  }

  @Override
  public int hashCode() {
    return Objects.hash(electionDate, incumbWonElection, percentWinnerElectoralVote, percentWinnerPopularVote,
        totalElectoralVote, totalPopularVote, winnerElectoralVote, winnerPopularVote);
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
    return Objects.equals(electionDate, other.electionDate)
        && Objects.equals(incumbWonElection, other.incumbWonElection)
        && Objects.equals(percentWinnerElectoralVote, other.percentWinnerElectoralVote)
        && Objects.equals(percentWinnerPopularVote, other.percentWinnerPopularVote)
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
        + percentWinnerPopularVote + "]";
  }

}
