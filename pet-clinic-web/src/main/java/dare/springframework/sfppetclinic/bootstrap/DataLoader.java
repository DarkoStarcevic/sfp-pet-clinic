package dare.springframework.sfppetclinic.bootstrap;

import dare.springframework.sfppetclinic.model.Owner;
import dare.springframework.sfppetclinic.model.Pet;
import dare.springframework.sfppetclinic.model.PetType;
import dare.springframework.sfppetclinic.model.Vet;
import dare.springframework.sfppetclinic.services.OwnerService;
import dare.springframework.sfppetclinic.services.PetTypeService;
import dare.springframework.sfppetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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
        owner1.setAddress("Gandijeva 132");
        owner1.setCity("Belgrade");
        owner1.setTelephone("12345678");

        Pet darkosPet = new Pet();
        darkosPet.setPetType(savedDogPetType);
        darkosPet.setOwner(owner1);
        darkosPet.setBirthDate(LocalDate.now());
        darkosPet.setName("Dona");
        owner1.getPets().add(darkosPet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Djordje");
        owner2.setLastName("Starcevic");
        owner2.setAddress("Gandijeva /59");
        owner2.setCity("Belgrade");
        owner2.setTelephone("04385934893465");

        Pet djoksisCat = new Pet();
        djoksisCat.setPetType(savedCatPetType);
        djoksisCat.setOwner(owner2);
        djoksisCat.setBirthDate(LocalDate.now());
        djoksisCat.setName("Dora");
        owner2.getPets().add(djoksisCat);
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
