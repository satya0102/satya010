import java.util.Scanner;

public class weekdayprinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1 to 7) to get the corresponding day of the week: ");
        int dayNumber = sc.nextInt();

        String day;
      /* 
        if (dayNumber == 1) {
            day = "Monday";
        } else if (dayNumber == 2) {
            day = "Tuesday";
        } else if (dayNumber == 3) {
            day = "Wednesday";
        } else if (dayNumber == 4) {
            day = "Thursday"; // Fixed spelling
        } else if (dayNumber == 5) {
            day = "Friday";
        } else if (dayNumber == 6) {
            day = "Saturday";
        } else if (dayNumber == 7) {
            day = "Sunday";
        } else {
            day = "Enter a valid number (1 to 7).";
        }
        */

        switch(dayNumber){
            case 1:
              day = "monday";
            break;
            case 2:
              day = "tuesday";
            break;
            case 3:
               day = "wednesday";
            break;
            case 4: 
              day = "thursday";
            break;
            case 5:
             day ="friday";
             break;
            case 6: 
            day = "satureday";
            break;
            case 7: 
              day = "sunday";
              break;

            default:
            day = "enter a valid input ";
            break;


        }
        System.out.println(day);

        
        sc.close();
    }
} 
