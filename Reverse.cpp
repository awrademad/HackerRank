/*
   Reverse a doubly linked list, input list may also be empty
   Node is defined as
   struct Node
   {
     int data;
     Node *next;
     Node *prev;
   }
*/
Node* Reverse(Node* head)
{
    // Complete this function
    // Do not write the main method.
    if (head == NULL)
        return head;
   Node* temp = head; 
  //  Node* newHead = head;
    while(temp != NULL){
        Node* node = temp->prev;
        temp->prev = temp->next;
        temp->next = node;
        head = temp;
        temp = temp->prev;
    }
 // head = temp;
   // while(head != NULL)
     //   printf("%d", head->data);
    return head;
}
