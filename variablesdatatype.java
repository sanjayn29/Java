class VariablesDatatype {
    public static void main(String[] args){

        System.out.println("Primitive DataTypes in Java"); // Hold the Value , Size is fixed 

        int a =10; //a is a variable , int is a datatype
        System.out.println(a);

        float val = 10.01f;
        System.out.println(val);

        double val2=1010.1010;
        System.out.println(val2);

        char ch = 'A';
        char ch2 = 65;
        System.out.println(ch+" "+ch2);

        Boolean flag= true;
        System.out.println(flag);

        Short c = 10;
        Long b = 10000000L;
        System.out.println(a+" "+b);

        byte by = 87;
        System.out.println(by);

        System.out.println("Non - primitive Data Types in Java"); //hold the address , size is not fixed


        String name = "sanjayn"; //String datatype value must be under ""
        String hero = name; //passing the variable 
        System.out.println(hero);
        System.out.println(hero);


    }
}