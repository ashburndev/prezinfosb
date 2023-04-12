package ashburncode.prezinfosb.controller;

import java.util.Optional;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ashburncode.prezinfosb.model.President;
import ashburncode.prezinfosb.repository.PresidentRepository;

@RestController
@RequestMapping(path = "/api/presidents", produces = "application/json")
//@CrossOrigin(origins="http://prezcloud:8080")
public class PresidentController {

  private PresidentRepository presidentRepository;

  public PresidentController(PresidentRepository presidentRepository) {
    this.presidentRepository = presidentRepository;
  }

  @GetMapping(params = "recent")
  public Iterable<President> recentPresidents() {
    PageRequest page = PageRequest.of(0, 12, Sort.by("politicalParty").descending());
    return presidentRepository.findAll(page).getContent();
  }

//  @GetMapping("/{id}")
//  public Optional<President> presidentById(@PathVariable("id") Long id) {
//    return presidentRepository.findById(id);
//  }

  @GetMapping("/{id}")
  public ResponseEntity<President> presidentById(@PathVariable("id") Long id) {
    Optional<President> optPresident = presidentRepository.findById(id);
    if (optPresident.isPresent()) {
      return new ResponseEntity<>(optPresident.get(), HttpStatus.OK);
    }
    return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
  }

  @PostMapping(consumes = "application/json")
  @ResponseStatus(HttpStatus.CREATED)
  public President postPresident(@RequestBody President president) {
    return presidentRepository.save(president);
  }

}
