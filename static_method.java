public class static_method {
    public static void main(String[] args){
        mobile obj = new mobile();
        obj.brand= "apple";
        obj.price = 150000;
        mobile.name= "smartphone";

        mobile obj2 = new mobile();
        obj2.brand= "samsung";
        obj2.price = 170000;
        mobile.name= "smartphone";

        mobile.name= "phone"; 

        obj.show();
        obj2.show();

        





    }
}
class mobile{
    String brand;      //instance variables
    int price;
    //String name;       ---->its common in every object


    static String name; //this is a common variable and everyobject will refer to this 

    public void show(){
        System.out.println("brand:"+brand+" price:"+price+" name:"+name);

    }//a non static method
    public static void show1(mobile obj){
        System.out.println("brand:"+obj.brand+" price:"+obj.price+" name:"+name);  // u camt put non static variables in static method 
    }//only when u put a reference
}
