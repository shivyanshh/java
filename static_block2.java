public class static_block2 {
    static int number;

    // Static block
    static {
        number = 100;
        System.out.println("Static block executed.");
    
    }

    public static void main(String[] args) {
        number = 200;
        System.out.println("Main method started.");
        System.out.println("Value of number: " + number);
    }
}
