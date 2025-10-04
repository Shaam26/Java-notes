public class Array {
    public static void main(String[] args) {
//        int [] myArr = new int[5];
//        myArr[0] = 98;
//        myArr[1] = 88;
//        myArr[2] = 20;
//        myArr[3] = 10;
//        myArr[4] = 6;

        int [] myArr = {98,45,34,23,2,4};
//
//
//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[2]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);
//        System.out.println(myArr[5]);

        int index = 0;
        while( index < myArr.length){
            System.out.println(myArr[index]);
            index++;
        }

        String[] strArr = new String[4];
        strArr[0] = "My String";

        String[] newStrArr = {"first","second","third"};
        System.out.println(newStrArr.length);
    }
}
