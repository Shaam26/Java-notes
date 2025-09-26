import java.util.Scanner;

public class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("we are doing Float Multiplication");
        System.out.println("please enter first decimal number: ");
        double first = input.nextDouble();
        System.out.println("Now,please enter second decimal number: ");
        double second = input.nextDouble();

//        double mul = first * second;
//        System.out.println("\n Result is: "+mul);

        System.out.println("\n Result is: "+ (first + second));



    }

}
