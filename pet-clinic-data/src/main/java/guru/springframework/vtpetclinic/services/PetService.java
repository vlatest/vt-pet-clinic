package guru.springframework.vtpetclinic.services;

import guru.springframework.vtpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
