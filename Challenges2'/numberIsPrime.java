import java.util.Scanner;

class numberIsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to prime number checker\n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if(isPrime) {
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }

    }
    public static boolean isPrime(int num){
        int i =2;
        while(i < num){
            if(num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
