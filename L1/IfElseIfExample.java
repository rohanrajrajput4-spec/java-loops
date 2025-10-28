import java.util.Scanner;

public class IfElseIfExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" Please enter number: ");
        int marks = in.nextInt();
        // String result;

        // if (marks >= 90) {
        //     result = " Grade A ";
        // } else if (marks >= 75) {
        //     result = " Grade B ";

        // } else if (marks >= 50) {
        //     result = " Grade C ";
        // } else {
        //     result = " Grade F ";

        // }
        // System.out.println(result);
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
        in.close();
    }
}

