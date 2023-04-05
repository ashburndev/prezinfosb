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
public class Term {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private Date    begDate;
  private Date    endDate;

  @ManyToOne
  private President president;

}

