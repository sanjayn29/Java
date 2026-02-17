import java.util.Scanner;
class Userinput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println(a);

        float b = sc.nextFloat();
        System.out.println(b);

        char C = sc.next().charAt(0);
        System.out.println(C);

        sc.nextLine(); // to consume the newline character after nextInt() or nextFloat() or next()

        String d = sc.nextLine();
        System.out.println(d);
    }
}