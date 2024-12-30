import java.util.Scanner;
public class evenodd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = sc.nextInt();

        if(number%2 == 0){
            System.out.println("the number is even ");
        }else{
            System.out.println("the number is odd ");
        }

        sc.close();
    }
    

    
}
