public class Student  extends Person{
    private int rollNumber;
    private Marks marks;

    public Student(String name, Dimension dim, int rollNumber, Marks marks) {
        super(name, dim);
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public Marks getMarks() {
        return marks;
    }
}
