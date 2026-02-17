class Typecasting{
    public static void main (String[] args){
        //byte → short → int → long → float → double : Implicit Type
        int a = 10;
        double b = a;
        System.out.println(a);
        System.out.println(b);

        //Explicit Type Casting: bigger → smaller
        int c = (int)b;
        System.out.println(c);

        char d = 'a';
        int e = d;
        System.out.println(e);

    }
}