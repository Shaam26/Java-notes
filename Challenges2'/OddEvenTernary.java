import java.util.Scanner;

class OddEvenTernary {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("welcome to Odd or Even \n");
         System.out.println("please enter your number: ");
         int num = input.nextInt();
         String result = num % 2 == 0 ? " Even":"Odd";
         System.out.println("Your number is: "+result);

     }
}
