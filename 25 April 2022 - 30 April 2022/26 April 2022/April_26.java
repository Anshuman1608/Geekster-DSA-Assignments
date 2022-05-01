package March;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;

    }
}
public class April_26 {
    static Node head;

    public static void main(String[] args) {
        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        head1.next.next.next = new Node(40);
        head1.next.next.next.next = new Node(50);

        display(head1);

        Node head2 = new Node(5);
        head2.next = new Node(10);
        head2.next.next = new Node(15);
        head2.next.next.next = new Node(20);
        head2.next.next.next.next = new Node(25);
        head2.next.next.next.next.next = new Node(30);

        display(head2);
        System.out.println(intersection(head1,head2));

    }
    public static void display(Node head){
        if (head==null){
            System.out.println("List is empty! ");
        }
        else {
            Node currNode = head;
            while (currNode!=null){
                System.out.print(currNode.data+" -> ");
                currNode = currNode.next;
            }
            System.out.println("Null");
        }
    }
    public static Node intersection(Node head1,Node head2){
        if (head1 ==  null || head2 == null){
            System.out.println("List is empty! ");
        }
        Node p1 = head1;
        Node p2 = head2;

        while (p1!=p2){
            if (p1 == null){
                p1 = head2;
            }else {
                p1 = p1.next;
            }
            if (p2 == null){
                p2 = head1;
            }else {
                p2 = p2.next;
            }
        }
        return p1;
    }
}


