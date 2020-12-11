package dare.springframework.sfppetclinic.repositories;

import dare.springframework.sfppetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);


}
