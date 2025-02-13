package PART6;

import java.util.ArrayList;
import java.util.List;

public class GradeRegister {
    private List<Integer> grades;
    private List<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }

    public int pointsToGrade(int points) {
        int grade;

        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }

        return this.average(this.grades);
    }

    public double averageOfPoints() {
        if (this.points.isEmpty()) {
            return -1;
        }

        return this.average(this.points);
    }

    private double average(List<Integer> list) {
        int total = 0;

        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }

        double average = 1.0 * total / list.size();
        return average;
    }
}
