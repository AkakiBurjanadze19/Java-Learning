package PART5;

public class Person {
    private String name;
    private int age;
    private Pet pet;
    private int weight;
    private int height;

    public Person(String name, int age, int weight, int height, Pet pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, Pet pet) {
        this(name, 0, 0, 0, pet);
    }

    public Person(String name) {
        this(name, 0, 0, 0, null);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getHeight() {
        return this.height;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public Pet getPet() {
        return this.pet;
    }

    public void setPet(String name, String breed) {
        this.pet = new Pet(name, breed);
    }

    public String toString() {
        return this.name + ", has a friend called " + this.pet.getName() + " (" + this.pet.getBreed() + ")";
    }
}
