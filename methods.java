class method{
    public String getmePEN(int cost){
        if(cost>=10){
            return "your pen";
        
        }
        else{
            return "no pen";
        }
        
    }

}
public class methods {
    public static void main(String[]args){
        method mypen = new method(); //reference variable
        String whtabtmypen = mypen.getmePEN(2);
        System.out.println(whtabtmypen);
    }
     

}
