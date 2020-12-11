package dare.springframework.sfppetclinic.repositories;

import dare.springframework.sfppetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
