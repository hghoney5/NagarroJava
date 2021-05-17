package LinkedList;

public class LinkedList {

    private class Node {
        int data;
        Node next;
    }

    private Node head;

    public void display() {
        System.out.println("----------------");
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("----------------");
    }

    public int size() {
        int count = 0;
        Node temp = head;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return head == null;
//        return size() == 0;
    }

    public int getFirst() throws Exception {
        if(isEmpty()) {
            throw new Exception("LL is Empty");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if(isEmpty())
            throw new Exception("LL is Empty");

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        return temp.data;
    }

    public int getAt(int idx) throws Exception {
        if(isEmpty())
            throw new Exception("LL is Empty");
        if(idx < 0 || idx >= size())
            throw new Exception("Invalid Index");
        Node temp = head;
        while(idx > 0)
        {
            temp = temp.next;
            idx--;
        }
        return temp.data;
    }

    private Node getNodeAt(int idx) throws Exception {
        if(isEmpty())
            throw new Exception("LL is Empty");
        if(idx < 0 || idx >= size())
            throw new Exception("Invalid Index");
        Node temp = head;
        while(idx > 0)
        {
            temp = temp.next;
            idx--;
        }
        return temp;
    }

    public void addFirst(int val) {
        Node node = new Node();
        node.data = val;
        node.next = head;
        head = node;
    }

    public void addLast(int val) throws Exception {
        Node node = new Node();
        node.data = val;
        // by default node.next = null;
        if(isEmpty()) {
            head = node;
        }
        else {
            Node lastNode = getNodeAt(size() - 1);
            lastNode.next = node;
        }
    }

    public void reverse() {
        reverse(head, null);
    }

    private void reverse(Node curr, Node prev) {
        if(curr == null)
        {
            head = prev;
            return;
        }
        reverse(curr.next, curr);
        curr.next = prev;
    }

    public void reverse2() {
        reverse2(head, null);
    }

    private void reverse2(Node curr, Node prev) {
        if(curr == null) {
            head = prev;
            return;
        }

        Node temp = new Node();
        temp.next = curr.next;
        curr.next = prev;
        reverse2(temp.next, curr);

    }

    public void reverse3() {
        reverse3(head);
    }

    private void reverse3(Node curr) {
        if(curr.next.next == null) {
            head.next = null;
            head = curr.next;
            head.next = curr;
            return;
        }

        Node temp = new Node();
        temp.next = curr.next.next;

        reverse3(temp.next);
        curr.next.next = curr;
    }
}
