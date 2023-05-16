class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
        //  Node ptr1 = null, ptr2 = null;
        //  Node ref = head;
        //  ptr1 = head;
         
        //  while(ptr1 != null && ptr1.next != null) {
        //      ptr2 = ptr1;
             
        //      while(ptr2.next != null) {
        //          if(ptr1.data == ptr2.next.data) {
        //              ptr2.next = ptr2.next.next;
        //              System.gc();
        //          }
        //          else {
        //              ptr2 = ptr2.next;
        //          }
        //      }
        //      ptr1 = ptr1.next;
        //  }
        //  return ref;
        
        HashSet<Integer> set = new HashSet<>();
        
        Node current = head;
        Node ref = head;
        Node prev = null;
        
        while(current != null) {
            int temp = current.data;
            
            if(set.contains(temp)) {
                prev.next = current.next;
            }
            else {
                set.add(temp);
                prev = current;
            }
            current = current.next;
        }
        return ref;
    }
}
