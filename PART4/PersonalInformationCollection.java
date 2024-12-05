package PART4;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PersonalInformation> personsInfoCollection = new ArrayList<>();

        while (true) {
            System.out.print("Enter first name of the person: ");
            String firstName = scanner.nextLine();

            if (firstName.isEmpty()) {
                break;
            }

            System.out.print("Enter last name of the person: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter identification number of the person: ");
            long identificationNumber = Long.parseLong(scanner.nextLine());

            personsInfoCollection.add(new PersonalInformation(firstName, lastName, identificationNumber));
        }

        System.out.println();
        System.out.println("Information of the persons: ");

        for (int i = 0; i < personsInfoCollection.size(); i++) {
            System.out.println(personsInfoCollection.get(i));
        }
    }
}
