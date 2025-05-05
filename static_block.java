public class static_block {
    public static void main(String[] args){
        mobile obj = new mobile();
        obj.brand="apple";
        obj.price=1500;
        mobile.name="smart phone";

        demo obj1 = new demo();
    }


}

class mobile{
    String brand ;
    int price;
    static String name;
    

    static {
        String name = "phone";
        System.out.println("in static block");

         
    }
    
    public mobile(){
        brand ="";
        price=200;
        System.out.println("in constructor");
    }
    public void show(){
        System.out.println(brand+":"+price+":"+name);
    }

}

