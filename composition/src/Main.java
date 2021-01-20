import java.util.ArrayList;

public class Main {

//    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

//        Dimension dimTeacher = new Dimension(76, 55);
//        Dimension dimStudent = new Dimension(56, 75);
//        Teacher t1 = new Teacher("MathsTeacher", dimTeacher, "Maths", 32);
//        Student s1 = new Student("Abhishek", dimStudent, 24, new Marks(98, 89, 100));
//
//        School sch = new School(t1, s1);
//
//        sch.getStudent().getMarks().setMaths(45);

        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] brr = arr;
        printArr(arr);
        printArr(brr);
        modify(arr);
        printArr(arr);
        printArr(brr);
        brr = new int[]{5, 5, 5, 5, 5};
        printArr(arr);
        printArr(brr);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(45);
        list.add(63);
        list.add(645);
        list.add(46);
        list.add(226);
        list.add(2546);
//        list
        System.out.println(list.toString());
        list.add(7,123);
        System.out.println(list.toString());
    }

    private static void modify(int[] arr) {
        arr[2] = 4;
    }

    private static void printArr(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

}
