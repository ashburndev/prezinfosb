package ashburncode.prezinfosb.repository;

import java.util.List;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.Pageable;

// import org.springframework.data.repository.Repository;
// import org.springframework.data.repository.CrudRepository;  // may want to change this
// import org.springframework.data.repository.PagingAndSortingRepository;
// import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import ashburncode.prezinfosb.model.President;

// page 83, "Java Persistence with Spring Data and Hibernate3", Manning Press, 2023
// public interface PresidentRepository extends Repository<President, Long> {}
// public interface PresidentRepository extends CrudRepository<President, Long> {}
// public interface PresidentRepository extends PagingAndSortingRepository<President, Long> {}
// public interface PresidentRepository extends JpaRepository<President, Long> {}

public interface PresidentRepository extends JpaRepository<President, Long> {

  List<President> findAllByPoliticalParty(String politicalParty);
  
  List<President> findAllByPoliticalParty(String politicalParty, Pageable pageable);
  
  // List<President> findAllByPoliticalParty(String politicalParty, Sort sort);
  
}
