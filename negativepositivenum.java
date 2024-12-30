import java.util.Scanner; 
public class negativepositivenum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        if(number > 0){
            System.out.println("the number is positive " + number);
        }
        else if(number<0){
            System.out.println("the given number is negative: " + number);
        }
        else{
            System.out.println("the given number is zero: " + number);
        }

        sc.close();

        
    }
    
}
