package PART4;

import java.util.ArrayList;
import java.util.Scanner;

public class TelevisionPrograms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TelevisionProgram> televisionPrograms = new ArrayList<>();

        while (true) {
            System.out.print("Name: ");
            String programName = scanner.nextLine();

            if (programName.isEmpty()) {
                break;
            }

            System.out.print("Duration: ");
            int programDuration = Integer.parseInt(scanner.nextLine());

            televisionPrograms.add(new TelevisionProgram(programName, programDuration));
        }

        System.out.print("Program's maximum duration? ");
        int maxDuration = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < televisionPrograms.size(); i++) {
            TelevisionProgram program = televisionPrograms.get(i);
            if (program.duration <= maxDuration) {
                System.out.println(program);
            }
        }
    }
}
