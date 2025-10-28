import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // try {
            System.out.print("please enter temp in c: ");
            float tempC = input.nextFloat();
            float tempF = (tempC * 9/5) + 32;
            System.out.println(tempF);
        //  } finally {
            input.close();
         }
    }
    

