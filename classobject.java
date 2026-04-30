class ClassObject{ //class creation
    int age;
    String name;

    public ClassObject(int age, String name){
        this.age = age;
        this.name = name;
    }

    void eat(){
        System.out.println("The dog is eating.");
    }
    void info(){
        System.out.println("The dog's name is " + name + " and it is " + age + " years old.");
    }
}
class Main{
    public static void main(String[] args){
        ClassObject dog1 = new ClassObject(10,"ram"); //object creation
        dog1.eat(); //object method calling
        dog1.info();
    }
}