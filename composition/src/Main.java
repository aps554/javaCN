public class Main {
    public static void main(String[] args) {

        Dimension dimTeacher = new Dimension(76, 55);
        Dimension dimStudent = new Dimension(56, 75);
        Teacher t1 = new Teacher("MathsTeacher", dimTeacher, "Maths", 32);
        Student s1 = new Student("Abhishek", dimStudent, 24, new Marks(98,89,100));

     School sch = new School(t1, s1);
    }

}
