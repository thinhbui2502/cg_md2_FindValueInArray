import java.util.Scanner;

public class ValueInArray {
    public static void main(String[] args) {
        String[] students = {"Alex", "Kim Anh", "John", "Tim", "Jim", "Max", "Bean"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name you want to find:");
        String inputName = sc.nextLine();
        boolean isExist = false;

        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println("Position of the students in the list " + inputName + "is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + inputName + " in the list.");
        }

    }
}
