package queue;

public class Queue {
    protected int front;
    protected int size;
    protected int[] data;

    public Queue(){
        front = 0;
        size = 0;
        data = new int[5];
    }

    public void enqueue(int val) throws Exception {
        if(isFull())
            throw new Exception("Queue is Full");
        int idx = (front + size) % data.length;
        data[idx] = val;
        size++;
    }

    public int dequeue() throws Exception {
        if(isEmpty())
            throw new Exception("Queue is Empty");
        front = front % data.length;
        int temp = data[front];
        data[front] = 0;
        front++;
        size--;
        return temp;
    }

    public int peek() throws Exception {
        if(isEmpty())
            throw new Exception("Queue is Empty");
        return data[front];
    }

    public int getSize() {
        return size;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        System.out.println("-------------------------");
        for(int i=0; i < size; i++)
        {
            int idx = (front + i) % data.length;
            System.out.print( data[idx] + " ");
        }
        System.out.println();
        System.out.println("-------------------------");
    }
}
