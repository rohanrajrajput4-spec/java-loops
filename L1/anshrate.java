import java.util.Scanner;

public class anshrate{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("please enter ansh rate; ");
        int rate = in.nextInt();
        if (rate>=50) {
            System.out.print("seal pack and doodh free");
            
        } else if(rate>=10) {
            System.out.println("only seal pack");
        } else {
            System.err.println("chudi raand");
        }
            in.close();

            
        }


    }