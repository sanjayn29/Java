import java.util.*;
class ArrayListt{
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.set(2,30);
    System.out.println(list);
    list.remove(2);
    System.out.println(list.get(1));

    for(int i=0;i<20;i++){
        list.add(sc.nextInt());
    }

    System.out.println(list);
    for(int i: list){
        System.out.print(i+" ");
    }
}
}