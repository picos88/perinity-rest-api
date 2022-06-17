package perinityrestapi.perinity.rest.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import perinityrestapi.perinity.rest.api.model.Departments;
import perinityrestapi.perinity.rest.api.repository.DepartmentsRepository;

import java.util.List;
import java.util.Optional;

public interface DepartmentsService {

    Departments save(Departments departments);

    List<Departments> findAll();

    Optional<Departments> findById(Long id);

    Departments update(Departments departments);

    void deleteById(Long id);

}