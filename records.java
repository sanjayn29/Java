record room210(String name, int rollno) { }

class records {
    public static void main(String[] args) {
        room210 r0 = new room210("vaishu", 231);
        room210 r1 = new room210("Sanjay", 87);
        room210 r2 = new room210("ravi", 75);
        room210 r3 = new room210("gokul", 90);
        System.out.println(r0.name()+ " "+r0.rollno());
        System.out.println(r1.name()+ " "+r1.rollno());
        System.out.println(r2.name()+ " "+r2.rollno());
        System.out.println(r3.name()+ " "+r3.rollno());
    }
}