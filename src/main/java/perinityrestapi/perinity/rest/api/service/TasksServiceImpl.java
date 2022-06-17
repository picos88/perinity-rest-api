package perinityrestapi.perinity.rest.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import perinityrestapi.perinity.rest.api.model.Tasks;
import perinityrestapi.perinity.rest.api.repository.TasksRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TasksServiceImpl implements TasksService{

    @Autowired
    private TasksRepository tasksRepository;

    @Override
    public Tasks save(Tasks tasks) {
        return tasksRepository.save(tasks);
    }

    @Override
    public List<Tasks> findAll() {
        return tasksRepository.findAll();
    }

    @Override
    public Optional<Tasks> findById(Long id) {
        return tasksRepository.findById(id);
    }

    @Override
    public Tasks update(Tasks tasks) {
        return tasksRepository.save(tasks);
    }

    @Override
    public void deleteById(Long id) {
        tasksRepository.deleteById(id);
    }
}
