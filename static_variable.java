class mobile{
    String brand;
    int price;
    String name;
    public void show(){
        System.out.println(brand+":"+ price + ":"+name);
    }
}
public class static_variable {
    public static void main(String[] args){
        mobile obj1 = new mobile();
        obj1.brand="apple";
        obj1.price=1500;
        obj1.name="smart phone";

        mobile obj2 = new mobile();
        obj2.brand="samsung";
        obj2.price=1700;
        obj2.name="smart phone";
        obj1.show();
        obj2.show();
        

    }
}
