class calculator{
    public int add(int numerical1,int numerical2)
    {
        System.out.println(numerical1+numerical2);
        return 0;
    }
}
public class class_object {
    public static void main(String[] args){

        int num1= 6;
        int num2 = 4;

        calculator calc = new calculator();
        int output = calc.add(num1,num2);
        System.out.println(output);
    }
}
