package ashburncode.prezinfosb.controller;

import java.rmi.ServerException;
import java.util.HashMap;
import java.util.Optional;

import org.hibernate.mapping.Map;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

  // curl "http://localhost:8080/api/presidents?recent"
  @GetMapping(params = "recent")
  public Iterable<President> recentPresidents() {
    PageRequest page = PageRequest.of(0, 12, Sort.by("firstInaugDate").descending());
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

  // @PostMapping(consumes = "application/json")
  // @ResponseStatus(HttpStatus.CREATED)
  // public President postPresident(@RequestBody President president) {
  //   return presidentRepository.save(president);
  // }

  // curl "http://localhost:8080/api/presidents/politicalParty/Republican?page=1"
  // curl "http://localhost:8080/api/presidents/politicalParty/Republican?page=2&size=5"
  // curl "http://localhost:8080/api/presidents/politicalParty/Republican/"
  // curl "http://localhost:8080/api/presidents/politicalParty/Republican"
  // curl "http://localhost:8080/api/presidents/politicalParty?politicalParty=Republican"

  // curl "http://localhost:8080/api/presidents/politicalParty/Republican"
  // curl "http://localhost:8080/api/presidents/politicalParty/Republican" | jq
  // curl "http://localhost:8080/api/presidents/politicalParty/Republican?page=0&size=4"
  // curl "http://localhost:8080/api/presidents/politicalParty/Republican?page=0&size=4" | jq
  // curl "http://localhost:8080/api/presidents/politicalParty/Democratic?page=0&size=3" | jq
  // curl "http://localhost:8080/api/presidents/politicalParty/Democratic?page=0&size=6&sort=lastName" | jq
  @GetMapping("/politicalParty/{politicalParty}")
  public Iterable<President> findAllByPoliticalParty (
      @PathVariable("politicalParty") String politicalParty,
      @RequestParam(name = "page", required = false, defaultValue = "0") int page, 
      @RequestParam(name = "size", required = false, defaultValue = "2") int size,
      @RequestParam(name = "sort", required = false, defaultValue = "id") String sort) {
    // PageRequest pageRequest = PageRequest.of(page, size);
    // PageRequest pageRequest = PageRequest.of(0, 5, Sort.by("id").ascending()); // hard code for now
    // PageRequest pageRequest = PageRequest.of(page, size, Sort.by("id").ascending()); // hard code the sort or now)
    // PageRequest pageRequest = PageRequest.of(page, size, Sort.by("lastName").ascending()); // hard code the sort or now)
    PageRequest pageRequest = PageRequest.of(page, size, Sort.by(sort).ascending());
    // return presidentRepository.findAllByPoliticalParty("Republican", pageRequest);
    return presidentRepository.findAllByPoliticalParty(politicalParty, pageRequest);
  }

  // curl "http://localhost:8080/api/presidents/recent"
  // curl "http://localhost:8080/api/presidents/recent" | jq
  // curl "http://localhost:8080/api/presidents/recent?page=0" | jq
  // curl "http://localhost:8080/api/presidents/recent?page=0&size=4" | jq
  // curl "http://localhost:8080/api/presidents/recent?page=0&size=6&sort=createdAt" | jq
  @GetMapping("/recent")
  public Iterable<President> findRecent (
      @RequestParam(name = "page", required = false, defaultValue = "0") int page, 
      @RequestParam(name = "size", required = false, defaultValue = "2") int size,
      @RequestParam(name = "sort", required = false, defaultValue = "id") String sort) {
    PageRequest pageRequest = PageRequest.of(page, size, Sort.by(sort).descending());
    return presidentRepository.findAll(pageRequest);
  }

  // curl "http://localhost:8080/api/presidents/republicans"
  @GetMapping("/republicans")
  public Iterable<President> findAllRepublicans() {
    PageRequest pageRequest = PageRequest.of(0, 3, Sort.by("id").ascending()); // hard code for now
    return presidentRepository.findAllByPoliticalParty("Republican", pageRequest);
  }

  // curl "http://localhost:8080/api/presidents/republicans/page"
  // curl "http://localhost:8080/api/presidents/republicans/page" | jq
  // curl "http://localhost:8080/api/presidents/republicans/page?page=0&size=4"
  // curl "http://localhost:8080/api/presidents/republicans/page?page=0&size=4" | jq
  // curl "http://localhost:8080/api/presidents/republicans/page?page=0&size=3" | jq
  // curl "http://localhost:8080/api/presidents/republicans/page?page=0&size=6" | jq
  @GetMapping("/republicans/page")
  public Iterable<President> findRepublicansPaginated(
      @RequestParam(name = "page", required = false, defaultValue = "0") int page, 
      @RequestParam(name = "size", required = false, defaultValue = "2") int size) {
    //    PageRequest pageRequest = PageRequest.of(page, size);
    PageRequest pageRequest = PageRequest.of(page, size, Sort.by("lastName").ascending()); // hard code the sort or now);
    return presidentRepository.findAllByPoliticalParty("Republican", pageRequest);
  }

  //  //  @GetMapping(path = "/republicans/page")
  //  @GetMapping("/republicans/page")
  //  Page<President> findAllRepublicansPage {
  //    
  //    @PageableDefault(page = 0, size = 5)
  //    @SortDefault.SortDefaults ({
  //      @sortDefault(sort = "lastName", direction = Sort.Direction.DESC),
  //      @sortDefault(sort = "ID", direction = Sort.Direction.ASC)
  //      
  //    })
  //    Pageable pageable)  {
  //      return presidentRepository.findAllByPoliticalParty("Republican", pageable);
  //    }
  //  }

//https://howtodoinjava.com/spring5/webmvc/controller-getmapping-postmapping/

  // @GetMapping("/{id}")
  // public ResponseEntity<President> getById(@PathVariable long presidentId) {
  //   Optional<President> president = presidentRepository.getById(presidentId);
  //   if (president.isPresent()) {
  //     return new ResponseEntity<>(president.get(), HttpStatus.OK);
  //   } else {
  //     throw new RecordNotFoundException();
  //   }
  // }

  // curl -X POST http://localhost:8080/api/presidents  \
  //   -H "Accept: application/json" \
  //   -H 'Content-Type: application/json' \
  //   -d '{"firstName":"Harold","lastName":"Stassen"}'
  // curl -X POST http://localhost:8080/api/presidents  \
  //   -H "Accept: application/json" \
  //   -H 'Content-Type: application/json' \
  //   -d '{"firstName":"William","lastName":"Sherman"}'
  @PostMapping(
    consumes = MediaType.APPLICATION_JSON_VALUE, 
    produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<President> createPresident(@RequestBody President newPresident) {
    President president = presidentRepository.save(newPresident);
    if (president == null) {
      return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    } else {
      return new ResponseEntity<>(president, HttpStatus.CREATED);
    }
  }

//https://www.javaguides.net/2018/11/spring-getmapping-postmapping-putmapping-deletemapping-patchmapping.html

  // curl -X DELETE http://localhost:8080/api/presidents/49
  // curl -X DELETE http://localhost:8080/api/presidents/48
  @DeleteMapping("{id}")
  ResponseEntity deletePresident(@PathVariable(value = "id") Long presidentId) {
    President president = presidentRepository.getById(presidentId);
    if (president == null) {
      return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    } else {
      presidentRepository.delete(president);
      // return new ResponseEntity<>(president, HttpStatus.OK);
      return new ResponseEntity<>(null, HttpStatus.OK);
    }
  }

}
