import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        while(1 == 1){
            System.out.println("------- Calculator -------");
            System.out.println("If you want leave, type it 'Close'");

            System.out.println("Entered first value : ");
            String n1 = myObj.next();
            if(n1.equals("Close")) { System.exit(0); }

            System.out.println("Entered second value : ");
            String n2 = myObj.next();
            if(n2.equals("Close")) { System.exit(0); }

            System.out.println("The result is : " + sum(n1, n2));
        }
    }

    public static int sum(String n1, String n2) {
        return Integer.parseInt(n1) + Integer.parseInt(n2);
    }
}