package in.Kgcoding.Challenge89;

 class VarArgs {
     public static void main(String[] args) {
         System.out.println(concatenate("Shameem"));
         System.out.println(concatenate("shameem","Banu"));
         System.out.println(concatenate("This", "is","meh"));
     }
    public static String concatenate(String...strs){
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str).append(" ");
        }
        return sb.toString();

    }
}
