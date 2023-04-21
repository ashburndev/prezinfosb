package ashburncode.prezinfosb.repository;

// import org.springframework.data.repository.Repository;
// import org.springframework.data.repository.CrudRepository;  // may want to change this
// import org.springframework.data.repository.PagingAndSortingRepository;
// import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import ashburncode.prezinfosb.model.Term;

// page 83, "Java Persistence with Spring Data and Hibernate3", Manning Press, 2023
// public interface PresidentRepository extends Repository<President, Long> {}
// public interface PresidentRepository extends CrudRepository<President, Long> {}
// public interface PresidentRepository extends PagingAndSortingRepository<President, Long> {}
// public interface PresidentRepository extends JpaRepository<President, Long> {}

public interface TermRepository extends JpaRepository<Term, Long> {
}
