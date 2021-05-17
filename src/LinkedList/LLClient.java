package LinkedList;

public class LLClient {
    public static void main(String[] args) throws Exception {
        LinkedList ll = new LinkedList();
        ll.addLast(20);
        ll.addLast(30);
        ll.addFirst(10);
        ll.display();
        ll.addFirst(50);
        ll.addFirst(60);
        ll.addFirst(70);
        ll.display();

        System.out.println("Reverse : ");
        ll.display();
        ll.reverse();
        ll.display();

        System.out.println("Reverse 2: ");
        ll.display();
        ll.reverse2();
        ll.display();

        System.out.println("Reverse 3:");
        ll.display();
        ll.reverse3();
        ll.display();

    }
}
