class Nesteadclass{
    class innerclass1{ //non static inner class
        void display(){
            System.out.println("This is inner class 1");
        }
    }
    static class innerclass2{ //static inner class
        void show(){
            System.out.println("This is inner class 2");
        }
    }

    public static void main(String[] args){
        Nesteadclass obj1 = new Nesteadclass();
        innerclass1 obj2 = obj1.new innerclass1();  //creating object of non static inner class
        obj2.display(); //calling method of non static inner class

        innerclass2 obj3 = new innerclass2(); //creating object of static inner class
        obj3.show(); //calling method of static inner class
    }
}