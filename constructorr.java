class Constructorr{
    String name;
    int age;

    Constructorr(){
        System.out.println("This is a default constructor");
    }

    Constructorr (String name){
        this.name = name;
        System.out.println("This is a parameterized constructor");
    }

    private Constructorr(int age , String name){
        this.age = age;
        this.name = name;
        System.out.println("This is a private constructor");
    }

    public static Constructorr constructorcall(){
        return new Constructorr(5, "Bob"); //calling private constructor
    }

    Constructorr(Constructorr obj){
        this.name = obj.name;
        this.age = obj.age;
        System.out.println("This is a copy constructor");
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Constructorcalling{
    public static void main(String[] args){
        Constructorr obj1 = new Constructorr(); //default constructor
        Constructorr obj2 = new Constructorr("Alice"); //parameterized constructor
        Constructorr obj3 = Constructorr.constructorcall(); //calling static method to create object with private constructor
        Constructorr obj4 = new Constructorr(obj3); //copy constructor
    }
}