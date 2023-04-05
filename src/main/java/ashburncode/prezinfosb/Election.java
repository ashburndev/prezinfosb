package ashburncode.prezinfosb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

}

