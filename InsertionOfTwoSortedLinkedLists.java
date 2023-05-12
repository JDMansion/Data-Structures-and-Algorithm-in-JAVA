class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        Node ans = new Node(-1);
        Node temp = ans;
        
        Node temp1 = head1;
        Node temp2 = head2;
        
        while(temp1 != null && temp2 != null) {
            if(temp1.data == temp2.data) {
                temp.next = temp1;
                temp = temp.next;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            else if(temp1.data < temp2.data) {
                temp1 = temp1.next;
            }
            else {
                temp2 = temp2.next;
            }
            
        }
        temp.next = null;
        return ans.next;
    }
}
