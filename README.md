# PalindromeCheckerDoublyLinkedList
Write a method to determine whether a given doubly linked list reads the same forwards and backwards.
## Description
Write a method to determine whether a given doubly linked list reads the same forwards and backwards. For example, if the list contains the values  ```[1, 2, 3, 2, 1]```, then the method should return true, since the list is a palindrome.

If the list contains the values ```[1, 2, 3, 2, 1]```, then the method should return false, since the list is not a palindrome.
Method name: palindrome 
Return Type: boolean
```java
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
```
