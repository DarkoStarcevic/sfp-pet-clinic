package dare.springframework.sfppetclinic.services;

import dare.springframework.sfppetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
