package dare.springframework.sfppetclinic.repositories;

import dare.springframework.sfppetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
