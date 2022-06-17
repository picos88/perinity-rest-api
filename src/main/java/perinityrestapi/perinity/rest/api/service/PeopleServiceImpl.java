package perinityrestapi.perinity.rest.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import perinityrestapi.perinity.rest.api.model.People;
import perinityrestapi.perinity.rest.api.repository.PeopleRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PeopleServiceImpl implements PeopleService{

    @Autowired
    private PeopleRepository peopleRepository;

    @Override
    public People save(People people) {
        return peopleRepository.save(people);
    }

    @Override
    public List<People> findAll() {
        return peopleRepository.findAll();
    }

    @Override
    public Optional<People> findById(Long id) {
        return peopleRepository.findById(id);
    }

    @Override
    public People update(People people) {
        return peopleRepository.save(people);
    }

    @Override
    public void deleteById(Long id) {
        peopleRepository.deleteById(id);
    }

}
