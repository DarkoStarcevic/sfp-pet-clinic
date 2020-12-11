package dare.springframework.sfppetclinic.repositories;

import dare.springframework.sfppetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
