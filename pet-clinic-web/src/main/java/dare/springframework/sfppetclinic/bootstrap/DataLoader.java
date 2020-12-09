package dare.springframework.sfppetclinic.bootstrap;

import dare.springframework.sfppetclinic.model.Owner;
import dare.springframework.sfppetclinic.model.PetType;
import dare.springframework.sfppetclinic.model.Vet;
import dare.springframework.sfppetclinic.services.OwnerService;
import dare.springframework.sfppetclinic.services.PetTypeService;
import dare.springframework.sfppetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setPetType("Dog");
        PetType savedDogPetType = petTypeService.save(dog);
        // petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setPetType("Cat");
        PetType savedCatPetType = petTypeService.save(cat);
       // petTypeService.save(cat);

        System.out.println("Loaded pets ....");


        Owner owner1 = new Owner();
        owner1.setFirstName("Darko");
        owner1.setLastName("Starcevic");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Djordje");
        owner2.setLastName("Starcevic");

        ownerService.save(owner2);

        System.out.println("Loaded owners ....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Mladen");
        vet1.setLastName("Lazic");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Masa");
        vet2.setLastName("Lazic");

        vetService.save(vet2);

        System.out.println("Loaded vets ....");


    }
}
