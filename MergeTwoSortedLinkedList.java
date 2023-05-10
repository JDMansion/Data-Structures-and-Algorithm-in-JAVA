//In-place solution
//Time Complexity: O(n1 + n2)
//Space Complexity O(1)

class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
     if(head1 == null) return head2;
     if(head2 == null) return head1;
     
     if(head1.data > head2.data) {
         Node temp = head1;
         head1 = head2;
         head2 = temp;
     }
     
     Node res = head1;
     
     while(head1 != null && head2 != null) {
         Node temp = null;
         while(head1 != null && head1.data <= head2.data) {
             temp = head1;
             head1 = head1.next;
         }
         temp.next = head2;
         
        temp = head1;
        head1 = head2;
        head2 = temp;
     }
     return res;
   } 
}
