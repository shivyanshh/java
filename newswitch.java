public class newswitch {
    public static void main(String[] args){
        String day = "monday";
        String result = "";
        result = switch(day){
            case "sunday","saturday"  -> "sleep!!";
            //no need to put break statement if arrow is used
            default -> "7 am";
        };
        System.out.println(result);
    }
    
}
