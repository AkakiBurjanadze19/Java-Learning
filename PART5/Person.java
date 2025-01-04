package PART5;

public class Person {
    private String name;
    private int age;
    private Pet pet;
    SimpleDate date;
    private int weight;
    private int height;

    public Person(String name, int age, int weight, int height, Pet pet, SimpleDate date) {
        this.name = name;
        this.age = age;
        this.pet = pet;
        this.date = date;
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, int weight, int height, SimpleDate date) {
        this(name, 0, weight, height, null, date);
    }

    public Person(String name, Pet pet) {
        this(name, 0, 0, 0, pet, null);
    }

    public Person(String name) {
        this(name, 0, 0, 0, null, null);
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

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Person)) {
            return false;
        }

        Person comparedPerson = (Person) compared;

        // compare primitive fields
        boolean nameEqual =
                (this.name == null && comparedPerson.name == null || this.name != null && this.name.equals(comparedPerson.name));
        boolean ageEqual = this.age == comparedPerson.age;
        boolean weightEqual = this.weight == comparedPerson.weight;
        boolean heightEqual = this.height == comparedPerson.height;

        // compare pet objects
        boolean petsEqual =
                (this.pet == null && comparedPerson.pet == null) || (this.pet != null && comparedPerson.pet != null && this.pet.equals(comparedPerson.pet));

        // compare date objects
        boolean datesEqual =
                (this.date == null && comparedPerson.date == null) || (this.date != null && comparedPerson.date != null && this.date.equals(comparedPerson.date));


        return nameEqual && ageEqual && weightEqual && heightEqual && petsEqual && datesEqual;
    }

    public String toString() {
        return this.name + ", has a friend called " + this.pet.getName() + " (" + this.pet.getBreed() + ")";
    }
}
