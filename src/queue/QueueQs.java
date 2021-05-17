package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueQs {
    public static void main(String[] args) throws Exception {

        DynamicQueue queue = new DynamicQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("Reverse Print");
        queue.display();
        reversePrint(queue, 0);
        System.out.println();
        queue.display();

        System.out.println("Reverse Queue");
        queue.display();
        reverseQueue(queue);
        System.out.println();
        queue.display();

        System.out.println("First -ve Nos. in array: 8, -1, -8, 7, -30, 40, 50, 60");
        firstNegativeInWindowK(new int[] {8, -1, -8, 7, -30, 40, 50, 60}, 3);
    }

    public static void reversePrint(DynamicQueue queue, int count) throws Exception {
        if(count == queue.getSize())
            return;
        int temp = queue.dequeue();
        queue.enqueue(temp);
        reversePrint(queue, count + 1);
        System.out.print(temp + " ");
    }

    public static void reverseQueue(DynamicQueue queue) throws Exception {
        if(queue.isEmpty())
            return;
        int temp = queue.dequeue();
        reverseQueue(queue);
        System.out.print(temp + " ");
        queue.enqueue(temp);
    }

    // Q: first -ve integer of every window of size k
    public static void firstNegativeInWindowK(int[] arr, int k) {
        Queue<Integer> q = new LinkedList<Integer>();

        for(int i=0; i<k; i++)
        {
            if(arr[i] < 0)
                q.add(i);
        }

        if(!q.isEmpty())
            System.out.println(arr[q.peek()]);

        for(int i = k; i<arr.length-k; i++) {
            if(!q.isEmpty() && q.peek() == i-k)
                q.remove();

            if(arr[i] < 0)
                q.add(i);

            if(!q.isEmpty())
                System.out.println(arr[q.peek()]);
        }
    }
}
