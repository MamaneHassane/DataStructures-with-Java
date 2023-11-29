package datastructures;

public class Stack {
    Node top;
    int size;
    public Stack(int firstValue) {
        top = new Node(firstValue);
        this.size++;
    }
    public void setTop(Node node) {
        this.top = nod e;
    }
    public void push(int value) {
        Node nodeToPush = new Node(value);
        nodeToPush.setNextNode(this.top);
        this.setTop(nodeToPush);
        this.size++;
    }
    public void pop(){
         this.setTop(this.top.nextNode);
         this.size--;
    }
    public int size(){
        return this.size;
    }
    public String toString(){
        return this.top.printNodeChain("Top:");
    }

    public static void main(String[] args) {
        Stack myStack = new Stack(2);
        myStack.push(4);
        myStack.push(-5);
        myStack.push(1);
        System.out.println(myStack);
        System.out.println(myStack.size());
        myStack.pop();
        myStack.pop();
        System.out.println(myStack);
        System.out.println(myStack.size());
    }
}
