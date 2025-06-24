package navin;

import java.util.spi.AbstractResourceBundleProvider;

public class LinkedListO {
    Node head;
    public void insert(int data){
        Node node = new Node();
        node.data=data;
        node.next=null;

        if(head==null)
        {
            head = node;
        }
        else {
            Node n = head;
            while(n.next!=null)
            {
                n = n.next;
            }
            n.next=node;
        }
    }

    public void show() {
        if(head==null)
        {
            System.out.println("Empty");
        }
        else
        {
            Node n = head;
            while(n.next!=null)
            {
                System.out.print(n.data+" ");
                n = n.next;
            }
            System.out.print(n.data);
        }
    }

    public void insertAtStart(int data) {
        Node n = new Node();
        n.data=data;
        n.next= head;
        head=n;

    }

    public void insertAt(int data,int index) {
        if(index==0)
        {
            insertAtStart(data);
            return;
        }

        Node l=null;
        //l r initializers
        Node n = head;
        int i=0;
        while(n.next!=null)
        {
            if(i==index-1) {
                l = n;
                break;
            }
            i++;
            n=n.next;
        }
        //end
        Node node = new Node();
        node.data=data;
        node.next=l.next;
        l.next=node;
    }

    public void deleteAt(int index){
        if(index==0)
        {
            head = head.next;
            return;
        }
        Node n = head;
        int i=0;
        while(n.next!=null)
        {
            i++;
            n=n.next;
            if(i==index-1){
                break;
            }
        }
        n.next=n.next.next;
    }
}
class Node{
    int data;
    Node next;
}
class Runner{
    public static void main(String[] args) {
        LinkedListO list = new LinkedListO();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insertAtStart(32);
        list.insertAt(55,4);
        list.insertAt(100,2);
        list.insertAt(4,0);
        list.deleteAt(2);
        list.deleteAt(0);
        list.show();
    }
}