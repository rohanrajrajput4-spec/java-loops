package condition;

import java.util.Scanner;

public class Largestno{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter 3 numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        int max = 0;
        if (a > b){
            max = a;
        } else {
            max = b;
        }
        if (c > b){
            max = c;
        }
        System.out.println("largest no. is " + max);
        in.close();
    }
}
