package in.Kgcoding.Challenge107;

import java.util.List;

public class StreamTest {
    public static void main(String[] args) {


        List<String> names = List.of("Shameem", "Sanchit", "saniya");
        names.stream()
                .forEach(name -> System.out.println(name));

    }
}


