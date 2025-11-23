package in.Coding.Lambda;

public class TestingLambda {
    public static void main(String[] args) {
        TestingLambda test = new TestingLambda();
        int sum = test.sum(5,7);
        test.printString("Hello World!");


        //toPrint -> System.out.println(toPrint);
        //(a,b) -> a+b;
        //(a,b) -> {
        //  int sum = a+b;
        //System.out.println(sum);
        //}
    }


    public void printString(String toPrint){
        System.out.println(toPrint);
    }

    public int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
}
