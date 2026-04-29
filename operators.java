import java.util.Scanner;
class Operators{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Arthimatic operators : "+(a+b)+","+(a-b)+","+(a%b)+"/,*");

        System.out.println("Relation Operators : "+(a>b)+","+(a==b)+","+(a<b)+","+(a!=b)+","+(a>=b)+","+(a<=b));

        System.out.println("Logical operators : "+(a>10 && b>10)+","+(a>10 || b>10));

        a += 10;
        System.out.println("Assignment operators : "+a);

        System.out.println("Unary Operator : "+(a++)+","+(--b));

        System.out.println("Bitwise operators : "+(a&b)+","+(a|b)+","+(a^b)+","+(~a)+","+(a<<2)+","+(a>>2));

        int max = (a>b)?a:b;
        System.out.println("Ternary Operator : "+max);
    }
}