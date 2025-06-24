package navin;

public class Queue {
    int []queue = new int[5];
    int size,front,rear;

    public void enQueue(int data)
    {
        queue[rear]=data;
        size++;
        rear++;
        rear%=5;
    }
    public void deQueue()
    {
        front++;
        front%=5;
        size--;
    }

    public void show()
    {
        System.out.println("Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front+i)%5]+" ");
        }
    }
}
class Runner1{
    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.enQueue(3);
        queue.enQueue(2);
        queue.enQueue(1);
        queue.enQueue(0);
        queue.show();
        queue.deQueue();
        queue.deQueue();
        queue.show();
        queue.enQueue(23);
        queue.enQueue(23);
        queue.enQueue(23);
        queue.show();
        queue.show();
    }
}