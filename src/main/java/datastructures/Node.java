package datastructures;

public class Node {
    int value;
    Node nextNode;
    public Node(int value){
        this.value = value;
        this.nextNode = null;
    }
    public void setNextNode(Node node){
        this.nextNode = node;
    }
    public String toString(){
        return Integer.toString(this.value);
    }
    public String printNodeChain(String result){
        result += Integer.toString(this.value)+"-->";
        if(this.nextNode==null) return result;
        else return this.nextNode.printNodeChain(result);
    }
}
