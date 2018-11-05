package guru.springframework.vtpetclinic.repositories;

import guru.springframework.vtpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
