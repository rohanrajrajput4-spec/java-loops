import java.util.Scanner;

public class Newsum {
    public static void main(String[] args) {
        Scanner ro = new Scanner(System.in);
    
        int num1 = ro.nextInt();
        int num2 = ro.nextInt();
        int sum = num1 + num2;
        System.out.print("sum = " + sum );
        ro.close();
    }
}

