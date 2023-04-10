package ashburncode.prezinfosb.repository;

// import org.springframework.data.repository.CrudRepository;  // may want to change this
// import org.springframework.data.repository.PagingAndSortingRepository;
// import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import ashburncode.prezinfosb.model.Term;

//page 83, "Java Persistence with Spring Data and Hibernate3", Manning Press, 2023
//public interface TermRepository extends CrudRepository<Term, Long> {}
//public interface TermRepository extends PagingAndSortingRepository<Term, Long> {}
//public interface TermRepository extends JpaRepository<Term, Long> {}

public interface TermRepository extends JpaRepository<Term, Long> {
}
