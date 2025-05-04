public class mutability {
    public static void main(String[] args){
        //by default strings are immutable
        String s1= "enma";
        String s2= "enma";
        boolean  x = s1==s2; //both are stored in same place
        System.out.println(x);
        
}
}

