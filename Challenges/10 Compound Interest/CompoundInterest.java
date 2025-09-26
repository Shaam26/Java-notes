import java.util.Scanner;

class CompoundInterest {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Compound Interest Calculator\n");
         System.out.println("please tell Principle Amount Rs: ");
         int P = input.nextInt();
         System.out.println("Now, tell your Rate of interest: ");
         float R = input.nextFloat();
         System.out.println("Now,Tell how much time required: ");
         float t = input.nextFloat();

         double CI = P * Math.pow(( 1 + R/100), t);
         System.out.println("your compound interest is Rs: "+CI);

     }
}
