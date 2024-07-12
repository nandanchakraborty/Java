class Node{
    int data;
    Node next;


    Node (int data1,Node next1){
    this.data = data1;
    this.next = next1;

    }

    Node(int data1){
        this.data= data1;
        this.next = null;
    }
}

public class serarchElement {
    public static int checkifPresent(Node head, int desireElement) {

        Node temp = head;
        while (temp != null) {
            if (temp.data == desireElement) {
                return 1;
            } else {

                temp = temp.next;
            }


        }
        return 0;
    }
    public static void main(String[] args){
        int [] arr ={1,2,3};
        Node head = new Node (arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node (arr[2]);
    int val = 3;
    System.out.println(checkifPresent(head,val)+" here is the result");
    }

}
