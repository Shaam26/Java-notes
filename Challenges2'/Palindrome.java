import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Number\n");
        System.out.print("Please enter the number: ");
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if(isPalindrome){
            System.out.println("your number is a Palindrome");
        }
        else{
            System.out.println("your number is  not a palindrome");
        }


}
public static  boolean isPalindrome(int num){
        int reverse = reverse(num);
        return num == reverse;
}
public static int reverse(int num ){
        int newNum = 0;
        while(num > 0){
            int digits = num% 10;
            newNum = newNum * 10 + digits;
            num /=10;
        }
        return newNum;
}
}