class StringClass{
    public static void main(String[] args){

        //immutable class
        String str1 = "sanjay";
        System.out.println(str1);

        String str2 = new String("Sanjay");
        System.out.println(str2);

        //Trying to change the value of str2
        // str2.concate("N");
        // System.out.println(str2);

        //The value of str2 is not changed because String is immutable class so i reassign the value of str2 to str2 itself
        str2 = str2.concat("N");
        System.out.println(str2);

        //mutable class
        StringBuffer str3 = new StringBuffer("Ravi");
        System.out.println(str3);
        str3.append("Chandran");
        System.out.println(str3);

        StringBuilder str4 = new StringBuilder("Vaishu");
        System.out.println(str4);
        str4.append("Navi");
        System.out.println(str4);
    }
}