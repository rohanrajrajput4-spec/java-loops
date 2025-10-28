import java.util.Scanner;
import java.util.InputMismatchException;

public class Gpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Please enter some input: ");
            int rollno = input.nextInt();
            System.out.println("Your roll number is " + rollno);
        } catch(InputMismatchException e) {
            System.out.print("ivalid input . please enter integer: ");
        } finally {
            input.close();  // Close the scanner to avoid resource leaks
        }
    }
}

