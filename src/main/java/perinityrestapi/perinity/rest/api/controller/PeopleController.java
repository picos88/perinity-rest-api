package perinityrestapi.perinity.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import perinityrestapi.perinity.rest.api.model.People;
import perinityrestapi.perinity.rest.api.service.PeopleService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/people")

public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @GetMapping
    public ResponseEntity<List<People>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(peopleService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<People>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(peopleService.findById(id));
    }

    @PostMapping
    public ResponseEntity<People> create(@RequestBody People people){
        return ResponseEntity.status(HttpStatus.CREATED).body(peopleService.save(people));
    }

    @PutMapping
    public ResponseEntity<People> update(@RequestBody People people){
        return ResponseEntity.status(HttpStatus.OK).body(peopleService.update(people));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        peopleService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
