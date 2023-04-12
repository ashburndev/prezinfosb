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
import ashburncode.prezinfosb.model.Election;
import ashburncode.prezinfosb.model.President;
import ashburncode.prezinfosb.repository.ElectionRepository;

@RestController
@RequestMapping(path = "/api/elections", produces = "application/json")
// @CrossOrigin(origins="http://prezcloud:8080")
public class ElectionController {

  private ElectionRepository electionRepository;

  public ElectionController(ElectionRepository electionRepository) {
    this.electionRepository = electionRepository;
  }

  @GetMapping(params = "recent")
  public Iterable<Election> recentElections() {
    PageRequest page = PageRequest.of(0, 12, Sort.by("electionDate").descending());
    return electionRepository.findAll(page).getContent();
  }

//@GetMapping("/{id}")
//public Optional<Election> electionById(@PathVariable("id") Long id) {
//  return electionRepository.findById(id);
//}

  @GetMapping("/{id}")
  public ResponseEntity<Election> electionById(@PathVariable("id") Long id) {
    Optional<Election> optElection = electionRepository.findById(id);
    if (optElection.isPresent()) {
      return new ResponseEntity<>(optElection.get(), HttpStatus.OK);
    }
    return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
  }

  @PostMapping(consumes = "application/json")
  @ResponseStatus(HttpStatus.CREATED)
  public Election postElection(@RequestBody Election election) {
    return electionRepository.save(election);
  }

}
