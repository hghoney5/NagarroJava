package stack;

import java.sql.SQLOutput;

public class StackQs {
    public static void main(String[] args) throws Exception {
        DynamicStack stack = new DynamicStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.display();
        revesePrint(stack);
        System.out.println();
        System.out.println("Stack Reverse: ");
        stack.display();
        reverseStack(stack, new DynamicStack());
        stack.display();
    }

    public static void revesePrint(DynamicStack stack) throws Exception {
        if(stack.size() == 0)
            return;

        int temp = stack.pop();
        revesePrint(stack);
        System.out.print(temp + " ");
        stack.push(temp);
    }

    public static void reverseStack(DynamicStack stack, DynamicStack helper) throws Exception {
        if(stack.size() == 0) {
            reverseStack2(stack, helper);
            return;
        }
        helper.push(stack.pop());
        reverseStack(stack, helper);
    }

    public static void reverseStack2(DynamicStack stack, DynamicStack helper) throws Exception {
        if(helper.size() == 0)
            return;
        int temp = helper.pop();
        reverseStack2(stack, helper);
        stack.push(temp);
    }
}
