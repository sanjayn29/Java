class Staticc{

    int year;
    String degreename;

    Staticc(int year, String degreename){
        this.year = year;
        this.degreename = degreename;
    }

    //static block
    static{
        System.out.println("This is a static block");
    }

    //STATIC VARIABLE
    static String name = "KEC";

    //static method
    static void display(){
        System.out.println("This is a static method");
        System.out.println("Name : "+name);
    }

    static class staticclass{
        void show(){
            System.out.println("This is a static class");
        }
    }
    
    public static void main(String[] args){
            Staticc obj1 = new Staticc(2020, "B.E");
            System.out.println("Year: " + obj1.year + ", Degree Name: " + obj1.degreename);
            Staticc.display(); //calling static method
            Staticc.staticclass obj2 = new Staticc.staticclass(); //creating object of static class
            obj2.show(); //calling method of static class
        }
    
}