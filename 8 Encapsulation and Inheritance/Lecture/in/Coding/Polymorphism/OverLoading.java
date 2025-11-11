package in.Coding.Polymorphism;

public class OverLoading {

    OverLoading(){
        System.out.println("Default constructor is called.");
    }

    OverLoading(String pop){
        System.out.println(pop);

    }




    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b,int c,int d){
        return a + b + c + d;
    }

    public String add(String a, String b){
        return a + b;
    }

    public static void main(String[] args) {
        OverLoading overload = new OverLoading();
        int sum = overload.add(3,4,8,9);
        overload.add("a","b");
        System.out.println(overload.add(5,sum));
    }
}
