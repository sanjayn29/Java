import java.util.Scanner;
class Ifelse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mark;
        System.out.print("Enter ur marks : ");
        mark = sc.nextInt();
        if (mark >= 90){
            System.out.println("Grade A Pass : "+mark);
        }
        else if(mark >= 50){
            System.out.println("Grade B Pass : "+mark);
        }
        else{
            System.out.println("Grade C Fail : "+mark);
        }

        System.out.print("Enter 1,2,3: ");
        int n = sc.nextInt();
        switch(n){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("3");
        }
    }
}