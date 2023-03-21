package ashburncode.prezinfosb;

import org.springframework.data.repository.CrudRepository;  // may want to change this

import ashburncode.prezinfosb.President;

public interface PresidentRepository
  extends CrudRepository<President, String> {

}
