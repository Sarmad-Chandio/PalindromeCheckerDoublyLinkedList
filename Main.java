public class Main {
    public static void main(String[] args) {
        //123456787654321

        DoublyLinkedList dll=new DoublyLinkedList(1);
        dll.append(2);
        dll.append(3);
        dll.append(4);
        dll.append(5);
        dll.append(6);
        dll.append(7);
        dll.append(8);
        dll.append(7);
        dll.append(6);
        dll.append(5);
        dll.append(4);
        dll.append(3);
        dll.append(2);
        dll.append(1);
      
        System.out.println("******Palindrome");
        System.out.println(dll.isPalindrome());
    }
}
