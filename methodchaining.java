class Methods{
    int a;
    String str;

    Methods display1(int a){
        System.out.println("This is method 1 : "+a);
        return this; //returning current object to enable method chaining
    }
    Methods display2(String str){
        System.out.println("This is method 2 : "+str);
        return this; //returning current object to enable method chaining
    }
    Methods display3(){
        System.out.println("This is method 3 : "+a+" and "+str);
        return this; //returning current object to enable method chaining
    }
}
class Chaining{
    public static void main(String[] args){
        Methods obj = new Methods();
        obj.display1(1).display2("Hello").display3(); //method chaining
    }
}