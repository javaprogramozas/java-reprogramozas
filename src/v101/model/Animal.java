package v101.model;

public class Animal {

    private String name;

    private AnimalType animalType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnimalType getType() {
        return animalType;
    }

    public void setType(AnimalType animalType) {
        this.animalType = animalType;
    }
}
