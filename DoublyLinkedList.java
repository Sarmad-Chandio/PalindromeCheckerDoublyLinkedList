public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }


    public void append (int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        if (index < length/2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public void reverse(){
        //Implement a method called reverse() that reverses the order of the nodes in the list.
        //The doubly linked list may be empty or have one or more nodes.

        if (length==0 || length==1){
            return;
        }
        Node headTemp=head;
        Node tailTemp=tail;
        for (int i=1;i<=length/2;i++) {
            int hValue=headTemp.value;
            int tValue=tailTemp.value;

            headTemp.value = tValue;
            tailTemp.value=hValue;

            headTemp=headTemp.next;
            tailTemp=tailTemp.prev;

            if (headTemp == tailTemp) {
               return;
            }
        }
    }
  //will check Palindrome
    public boolean isPalindrome(){
        Node headTemp=head;
        Node tailTemp=tail;
        for (int i=1;i<=length/2;i++) {
            if (headTemp.value!=tailTemp.value){
                return false;
            }
            headTemp=headTemp.next;
            tailTemp=tailTemp.prev;
        }
        return true;
    }

}

