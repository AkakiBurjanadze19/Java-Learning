package PART4;

public class TelevisionProgram {
    protected String name;
    protected int duration;

    public TelevisionProgram(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String toString() {
        return name + ", " + duration + " minutes";
    }
}
