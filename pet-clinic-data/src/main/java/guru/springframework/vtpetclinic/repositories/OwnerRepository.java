package guru.springframework.vtpetclinic.repositories;

import guru.springframework.vtpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
