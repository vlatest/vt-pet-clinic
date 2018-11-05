package guru.springframework.vtpetclinic.repositories;

import guru.springframework.vtpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
