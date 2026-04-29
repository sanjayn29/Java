import java.util.Scanner;
class Loops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of i : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println(i);
        }

        int j=1;
        while(n>=j){
            System.out.println(j);
            j++;
        }

        j=1;
        do{
            System.out.println(j);
            j++;
        }while(n>=j);

        int arr[] = {1,2,3,4,5};
        for(int i : arr){
            System.out.println(i);
        }
    }
}