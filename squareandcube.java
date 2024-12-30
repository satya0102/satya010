import java.util.Scanner;
public class squareandcube {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter a number : ");
        double number = sc.nextDouble();

        double square = number*number;
        double cube = number*number*number;

        System.out.println("The square of number is: " + square);
        System.out.println("The cube of number is: " + cube);

        sc.close();
        
    }
}
