/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    Node curA = headA;
    Node curB = headB;
    while(curA != curB){
        if (curA.next == null)
            curA = headB;
        else
            curA = curA.next;
        if(curB.next == null)
            curB = headA;
        else
            curB = curB.next;
    }
    return curA.data;
    

}
