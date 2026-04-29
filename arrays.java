import java.util.Scanner;
class Arrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3};

        int arr2[] = {4,5,6};

        int[] arr3 = new int[3];
        for(int i=0;i<arr3.length;i++){
            arr3[i] = sc.nextInt();
        }
        sc.nextLine();

        String[] names = new String[3];
        for(int i=0;i<names.length;i++){
            names[i] = sc.nextLine();
        }

        for(int i=0;i<3;i++){
            System.out.println(arr[i]);
            System.out.println(arr2[i]);
            System.out.println(arr3[i]);
            System.out.println(names[i]);
        }
    }
}