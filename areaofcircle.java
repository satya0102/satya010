import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();

        double circumference = 2*3.14*radius;
        double area = 3.14*radius*radius;

        System.out.println("the circle of circumference is: " + circumference);
        System.out.println("the area of circle is: " + area);
        

        sc.close();
    }
    
}
