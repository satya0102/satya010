import java.util.Scanner;
public class printdigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a four-digit number: ");
        int number = sc.nextInt();

        if(number < 1000 || number > 9999){
            System.out.println("please enter a valid number: ");

        }else{
            int thousands = number / 1000;
            int hundreds = (number/100) % 10;
            int tens = (number / 10) % 10;
            int units = number % 10;

            System.out.println("the digit of the number are: ");
            System.out.println("thousand: " + thousands);
            System.out.println("tens: " + tens);
            System.out.println("units: " + units);
        }

        sc.close();


    }
}
