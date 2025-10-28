package SwitchStatement;

import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a fruit name: ");
        String Fruit = in.next();

        switch (Fruit) {
            case "Mango":
            System.out.println(" King of Fruit ");
                break;

            case "Grapes":
            System.out.println("sweet fruit");
                break;
            case "Litchi":
            System.out.println("favourite fruit");
                break;

            default:
            System.out.println("Please enter a valid fruit");
            in.close();

            // new way to write switch statement
            
          /*  case "Mango" -> System.out.println(" King of Fruit ");
            case "Grapes" -> System.out.println("sweet fruit");
            case "Litchi" ->System.out.println("favourite fruit");

            default -> System.out.println("Please enter a valid fruit");
        }
            in.close();*/
                
        }
    }
}

