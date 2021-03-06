package dare.springframework.sfppetclinic.model;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "types")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PetType extends BaseEntity {



    @Builder
    public PetType(Long id, String petType){
        super(id);
        this.petType = petType;
    }

    @Column(name = "pet_type")
    private String petType;

    @Override
    public String toString() {
        return petType;
    }
}
