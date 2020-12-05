package dare.springframework.sfppetclinic.bootstrap;

import dare.springframework.sfppetclinic.model.Owner;
import dare.springframework.sfppetclinic.model.Vet;
import dare.springframework.sfppetclinic.services.OwnerService;
import dare.springframework.sfppetclinic.services.VetService;
import dare.springframework.sfppetclinic.services.map.OwnerServiceMap;
import dare.springframework.sfppetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();

    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Darko");
        owner1.setLastName("Starcevic");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Djordje");
        owner2.setLastName("Starcevic");

        ownerService.save(owner2);

        System.out.println("Loaded owners ....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Mladen");
        vet1.setLastName("Lazic");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Masa");
        vet2.setLastName("Lazic");

        vetService.save(vet2);

        System.out.println("Loaded vets ....");


    }
}
