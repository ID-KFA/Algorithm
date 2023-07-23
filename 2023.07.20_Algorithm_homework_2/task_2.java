public class task_2 {
    

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        // Новый головной элемент - последний элемент списка
        head = prev;
        
        return head;
    }

    public static void main(String[] args) {
         
         ListNode head = new ListNode(1);
         ListNode second = new ListNode(2);
         ListNode third = new ListNode(3);
         ListNode fourth = new ListNode(4);
         ListNode fifth = new ListNode(5);
 
         head.next = second;
         second.next = third;
         third.next = fourth;
         fourth.next = fifth;
 
         System.out.println("Исходный список:");
         printList(head);
 
         ListNode reversedHead = reverse(head);
 
         System.out.println("Разворот списка:");
         printList(reversedHead);
     }
 
    
}
