package guru.springframework.vtpetclinic.services;

import guru.springframework.vtpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

}
