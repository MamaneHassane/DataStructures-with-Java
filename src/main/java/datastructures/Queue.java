package datastructures;

public class Queue {
    Node head;
    Node tail;
    int size;
    public void push(int value){
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
    public Node pop(){
        if(this.head == null){
            return null;
        }
        Node node = this.head;
        this.head = this.head.nextNode;
        this.size--;
        if(this.head == null){
            this.tail = null;
        }
        return node;
    }

    public Queue(){
        this.head = this.tail = null;
        this.size = 0;
    }
    public int size(){return this.size;}
    public String toString(){
        return this.head.printNodeChain("");
    }
    public static void main(String[] args){
        Queue queue = new Queue();
        queue.push(0);
        queue.push(1);
        queue.push(-1);
        queue.push(-7);
        // System.out.println(queue);

    }
}

