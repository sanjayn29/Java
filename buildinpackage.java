import java.util.*;
class Buildinpackage{
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        a = sc.nextInt();
        System.out.println("The number you entered is : " + a);

        Random rand = new Random();
        System.out.println("Random number : "+rand.nextInt(10));
        System.out.println("Random number : "+rand.nextFloat(10));
        System.out.println("Random number : "+rand.nextDouble(10));

    }
}