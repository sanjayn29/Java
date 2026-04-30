import java.util.regex.*;
class Regex{
    public static void main(String[] args){
        String name = "sanjaynavaneethamurali@gmail.com";
        boolean valid = name.matches("[a-zA-Z0-9]+@[a-z]+\\.[a-z]+");
        System.out.print(valid);
    }
}