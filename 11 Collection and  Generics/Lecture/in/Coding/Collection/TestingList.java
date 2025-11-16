package in.Coding.Collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List <String> strList = new ArrayList<>();
        strList.add("Shameem");
        strList.add("Banu");
        //strList.add = 55;

        strList.add(1,"Hassan");
        //strList.remove(0);


        if(strList.contains("Banu")){
            System.out.println(strList.indexOf("Banu exists"));
        }

        for (int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i));
        }
        for(String str :strList){
            System.out.println(str);
        }
    }
}
