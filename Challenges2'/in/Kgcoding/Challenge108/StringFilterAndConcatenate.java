package in.Kgcoding.Challenge108;

import java.util.Arrays;
import java.util.List;

public class StringFilterAndConcatenate {
    public static void main(String[] args) {
        List<String> strs = List.of("Shameem Banu","Banu","is a good girl","in her family","and her mom loves her soo much");

        String result = strs.stream()
                .filter(str-> str.length() > 10)
                .reduce("",(a,b) -> a + " " + b);
        System.out.println(result);

    }
}
