package perinityrestapi.perinity.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import perinityrestapi.perinity.rest.api.model.Tasks;

public interface TasksRepository extends JpaRepository<Tasks, Long> {
}
