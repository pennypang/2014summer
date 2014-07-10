class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
         val = x;
          next = null;
      }
}
/**
 *
 * @author panghuimin
 */
public class Sortlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // TODO code application logic here
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(4);
        ListNode n6 = new ListNode(5);
 
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
       
        
	n1 =sortList(n1);
	printList(n1);
	
    }
    public static void printList(ListNode x) {
        if (x != null) {
            System.out.print(x.val + " ");
            while (x.next != null) {
                System.out.print(x.next.val + " ");
                x = x.next;
            }
            System.out.println();
        }
}
    public static ListNode sortList(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        //to split the listnode into two part through fast and slow pointer
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode right=slow.next;
        slow.next=null;
        ListNode left=head;
        
        left=sortList(left);
        printList(left);
        right=sortList(right);
        printList(right);
        ListNode result=merge(left,right);
        return result;
    }
   
    public static ListNode merge(ListNode left, ListNode right){
        if(left==null)
            return right;
        else if(right==null)
            return left;
        
        ListNode result=new ListNode(0);
        ListNode aux=result;
        while(left!=null || right!=null){
            if(left==null){
                aux.next=right;
                break;
            }
            else if(right==null){
                aux.next=left;
                break;
            }
            else if(left.val>right.val){
                aux.next=right;
                right=right.next;
            }
            else{
                aux.next=left;
                left=left.next;
            }
            aux=aux.next;
        }
        return result.next;
    }
}
    
