public class Parameter {
    public static void main(String[] args) {
        System.out.println(sumTwoNumber(4, 7));
        System.out.println(sumTwoNumber(5, 9));
        System.out.println(sumTwoNumber(-67, 67));

    }
    public static int sumTwoNumber(int firstNum,int secondNum){
        int sum =firstNum+secondNum;
        System.out.println("First number received: "+firstNum);
        System.out.println("Second number received: "+secondNum);
        return firstNum+secondNum;

    }
}
