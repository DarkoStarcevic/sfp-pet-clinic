package dare.springframework.sfppetclinic.bootstrap;

import dare.springframework.sfppetclinic.model.*;
import dare.springframework.sfppetclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
                      SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if(count == 0){
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setPetType("Dog");
        PetType savedDogPetType = petTypeService.save(dog);
        // petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setPetType("Cat");
        PetType savedCatPetType = petTypeService.save(cat);
        // petTypeService.save(cat);

        System.out.println("Loaded pets ....");

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);


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

        Visit dogVisit = new Visit();
        dogVisit.setPet(darkosPet);
        dogVisit.setDate(LocalDate.now());
        dogVisit.setDescription("Vaccination");

        visitService.save(dogVisit);

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
        vet1.getSpecialities().add(savedSurgery);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Masa");
        vet2.setLastName("Lazic");
        vet2.getSpecialities().add(savedDentistry);

        vetService.save(vet2);

        System.out.println("Loaded vets ....");
    }
}
