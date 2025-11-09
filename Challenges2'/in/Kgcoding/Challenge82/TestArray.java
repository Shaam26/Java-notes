package in.Kgcoding.Challenge82;

public class TestArray {
    public static void main(String[] args) {
        ArrayOperations arr = new ArrayOperations(new int[]{1,3,9});
        ArrayOperations.Statistics statistics = arr.new Statistics();
        System.out.println(statistics.mean());
    }
}
