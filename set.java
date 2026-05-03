import java.util.*;

class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1) PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 2) ArrayDeque
        Deque<Integer> dq = new ArrayDeque<>();

        // 3) LinkedList as Queue
        Queue<Integer> q = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            int val = sc.nextInt();

            pq.add(val);
            dq.offer(val);
            q.offer(val);
        }

        // Display initial structures
        System.out.println("\n--- Initial Data ---");
        System.out.println("PriorityQueue: " + pq);
        System.out.println("ArrayDeque: " + dq);
        System.out.println("LinkedList Queue: " + q);

        // Remove one element from each
        System.out.println("\n--- Removing Elements ---");

        System.out.println("PriorityQueue poll(): " + pq.poll());
        System.out.println("ArrayDeque poll(): " + dq.poll());
        System.out.println("LinkedList poll(): " + q.poll());

        // Show after removal
        System.out.println("\n--- After Removal ---");
        System.out.println("PriorityQueue: " + pq);
        System.out.println("ArrayDeque: " + dq);
        System.out.println("LinkedList Queue: " + q);

        // Peek elements
        System.out.println("\n--- Peek Elements ---");
        System.out.println("PriorityQueue peek(): " + pq.peek());
        System.out.println("ArrayDeque peek(): " + dq.peek());
        System.out.println("LinkedList peek(): " + q.peek());
    }
}