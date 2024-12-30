import java.util.Scanner;
public class daysintoyears {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of days: ");
        int totalDays = sc.nextInt();

        int years = totalDays / 365;
        int remainingDaysAfterYears = totalDays % 365;
        int month = remainingDaysAfterYears / 30;
        int remainingDays = remainingDaysAfterYears % 30;

        System.out.println(totalDays + " days is approximately : " + years + " years ," + month + " month , and " + remainingDays + "days ");


        sc.close();




    }
}
