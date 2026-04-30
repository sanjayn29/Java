class AccessModifier{
    int a = 10; //default access modifier
    private int b = 87; //private access modifier
    public int c = 231; //public access modifier
    protected int d = a+b+c; //protected access modifier

    void show(){
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
    }
}
class Modifier{
    public static void main(String[] args){
        AccessModifier obj1 = new AccessModifier();
        System.out.println("Accessing default variable a: " + obj1.a);
        //System.out.println("Accessing private variable b: " + obj1.b); //error because private variable
        System.out.println("Accessing public variable c: " + obj1.c);
        System.out.println("Accessing protected variable d: " + obj1.d);
        obj1.show(); 
    }
}