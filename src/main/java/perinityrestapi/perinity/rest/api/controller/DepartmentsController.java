package perinityrestapi.perinity.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import perinityrestapi.perinity.rest.api.model.Departments;
import perinityrestapi.perinity.rest.api.service.DepartmentsService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/departments")

public class DepartmentsController {

    @Autowired
    private DepartmentsService departmentsService;

    @GetMapping
    public ResponseEntity<List<Departments>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(departmentsService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Departments>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(departmentsService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Departments> create(@RequestBody Departments departments){
        return ResponseEntity.status(HttpStatus.CREATED).body(departmentsService.save(departments));
    }

    @PutMapping
    public ResponseEntity<Departments> update(@RequestBody Departments departments){
        return ResponseEntity.status(HttpStatus.OK).body(departmentsService.update(departments));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        departmentsService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
