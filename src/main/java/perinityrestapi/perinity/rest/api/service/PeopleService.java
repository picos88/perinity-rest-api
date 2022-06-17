package perinityrestapi.perinity.rest.api.service;

import perinityrestapi.perinity.rest.api.model.People;

import java.util.List;
import java.util.Optional;

public interface PeopleService {

    People save(People people);

    List<People> findAll();

    Optional<People> findById(Long id);

    People update(People people);

    void deleteById(Long id);
}
