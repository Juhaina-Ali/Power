import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter number : ");
        double num = read.nextDouble();

        System.out.println("Enter power : ");
        int pow = read.nextInt();

        System.out.println("Result = "+(Math.pow(num,pow)));
    }
}