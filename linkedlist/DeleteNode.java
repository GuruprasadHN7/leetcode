class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
public class DeleteNode{
    static Node head;
    public static Node deleteNode(int N){
        Node start = head;
        Node fast = start;
        Node slow = start;
        for(int i = 1; i <=N; i++)
            fast =  fast.next;
        while(fast.next!=null) {
            fast = fast.next;
            slow = slow.next;
        }
        Node temp = slow.next;
        slow.next = temp.next;
        temp.next = null;
        return temp;
    }
    public static void printNode(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
    public static void main(String[] args){
        head = new Node(12);
        head.next = new Node(23);
        head.next.next = new Node(244);
        head.next.next.next = new Node(2443);
        DeleteNode.deleteNode(2);
        DeleteNode.printNode();
    }
}