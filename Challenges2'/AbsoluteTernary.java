import java.util.Scanner;

class AbsoluteTernary {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("welcome to absolute ternary\n");
         System.out.println("please enter your number: ");
         int num = input.nextInt();
         int result = num>= 0? num : -num;
         System.out.println("Absolute  value is: "+result);

     }
}
