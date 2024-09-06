public class insertAnode2Dll {
    public static class Node {
        int data;
        Node next;
        Node back;

        Node(int data1, Node next1, Node back1) {
            data = data1;
            next = next1;
            back = back1;

        }

        Node(int data1) {
            data = data1;
            next = null;
            back = null;
        }
    }

    private static Node convert2ll(int []arr)
    {
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = temp;

        }
        return head;
    }

    private static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
        temp = temp.next;
        }
    }
    public static void main(String []args){
        int [] arr= {1,2,3,4,5};
        Node head = convert2ll(arr);
        print(head);




    }

}

