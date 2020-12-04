package dare.springframework.sfppetclinic.services.map;

import dare.springframework.sfppetclinic.model.Vet;
import dare.springframework.sfppetclinic.services.CrudServices;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudServices<Vet, Long> {


    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
