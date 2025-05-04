class math{
    public int add(int n1,int n2){
        return n1 + n2;

    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public double add(double n1, int n2){
        return n1+n2;
    }
    //methods_overloading different type but same name and different no. of parameters
}
public class method_check {
    public static void main(String[] args){
        math obj = new math();
        double result = obj.add(2.09,3);
        System.out.println(result);
    }
    
}
