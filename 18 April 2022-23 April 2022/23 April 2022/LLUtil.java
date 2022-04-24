package March;
import java.util.*;
import java.io.*;


class Node {

    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}


class LLUtil{


    public Node createLL(int[] arr){

        Node head = new Node(arr[0]);
        Node temp = head;

        Node newNode = null;
        for(int i = 1; i < arr.length; i++){
            newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = temp.next;
        }
        return head;
    }

    //This function prints given linked list
    public void printLL(Node head){

        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }


}

class LinkedList {
    public static void main (String[] args) {

        Scanner sc=new Scanner(System.in);
        int [] arr=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        LLUtil llu = new LLUtil();
        Node head = llu.createLL(arr);
        System.out.println("Given Linked List");
        llu.printLL(head);
        head = deleteNodesOnRightSide(head);
        System.out.println("Modified Linked List");
        llu.printLL(head);

    }

    //Main function
    public static Node deleteNodesOnRightSide(Node head){
        if(head == null || head.next == null) return head;
        Node nextNode = deleteNodesOnRightSide(head.next);

        if(nextNode.data > head.data) return nextNode;
        head.next = nextNode;

        return head;
    }
}