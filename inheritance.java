abstract class Animal {

    int x = 10;

    // constructor
    Animal() {
        System.out.println("Animal constructor");
    }

    // abstract method
    abstract void sound();

    // final method (cannot override)
    final void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class
class Dog extends Animal {

    int x = 20;

    Dog() {
        super(); // call parent constructor
        System.out.println("Dog constructor");
    }

    // method overriding
    void sound() {
        System.out.println("Dog barks");
    }

    void show() {
        System.out.println("Parent x: " + super.x);
        System.out.println("Child x: " + x);
    }
}

// Multilevel inheritance
class Puppy extends Dog {

    Puppy() {
        System.out.println("Puppy constructor");
    }

    void play() {
        System.out.println("Puppy plays");
    }
}

// Another class for hierarchical example
class Cat extends Animal {

    void sound() {
        System.out.println("Cat meows");
    }
}

class Main {
    public static void main(String[] args) {

        // Dynamic Method Dispatch
        Animal a = new Dog();
        a.sound();   // runtime polymorphism
        a.eat();     // final method

        System.out.println("-----");

        // Multilevel Inheritance
        Puppy p = new Puppy();
        p.sound();
        p.play();
        p.show();

        System.out.println("-----");

        // Hierarchical Inheritance
        Animal c = new Cat();
        c.sound();
    }
}