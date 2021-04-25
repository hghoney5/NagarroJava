package queue;

public class DynamicQueue extends Queue {
    @Override
    public void enqueue(int val) throws Exception {
        if(isFull()) {
            int[] nq = new int[2*data.length];
            for(int i=0; i<size; i++) {
                int idx = (front + i) % data.length;
                nq[i] = data[idx];
            }
            data = nq;
            front = 0;
        }
        super.enqueue(val);
    }
}
