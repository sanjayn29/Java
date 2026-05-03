class Exceptionn{
    public static void main (String[] args){
        try {
            int a = 10/0;
            System.out.println(a);
        }
        catch (Exception e){
            System.out.println("Cannot divide by zero");
        }
        finally{
            System.out.println("This block will always execute");
        }
    }
}