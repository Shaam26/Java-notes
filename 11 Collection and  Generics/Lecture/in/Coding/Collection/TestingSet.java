package in.Coding.Collection;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set <String> names =  new HashSet<>();
        System.out.println(names.add("Shameem"));
        System.out.println(names.add("Sham"));
        System.out.println(names.add("Sha"));

        Utility.print(names);

        System.out.println(names.add("shameem"));
        System.out.println(names.size());
        Utility.print(names);

        System.out.println(names.contains("Shameem"));
        System.out.println(names.remove("Shameem"));
        Utility.print(names);
        System.out.println(names.remove("Shameem"));
    }
}
