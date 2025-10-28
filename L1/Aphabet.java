public class Aphabet {

    public static void main(String[] args) {
      char ch = 'A';

      if (Character.isUpperCase(ch)) {
        System.out.println( ch + " is uppercase ");
        
      } else if (Character.isLowerCase(ch)) {
        System.out.println( ch + " is Lowecase ");

      } else {
        System.out.println( ch + " is not a Alphabet ");
      }
        
      }
    }

