class Solution
{
    int getMiddle(Node head)
    {
         HashMap<Integer, Integer> map = new HashMap<>();
         
         Node temp = head;
         int i=1;
         
         while(temp != null) {
             map.put(i, temp.data);
             temp = temp.next;
             i++;
         }
         int index = (i-1)/2;
         
         return map.get(index+1);
    }
}
