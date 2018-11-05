package guru.springframework.vtpetclinic.repositories;

import guru.springframework.vtpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
