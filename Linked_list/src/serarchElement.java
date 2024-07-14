/**
 *
 */
class Node2 {
    int data;
    Node2 next;


    Node2(int data1, Node2 next1){
    this.data = data1;
    this.next = next1;

    }

    Node2(int data1){
        this.data= data1;
        this.next = null;
    }
}

public class serarchElement {
    public static int checkifPresent(Node2 head, int desireElement) {

        Node2 temp = head;
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
        Node2 head = new Node2(arr[0]);
        head.next = new Node2(arr[1]);
        head.next.next = new Node2(arr[2]);
    int val = 3;
    System.out.println(checkifPresent(head,val)+" here is the result");
    }

}
