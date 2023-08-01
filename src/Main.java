import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("------- Calculator -------");

        System.out.println("Entered first value : ");
        int n1 = Integer.parseInt(myObj.next());

        System.out.println("Entered second value : ");
        int n2 = Integer.parseInt(myObj.next());

        System.out.println("The result is : " + sum(n1, n2));
    }

    public static int sum(int n1, int n2) {
        return n1 + n2;
    }
}