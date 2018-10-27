package guru.springframework.vtpetclinic.services;

import java.util.Set;

public interface Vet {

    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
