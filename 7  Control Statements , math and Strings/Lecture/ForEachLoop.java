public class ForEachLoop {
    public static void main(String[] args) {
        String[] arr = new String[]{
                "Ram","Shyam","Mohan","Shaam"
        };
//        printArray(arr);
        printArrayForEach(arr);
    }

    public static void printArrayForEach(String[] array){
        for(String name:array){
            System.out.println(name);
        }
    }


    public static void printArray(String[] array){
        for(int i =0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
