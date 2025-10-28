import java.util.Scanner;
//import java.util.InputMismatchException;

public class Roll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter some input: ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is " + rollno);
    //catch (InputMismatchException e) {
        //System.out.println("Invalid input. Please enter an integer.");   
    input.close();
    }
}

