import java.util.Scanner;

class RightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Showcase Right shift operators\n");
        System.out.println("please enter your number: ");
        int num = input.nextInt();

        int result = num >> 1;
        System.out.println("Result is: "+result);


    }
}
