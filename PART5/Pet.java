package PART5;

public class Pet {
    private String name;
    private String breed;

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Pet)) {
            return false;
        }

        Pet comparedPet = (Pet) compared;

        boolean nameEqual =
                (this.name == null && comparedPet.name == null) || (this.name != null && this.name.equals(comparedPet.name));
        boolean breedEqual =
                (this.breed == null && comparedPet.breed == null) || (this.breed != null && this.breed.equals(comparedPet.breed));

        return nameEqual && breedEqual;
    }

    public String toString() {
        return this.name + ", " + this.breed;
    }
}
