package guru.springframework.vtpetclinic.model;

public class PetType extends BaseEntity {

    private String name;

    public PetType(String name) {
        this.name = name;
    }
}
