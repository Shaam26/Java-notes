import java.util.Scanner;

class PostiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number checker\n");
        System.out.println("please enter your number: ");
        int num = input.nextInt();

        if(num > 0){
            System.out.println("your number is positive");
        } else if(num == 0){
            System.out.println("Your number is Zero");
        } else {
            System.out.println("Your number is negative");
        }

    }
}
