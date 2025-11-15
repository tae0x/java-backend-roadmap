package array;

public class Array1Ref1 {

    public static void main(String[] args) {
        int[] students;
        students = new int[5];

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.println("Student 1: " + students[0]);
        System.out.println("Student 2: " + students[1]);
        System.out.println("Student 3: " + students[2]);
        System.out.println("Student 4: " + students[3]);
        System.out.println("Student 5: " + students[4]);
    }
}
