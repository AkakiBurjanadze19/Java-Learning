package PART6;

public class GradeRegisterUsage {
    public static void main(String[] args) {
        GradeRegister register = new GradeRegister();

        register.addGradeBasedOnPoints(69);
        register.addGradeBasedOnPoints(79);
        register.addGradeBasedOnPoints(81);
        register.addGradeBasedOnPoints(93);

        System.out.println("Average of grades: " + register.averageOfGrades());
        System.out.println("Average of points: " + register.averageOfPoints());
    }
}
