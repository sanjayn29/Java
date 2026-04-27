import java.util.Scanner;
class Strings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Name1 ;
        String Name2;
        String Name3;
        System.out.println("Enter the names");
        Name1 = sc.nextLine();
        Name2 = sc.nextLine();
        Name3 = sc.nextLine();
        System.out.println(Name1+" "+Name2+" "+Name3);

        //length functions
        System.out.println("len: "+Name1.length());

        //Uppercase
        System.out.println("Uppercase"+Name1.toUpperCase());

        //lowercase
        System.out.println("Lowercase:"+Name2.toLowerCase());

        //equals
        System.out.println("equals"+Name1.equals(Name2));

        //substring
        System.out.print("Substrings"+Name1.substring(1,4));

        //replace
        System.out.println("Replace"+Name1.replace('a','e'));

        //CharAt
        System.out.print("Chartat "+Name1.charAt(4));

        //Contains
        System.out.println("contains"+Name1.contains("j"));

        //indexOf
        System.out.println("indexOf"+Name1.indexOf('a'));

        //lastIndexOf
        System.out.println("lastIndexOf"+Name1.lastIndexOf('a'));

        //trim
        System.out.println("Trim"+Name1.trim());

        //split
        String[] arr = Name1.split(" ");
        for(String str:arr){
            System.out.println(str);
        }

        //concat
        System.out.println("concat"+Name1.concat(Name2));

        //startsWith
        System.out.println("startsWith"+Name1.startsWith("s"));     

        //endsWith
        System.out.println("endsWith"+Name1.endsWith("n"));

        //isEmpty
        System.out.println("isEmpty"+Name1.isEmpty());

        //toString
        System.out.println("toString"+Name1.toString());

        //valueOf
        System.out.println("valueOf"+String.valueOf(123));

    }
}