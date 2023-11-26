package datastructures;

public class LinkedList {
    //First node in the list
    Node FirstNode;
    int size;

    //Constructor of the class
    public LinkedList() {
        this.FirstNode = null;
    }

    // Add a new node 
    public void add(int value) {
        Node node = new Node(value);
        if(this.FirstNode == null) {
            this.FirstNode = node;
        }
        else {
            Node slidingNode = this.FirstNode;
            while (slidingNode.nextNode != null) {
                slidingNode = slidingNode.nextNode;
            }
            slidingNode.nextNode = node;
        }
        this.size++;        
    }
    
    //Delete a node by using value, delete all occurrences
    public void deleteNodeByValue(int value) {
        if(this)
    }

    //Print the list
    public String toString(){
        if(this.FirstNode==null) return "Liste vide";
        return this.FirstNode.printNodeChain("");
    }

    //Get the size
    public int size(){
        return this.size;
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); 
        list.add(5);
        list.add(-2);
        list.add(7);
        System.out.println(list);
        System.out.println(list.size());
    }
}



