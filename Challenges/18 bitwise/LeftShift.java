import java.util.Scanner;

class LeftShift {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Showcase Left shift operators\n");
         System.out.println("please enter your number: ");
         int num = input.nextInt();

         int result = num << 4;
         System.out.println("Result is: "+result);


     }
}
