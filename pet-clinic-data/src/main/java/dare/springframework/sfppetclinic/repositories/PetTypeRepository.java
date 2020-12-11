package dare.springframework.sfppetclinic.repositories;

import dare.springframework.sfppetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
