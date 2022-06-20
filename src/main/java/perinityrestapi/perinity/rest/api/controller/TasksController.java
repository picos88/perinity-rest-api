package perinityrestapi.perinity.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import perinityrestapi.perinity.rest.api.model.Tasks;
import perinityrestapi.perinity.rest.api.service.TasksService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/tasks")

public class TasksController {

    @Autowired
    private TasksService tasksService;

    @GetMapping
    public ResponseEntity<List<Tasks>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(tasksService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Tasks>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(tasksService.findById(id));
    }

    @PostMapping("tasks")
    public ResponseEntity<Tasks> create(@RequestBody Tasks tasks){
        return ResponseEntity.status(HttpStatus.CREATED).body(tasksService.save(tasks));
    }

    @PutMapping("tasks/allocate/{id}")
    public ResponseEntity<Tasks> update(@RequestBody Tasks tasks){
        return ResponseEntity.status(HttpStatus.OK).body(tasksService.update(tasks));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        tasksService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
