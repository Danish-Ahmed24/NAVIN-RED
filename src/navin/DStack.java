package navin;

import java.util.Arrays;

public class DStack {
    int capacity =2;
    static int top=0;
    int[] stack = new int[capacity];
    public void push(int data)
    {
        if(size()==capacity){
            expand();
        }
        stack[top++]=data;
    }
    public void expand()
    {
        int length =size();
        int[] newStack = new int[capacity*2];
        System.arraycopy(stack,0,newStack,0,length);
        stack = newStack;
        capacity*=2;
        System.out.println(543);
    }
    public int size()
    {
        return top;
    }
    public boolean isEmpty()
    {
        return top>0 ? false: true;
    }
    public int pop(){
        top--;
        int data = stack[top];
        stack[top]=0;
        return data;
    }
    public int peek() {
        return stack[top-1];
    }

    public void show()
    {
        for (int n: stack)
        {
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        DStack stack = new DStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(4);
        stack.push(4);
        stack.push(4);
        stack.push(4);
        stack.push(4);

        stack.pop();
        System.out.println(stack.isEmpty());
        System.out.println("Size: "+stack.size());
        System.out.println(stack.peek());
        stack.show();
    }
}
