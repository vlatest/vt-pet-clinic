package guru.springframework.vtpetclinic.repositories;

import guru.springframework.vtpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
