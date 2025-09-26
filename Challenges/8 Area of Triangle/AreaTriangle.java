import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Area Calculator");
        System.out.println("Please Enter base in cms:  ");
        double base = input.nextDouble();
        System.out.println("Now,please enter height in cms: ");
        double height = input.nextDouble();

        double area = (base * height)/2;
        System.out.println("The area of your triangle is: "+area+"cms2");
    }
}
