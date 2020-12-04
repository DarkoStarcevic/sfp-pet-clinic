package dare.springframework.sfppetclinic.services;

import dare.springframework.sfppetclinic.model.Owner;

public interface OwnerService extends CrudServices<Owner, Long>{

    Owner findByLastName(String lastName);


}
