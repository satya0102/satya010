import java.util.Scanner;

public class discountcalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the rate per item: ");
        double rate = sc.nextDouble();
        
        System.out.print("enter the quantity: ");
        int quantity = sc.nextInt();

        double amount = rate * quantity;
         double netAmount = amount;

        if(amount > 2000){
            double discount = amount * 0.15;
            netAmount = amount - discount;

        }

        System.out.printf("the net amount is to be paid is: %.2f rs%n", netAmount);
        sc.close();


    }

    
}
