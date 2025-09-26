import java.util.Scanner;

 class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Simple Interest calculator\n");
        System.out.println("please enter principal Amount Rs: ");
        int p = input.nextInt();
        System.out.println(" Now, tell me your rate of interest: ");
        float r = input.nextFloat();
        System.out.println("Now, tell me for how many years are your borrowing this money: ");
        float t = input.nextFloat();

        float interest = (p * t * r)/100;
        System.out.println("\n\n Simple Interest is Rs: "+ interest);


    }
}
