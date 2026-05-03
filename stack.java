import java.util.*;
class StackCollection{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stackk = new Stack<>();

        stackk.push(2);
        System.out.println(stackk);

        stackk.push(sc.nextInt());
        System.out.println(stackk);

        System.out.println(stackk.peek());
        System.out.println(stackk.pop());
        System.out.println(stackk);

        System.out.println(stackk.search(2));
        System.out.println(stackk.empty());

    }
}