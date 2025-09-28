import java.util.Scanner;

class Grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to grading calculator\n");
        System.out.println("please enter your percentage:  ");
        float percentage  = input.nextFloat();

        if(percentage >= 90){
            System.out.println(" Great, you have got A");
        }else if(percentage >=75){
            System.out.println(" Good,  you have got B");
        }else if(percentage >= 60){
            System.out.println("you have got C, Work hard next time");
        }else if(percentage >= 30){
            System.out.println("You have got D,you seriously need to work hard");
        }else{
            System.out.println("Sorry, you have failed the test and got F");
        }
    }

}
