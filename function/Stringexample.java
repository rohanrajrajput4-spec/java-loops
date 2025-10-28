package function;

import java.util.Scanner;

public class Stringexample {
    public static void main(String[] args) {


        Scanner in  = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String naam = in.next();
        String personalised = myGreet(naam);
        System.out.println(personalised);
        in.close();
    }
        /*    String message = greet();
       System.out.println(message);
        in.close();
    }*/

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }
}

//  use this when we call the greet() function

   /*  static String greet() {
        String greeting = "how are you";
        return greeting;
    }
    
}*/
