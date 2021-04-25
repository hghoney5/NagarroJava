package stack;

public class SClient {
    public static void main(String[] args) throws Exception {
        Stack s = new DynamicStack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.display();
        s.push(60);
        s.push(70);
        s.push(80);
        s.push(90);
        s.push(100);
        s.push(100);
        s.push(100);
        s.display();
    }
}
