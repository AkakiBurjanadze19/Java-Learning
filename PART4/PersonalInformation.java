package PART4;

public class PersonalInformation {
    private String firstName;
    private String lastName;
    private long identificationNumber;

    public PersonalInformation(String firstName, String lastName, long identificationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificationNumber = identificationNumber;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}
