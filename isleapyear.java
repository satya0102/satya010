import java.util.Scanner;
public class isleapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the year: ");
        int year = sc.nextInt();

    
      boolean isleapyear = false;
      
      if((year % 4 == 0 && year % 100 != 0 ) || (year % 400 ==0)){

        isleapyear = true;
      }
      if(isleapyear){
        System.out.println(year + "is a leap year " );

      }else{
        System.out.println(year + "is not leap year.");

      }


      sc.close();


    }
    
}
