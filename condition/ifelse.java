package condition;

public class ifelse {
    public static void main(String[] args) {
        int salary = 25000;
        if ( salary > 10000 ){
            salary = salary + 5000;
        } else {
            salary += 2000;
        }
            System.out.println( salary );
    }
}
