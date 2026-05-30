// ListNode definition
class ListNode {
    int val;
    ListNode next;

    ListNode(int v) {
        val = v;
    }
}

class Solution {

    // Time: O(n) | Space: O(1)
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null) {
            if (slow.val != fast.val) {
                slow.next = fast;
                slow = fast;
            }
            fast = fast.next;
        }

        slow.next = null; // trim trailing duplicates
        return head;
    }
}
