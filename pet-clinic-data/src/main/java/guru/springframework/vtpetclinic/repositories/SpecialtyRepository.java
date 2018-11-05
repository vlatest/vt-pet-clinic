package guru.springframework.vtpetclinic.repositories;

import guru.springframework.vtpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
