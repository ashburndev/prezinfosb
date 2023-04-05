package ashburncode.prezinfosb;

import org.springframework.data.repository.CrudRepository;  // may want to change this

import ashburncode.prezinfosb.Term;

public interface TermRepository
  extends CrudRepository<Term, Long> {

}
