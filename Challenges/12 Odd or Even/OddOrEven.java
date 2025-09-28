import java.util.Scanner;

class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Even calculator\n");
        System.out.println("please enter your number: ");
        int num = input.nextInt();

        if(num % 2==0){
            System.out.println("Your number is an  Even number");
        }else {
            System.out.println("your number is a odd number ");
        }


    }
}
