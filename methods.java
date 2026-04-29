import java.util.Scanner;
import java.lang.Math;
class Methods{
    // user defined functions
    void name(){
        System.out.println("My name is Sanjay N");
    }
    static void age(int age){
        System.out.println("my age is "+age);
    }
    public static void main(String[] args){
        Methods m1 = new Methods();
        m1.name();
        Methods.age(21);

//predefined functions
        System.out.println("Max : " + Math.max(10,20));

    }
}