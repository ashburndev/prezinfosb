package ashburncode.prezinfosb.controller;

import java.util.Optional;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ashburncode.prezinfosb.model.President;
import ashburncode.prezinfosb.model.Term;
import ashburncode.prezinfosb.repository.TermRepository;

@RestController
@RequestMapping(path = "/api/terms", produces = "application/json")
//@CrossOrigin(origins="http://prezcloud:8080")
public class TermController {

  private TermRepository termRepository;

  public TermController(TermRepository termRepository) {
    this.termRepository = termRepository;
  }

  @GetMapping(params = "recent")
  public Iterable<Term> recentTerms() {
    PageRequest page = PageRequest.of(0, 12, Sort.by("begDate").descending());
    return termRepository.findAll(page).getContent();
  }

//@GetMapping("/{id}")
//public Optional<Term> termById(@PathVariable("id") Long id) {
//  return termRepository.findById(id);
//}

  @GetMapping("/{id}")
  public ResponseEntity<Term> termById(@PathVariable("id") Long id) {
    Optional<Term> optTerm = termRepository.findById(id);
    if (optTerm.isPresent()) {
      return new ResponseEntity<>(optTerm.get(), HttpStatus.OK);
    }
    return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
  }

  @PostMapping(consumes = "application/json")
  @ResponseStatus(HttpStatus.CREATED)
  public Term postTerm(@RequestBody Term term) {
    return termRepository.save(term);
  }

}
