package ashburncode.prezinfosb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.*;    // @Data ??
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import ashburncode.prezinfosb.President;

// import jakarta.persistence.Constraints.NotNull;
// import jakarta.persistence.Constraints.Size;

// import lombok.Data;

// @Data
@Entity
public class Election {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private Long    incumbPopularVote;
  private Long    totalPopularVote;
  private Integer incumbElectoralVote;
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

