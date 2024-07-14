class Node{
    int data;
    Node next;
    Node back;

    Node(int data, Node next, Node back){
    this.data = data;
    this.next = next;
    this.back = back;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
        this.back = null;

    }}

public class DLinkedList {
    //Doubly linked list
    private static void print(Node head){
        Node temp = head;
        while(temp !=null){
            System.out.print(head.data +" ");
        temp = temp.next;
        }
        System.out.println();
    }



    private static Node convertArr2Dll(int[] arr){
       Node head = new Node(arr[0]);
       Node prev = head;
       for(int i=1;i<arr.length;i++){
        Node temp = new Node(arr[i],null, prev)  ;
       prev.next = temp;
       prev= temp;
       }
       return head;


    }
    public static void main(String[]args){
        int [] arr = {5,3,6,1};
        Node head = convertArr2Dll(arr);    }
}
