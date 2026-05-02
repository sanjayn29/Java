enum Roommates{
    SANJAY, VAISHU, RAVI, GOKUL
}
class Enumconstant {
    public static void main(String[] args) {
        Roommates r1 = Roommates.SANJAY;
        Roommates r2 = Roommates.VAISHU;
        Roommates r3 = Roommates.RAVI;
        Roommates r4 = Roommates.GOKUL;

        System.out.println("Roommate 1: " + r1);
        System.out.println("Roommate 2: " + r2);
        System.out.println("Roommate 3: " + r3);
        System.out.println("Roommate 4: " + r4);
    }
}