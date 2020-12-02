package dare.springframework.sfppetclinic.services;

import dare.springframework.sfppetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner>findAll();

}
