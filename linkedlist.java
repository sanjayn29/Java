import java.util.*;
class Linkedlistt{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.addFirst(0);
        System.out.println(list);

        list.addLast(4); 
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        for(int i=0;i<20;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        
        for(int i: list){
            System.out.print(i+" ");
        }

    }
}