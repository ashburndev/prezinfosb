package ashburncode.prezinfosb.repository;

// import org.springframework.data.repository.CrudRepository;  // may want to change this
// import org.springframework.data.repository.PagingAndSortingRepository;
// import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import ashburncode.prezinfosb.model.Election;

//page 83, "Java Persistence with Spring Data and Hibernate3", Manning Press, 2023
//public interface ElectionRepository extends CrudRepository<Election, Long> {}
//public interface ElectionRepository extends PagingAndSortingRepository<Election, Long> {}
//public interface ElectionRepository extends JpaRepository<Election, Long> {}

public interface ElectionRepository extends JpaRepository<Election, Long> {
}
