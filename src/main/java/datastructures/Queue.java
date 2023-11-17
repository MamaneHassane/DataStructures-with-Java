package datastructures;

public class Queue {
    Node head;
    Node tail;
    int size;
    void push(int value){
        Node node = new Node(value);
        if(this.head==null && this.tail==null){
            this.head = this.tail = node;
            this.head.nextNode = this.tail;
            this.tail.nextNode = this.head;
        }
        else {
            node.nextNode = this.tail;
            this.tail = node;
        }
        this.size++;
    }
    Node pop(){
        Node node = this.head;
        this.head = this.head.nextNode;
        this.size--;
        return node;
    }
    public Queue(){
        this.head = this.tail = null;
        this.size = 0;
    }
    public int size(){return this.size;}
}
