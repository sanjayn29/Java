final class Finalkeyword{
    final int age = 10;
    final String name = "Sanjay N";

    final void display(){
        System.out.println("Age: " + age + ", Name: " + name);
    }
}
class Finalkeywordtest{
    public static void main(String[] args){
        Finalkeyword obj1 = new Finalkeyword();
        System.out.println("Accessing final variable age: " + obj1.age);
        System.out.println("Accessing final variable name: " + obj1.name);
        obj1.display();
        // obj1.age = 20; //error because age is final variable
        // obj1.name = "Sanjay Navaneethamurali"; //error because name is final variable
    }
}