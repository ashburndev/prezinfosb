package ashburncode.prezinfosb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;    // @Data ??
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.ManyToOne;

import ashburncode.prezinfosb.Election;
import ashburncode.prezinfosb.Term;

// import jakarta.persistence.Constraints.NotNull;
// import jakarta.persistence.Constraints.Size;

// import lombok.Data;

// @Data
@Entity
public class President {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String firstName;
  private String middleName;
  private String lastName;
  private String politicalParty;
  private Date   firstInaugDate;

  // @Size(max = 4000)
  // @Length(max = 4000)
  // @Column(length=4000)              // generates Type "varchar(4000)"
  @Column(columnDefinition = "TEXT")   // generates Type "text"
  private String firstInaugAddress;

  @OneToMany(mappedBy = "president", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Election> elections;

  @OneToMany(mappedBy = "president", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Term> terms;

}

