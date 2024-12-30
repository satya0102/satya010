import java.util.Scanner;
public class taxcalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income: ");
        double income = sc.nextDouble();
        double tax;

        if(income <= 800000 ){
            tax = 0;

        }else if (income <= 1000000 ){
            tax = (income - 800000) * 0.05;
        }else if (income <= 2000000){
            tax = (800000*0.05) + (income - 1000000)*0.1;
        }else{
            tax = (800000 * 0.05) + (1000000 * 0.1) + (income)*0.3;
        }

        System.out.println("tax to paid: " + tax);

        sc.close();
    }
    
}
