package in.Coding.map;

import java.util.HashMap;
import java.util.Map;

public class TestingMaps {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();
        map.put("Shameem",34);
        map.put("Sanchit",24);
        map.put("Ramla",24);
        map.put("sohan",0);


        System.out.println(map.size());
        System.out.println(map.get("Shameem"));
        System.out.println(map.containsKey("Ramla"));
        System.out.println(map.containsKey("Geeta"));
        System.out.println(map.remove("sohan"));
        System.out.println(map.size());

        for(String key : map.keySet()){
            System.out.printf("%s : %s",key,map.get(key));
        }
    }
}
