interface room210{

    int sizee = 4; //by default, variables in an interface are public, static and final

    void roommates(); //by default, methods in an interface are public and abstract

    default void display(){
        System.out.println("This is a default method in the interface.");
    }

    static void show(){
        System.out.println("This is a static method in the interface.");
    }

}

interface room209{
    void friends();
}

class hostel implements room210, room209{
    
    public void roommates(){
        System.out.println("I have 3 roommates in room 210.");
    }

    public void friends(){
        System.out.println("I have many friends in room 209.");
    }

    public static void main(String[] args){
        hostel obj = new hostel();
        obj.roommates();
        obj.friends();
        obj.display(); //calling default method
        room210.show(); //calling static method
    }
}