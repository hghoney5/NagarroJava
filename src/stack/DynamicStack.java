package stack;

public class DynamicStack extends Stack{

    @Override
    public void push(int val) throws Exception {
        if(isFull()) {
            int[] na = new int[2*data.length];
            for(int i=tos; i>=0; i--)
            {
                na[i] = data[i];
            }
            data = na;
        }
        super.push(val);
    }
}
