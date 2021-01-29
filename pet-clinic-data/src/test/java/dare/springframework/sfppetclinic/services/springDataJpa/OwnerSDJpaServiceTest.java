package dare.springframework.sfppetclinic.services.springDataJpa;

import dare.springframework.sfppetclinic.repositories.OwnerRepository;
import dare.springframework.sfppetclinic.repositories.PetRepository;
import dare.springframework.sfppetclinic.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {

     @Mock
     OwnerRepository ownerRepository;

     @Mock
     PetRepository petRepository;

     @Mock
     PetTypeRepository petTypeRepository;

     @InjectMocks
     OwnerSDJpaService service;

    @BeforeEach
    void setUp() {
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void findByLastName() {
    }
}