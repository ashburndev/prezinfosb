package ashburncode.prezinfosb;

import org.springframework.data.repository.CrudRepository;  // may want to change this

import ashburncode.prezinfosb.Election;

public interface ElectionRepository
  extends CrudRepository<Election, Long> {

}
