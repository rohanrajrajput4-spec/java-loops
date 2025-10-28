package condition;

import java.util.Scanner;

public class CaseCheck {
        public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print(" please enter a Alphabet : ");

        char ch = in.next().trim().charAt(0);
        String result; // comment the result word for using lower comment

        System.out.print(ch + " is a ");

        if (ch >= 'a' && ch <= 'z') {
            result = "kowercase";
            // System.out.println("Lowercase");
        } else {
            result = "uppercase";
            // System.out.println("Uppercase");
        }
        System.out.println(result);
        in.close();
    }
}

