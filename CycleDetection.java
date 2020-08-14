/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    Node p =head;
    Node q = head;
    
    
    while(p != null && q != null&& q.next!= null){
        p = p.next;
        q = q.next.next;
        
        if (p == q)
               return true;
      
       
    }
    
    return false;

}
