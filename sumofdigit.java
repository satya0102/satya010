import java.util.Scanner;
public class sumofdigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        int number = sc.nextInt();

        if(number < 100 || number > 999){
            System.out.println("please inter a three-digit valid number: ");

        } else {
            int firstDigit = number / 100;
            int lastDigit = number % 10;

            int sum = firstDigit + lastDigit;

            System.out.println("the sum of three-digit number is: " + sum);
            sc.close();


        }
    }
    
}
