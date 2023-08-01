import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("------- Calculator -------");

        System.out.println("Entered first value : ");
        String n1 = myObj.next();

        System.out.println("Entered second value : ");
        String n2 = myObj.next();

        int sum = Integer.parseInt(n1) + Integer.parseInt(n2);

        System.out.println("The result is : " + sum);
    }
}