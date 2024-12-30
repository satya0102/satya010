import java.util.Scanner;
public class largestoftwonum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();

        if(firstNumber > secondNumber){
            System.out.println("first number is largest: ");

        }else if(firstNumber < secondNumber){
            System.out.println("second number is largest: ");

        }else{
            System.out.println("both the number is equal: ");
        }
     sc.close();
    }

    
}
