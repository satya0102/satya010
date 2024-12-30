import java.util.Scanner;
public class squareofmiddledigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.print("enter a three-digit number: ");
        
        int number = sc.nextInt();

        if(number < 100 || number > 999){
            System.out.println("please enter a valid three-digit number ");

        }else{
            int middleDigit = (number / 10) % 10;
            int square = middleDigit*middleDigit;

            System.out.println("the square of the middledigit ("+ middleDigit + ") is: " + square);

        }
        sc.close();
    }
    
}
