package dare.springframework.sfppetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "types")
public class PetType extends BaseEntity {

    @Column(name = "pet_type")
    private String petType;

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }
}
