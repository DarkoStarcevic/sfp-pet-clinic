package dare.springframework.sfppetclinic.repositories;

import dare.springframework.sfppetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
