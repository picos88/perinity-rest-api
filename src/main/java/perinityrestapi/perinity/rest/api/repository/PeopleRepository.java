package perinityrestapi.perinity.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import perinityrestapi.perinity.rest.api.model.People;

public interface PeopleRepository extends JpaRepository<People, Long> {
}
