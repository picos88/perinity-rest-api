package perinityrestapi.perinity.rest.api.service;

import perinityrestapi.perinity.rest.api.model.Tasks;

import java.util.List;
import java.util.Optional;

public interface TasksService {

    Tasks save (Tasks tasks);

    List<Tasks> findAll();

    Optional<Tasks> findById(Long id);

    Tasks update(Tasks tasks);

    void deleteById(Long id);
}
