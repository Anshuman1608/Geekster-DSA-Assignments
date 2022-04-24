package March;

// Java program to find n'th node in linked list

class Node {
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}

class LinkedList1 {
    Node head; // the head of list

    /* Takes index as argument and return data at index*/
    public int GetNth(int index)
    {
        Node current = head;
        int count = 1; /* index of Node we are
						currently looking at */
        while (current != null)
        {
            if (count == index)
                return current.data;
            count++;
            current = current.next;
        }

		/* if we get to this line, the caller was asking
		for a non-existent element so we assert fail */
        assert (false);
        return 0;
    }

    /* Given a reference to the head of a list and an int,
    inserts a new Node on the front of the list. */
    public void push(int new_data)
    {

        /* 1. alloc the Node and put data*/
        Node new_Node = new Node(new_data);

        /* 2. Make next of new Node as head */
        new_Node.next = head;

        /* 3. Move the head to point to new Node */
        head = new_Node;
    }

    /* Driver code*/
    public static void main(String[] args)
    {
        /* Start with empty list */
        LinkedList1 llist = new LinkedList1();

		/* Use push() to construct below list
		1->12->1->4->1 */
        llist.push(60);
        llist.push(50);
        llist.push(40);
        llist.push(20);
        llist.push(20);
        llist.push(10);

        /* Check the count function */
        System.out.println("Element at index 5 is "
                + llist.GetNth(5));
    }
}

