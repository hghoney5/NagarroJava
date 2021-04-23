package stack;

public class Stack {
    private int tos;
    private int size;
    private int[] data;

    public Stack() {
        tos=-1;
        data = new int[5];
    }

    public Stack(int len) {
        tos = -1;
        data = new int[len];
    }

    public void push(int val) throws Exception {
        if(isFull())
            throw new Exception("Stack Overflow");
        tos++;
        data[tos] = val;
    }

    public int pop() throws Exception {
        if(isEmpty())
            throw new Exception("Stack Underflow");
        int temp = data[tos];
        data[tos] = 0;
        tos--;
        return temp;
    }

    public int size() {
        return tos + 1;
    }
    public int peek() {
        return data[tos];
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFull() {
        return size() == data.length;
    }

    public void display() {
        System.out.println("------------------------------");
        for(int i=tos; i>=0; i--) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------");
    }
}
