package navin;

public class Stack {
    static int top=0;
    int[] stack = new int[5];
    public void push(int data)
    {
        stack[top++]=data;
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
         Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        System.out.println(stack.isEmpty());
        System.out.println("Size: "+stack.size());
            System.out.println(stack.peek());
        stack.show();
    }
}
