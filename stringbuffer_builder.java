public class stringbuffer_builder {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("shivyansh");
        sb.append(" singh chauhan");
        sb.append(9);
        sb.delete(2, 03);
        sb.insert(0,"java ");
        System.out.println(sb);
        
        
        
        String name = sb.toString();
        System.out.println(name);
    }
}