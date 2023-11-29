package datastructures;

public class LinkedList {
    //First node in the list
    Node FirstNode;
    int size;

    //Constructor of the class
    public LinkedList() {
        this.FirstNode = null;
    }
    
    // Point on node who have a specific value
    Node pointOnNode(int value) {
        Node slidingNode = this.FirstNode;
        while(slidingNode.value != value && slidingNode.nextNode != null) slidingNode = slidingNode.nextNode;
        return slidingNode;
    }

    // Point on last node
    Node pointOnLastNode(){
        Node slidingNode = this.FirstNode;
        while(slidingNode.nextNode != null) slidingNode = slidingNode.nextNode;
        return slidingNode;
    }

    // Point on node before the node containing a specific value
    Node pointOnNodeBefore(int value){
        Node slidingNode = this.FirstNode;
        while(slidingNode.value < value && slidingNode.nextNode!=null) slidingNode = slidingNode.nextNode;
        return slidingNode;
    }

    // Point on node by index
    Node pointOnNodeByIndex(int indexToPointOn){
        Node slidingNode = this.FirstNode;
        int index = 0;
        while(index< indexToPointOn && slidingNode.nextNode!=null){
            slidingNode = slidingNode.nextNode;
        }
        return slidingNode;
    }

    // Add a new node 
    public void add(int value) {
        Node node = new Node(value);
        if(this.FirstNode == null) {
            this.FirstNode = node;
        }
        else {
            Node slidingNode = pointOnLastNode();
            slidingNode.nextNode = node;
        }
        this.size++;        
    }
    
    //Delete a node by using value
    public void deleteNodeByValue(int value) {
        Node nodeBeforeNodeToDelete = pointOnNodeBefore(value);
        nodeBeforeNodeToDelete.nextNode = nodeBeforeNodeToDelete.nextNode.nextNode;
        Node nodeToDelete = pointOnNode(value);
        nodeToDelete.nextNode = null;
        this.size--;
        // The garbage collector will take care of the rest
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
        System.out.println(list.pointOnLastNode());
        System.out.println(list.pointOnNode(-2));
        System.out.println(list.pointOnNodeBefore(-2));
        list.deleteNodeByValue(-2);
        System.out.println(list);
        list.deleteNodeByValue(5);
        System.out.println(list);
        System.out.println(list.size());
    }
}



