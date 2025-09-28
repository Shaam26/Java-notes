import java.util.Scanner;

class LeapYear {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to New Year that you want to check");
         System.out.println("please enter the year you want to check:  ");
         int year = input.nextInt();

         if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
             System.out.println("your year is a leap year");
         }else{
             System.out.println("your year is not a leap year");
         }

     }
}
