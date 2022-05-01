package March;

class KthElement {
    Node head;


    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }


    void printNthFromLast(int k)
    {
        int len = 0;
        Node temp = head;


        while (temp != null) {
            temp = temp.next;
            len++;
        }


        if (len < k)
            return;

        temp = head;


        for (int i = 1; i < len - k + 1; i++)
            temp = temp.next;

        System.out.println(temp.data);
    }

    public void push(int new_data)
    {

        Node new_node = new Node(new_data);


        new_node.next = head;


        head = new_node;
    }


    public static void main(String[] args)
    {
        KthElement llist = new KthElement();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(35);

        llist.printNthFromLast(4);
    }
}
