import java.util.Scanner;

public class Arithmetic2 {
    public static void main(String[] args) {
        System.out.println("welcome to arithmetic calculator\n");
        Scanner input = new Scanner(System.in);
        System.out.print("please Enter first number: ");
        int first = input.nextInt();
        System.out.print("Now,pleas Enter second number: ");
        int second = input.nextInt();

        int add = first + second;
        int Sub = first - second;
        int mul = first * second;
        int div = first / second;
        int mod = first % second;
        System.out.println("Addition is: "+ add);
        System.out.println("substraction is : "+ Sub);
        System.out.println("Multiplication is: "+mul);
        System.out.println("Division is: "+ div);
        System.out.println("Modulus is: "+mod);



    }
}
