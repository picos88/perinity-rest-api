package perinityrestapi.perinity.rest.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import perinityrestapi.perinity.rest.api.model.Departments;
import perinityrestapi.perinity.rest.api.repository.DepartmentsRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentsServiceImpl implements DepartmentsService{

    @Autowired
    private DepartmentsRepository departmentsRepository;

    @Override
    public Departments save(Departments departments) {
        return departmentsRepository.save(departments);
    }

    @Override
    public List<Departments> findAll() {
        return departmentsRepository.findAll();
    }

    @Override
    public Optional<Departments> findById(Long id) {
        return departmentsRepository.findById(id);
    }

    @Override
    public Departments update(Departments departments) {
        return departmentsRepository.save(departments);
    }

    @Override
    public void deleteById(Long id) {
        departmentsRepository.deleteById(id);
    }

}
