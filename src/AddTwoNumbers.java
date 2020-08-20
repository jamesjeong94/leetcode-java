import Util.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode head = result;
        int carry = 0;
        while (l1 != null || l2 != null|| carry > 0) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sum = l1Val + l2Val + carry;
            carry = sum/10;
            result.val = sum % 10;
            l1 = l1 != null ? l1.next : null;;
            l2 = l2 != null? l2.next : null;
            if (l1 != null || l2 != null || carry > 0) {
                result.next = new ListNode();
                result = result.next;
            }
        }
        return head;
    }
}
