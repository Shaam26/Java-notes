import java.util.Scanner;

public class PrimeFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to prime number checker");
        System.out.println("please enter the number: ");
        int num = input.nextInt();
        System.out.println("Your number is " + (isPrime(num)? "Prime number" : "Not Prime number"));

    }

    public static boolean isPrime(int num){
        for(int i = 2; i< num;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
