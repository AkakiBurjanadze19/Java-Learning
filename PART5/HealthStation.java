package PART5;

public class HealthStation {
    private int weighings;

    public HealthStation() {
        this.weighings = 0;
    }

    public int weigh(Person person) {
        this.weighings++;
        return person.getWeight();
    }

    public void feed(Person person) {
        int weight = person.getWeight();
        weight++;
        person.setWeight(weight);
    }
}
