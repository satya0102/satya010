import java.util.Scanner; 
public class largestnumber {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();
        
        int largest;

        if(number1 >= number2){
            if(number1 >= number3){
                largest = number1;


            }else{
                largest = number3;
            }

        }else{
            if(number2 >= number3){
                largest = number2;
            }else{
                largest = number3;
            }

        }

        System.out.println("the largest number among " + number1 + " ," + number2 +" , and "+ number3 + " is: " + largest);
        sc.close();
    }
    
}
