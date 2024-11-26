package PART4;

public class Agent {
    private String firstName;
    public String lastName;

    public Agent(String firstname, String lastname) {
        this.firstName = firstname;
        this.lastName = lastname;
    }

    public String toString() {
        return "My name is " + this.firstName + ", " + this.firstName + " " +  this.lastName;
    }
}
