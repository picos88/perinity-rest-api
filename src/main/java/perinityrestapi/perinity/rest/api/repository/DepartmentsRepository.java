package perinityrestapi.perinity.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import perinityrestapi.perinity.rest.api.model.Departments;

public interface DepartmentsRepository extends JpaRepository<Departments, Long> {
}
