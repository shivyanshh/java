class mobile{
    String brand;      //instance variables
    int price;
    //String name;       ---->its common in every object


    static String name; //this is a common variable and everyobject will refer to this 

    public void show(){
        System.out.println("brand:"+brand+" price:"+price+" name:"+name);

    }
}
public class static_variable {
    public static void main(String[] args){
        mobile obj = new mobile();
        obj.brand= "apple";
        obj.price = 150000;
        obj.name= "smartphone";

        mobile obj2 = new mobile();
        obj2.brand= "samsung";
        obj2.price = 170000;
        obj2.name= "smartphone";

        obj.name= "phone";

        obj.show();
        obj2.show();





    }
}
