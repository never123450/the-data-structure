package arithmetic.recursive;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {

        while (head != null && head.val == val) {
//            ListNode delNode = head;
//            head = head.next;
//            delNode.next = null;
            head = head.next;
        }

        if (head == null) {
            return null;
        }

        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
//                ListNode delNode = prev.next;
//                prev.next = delNode.next;
//                delNode.next = null;
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }

        return head;


    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 45, 6, 8, 2, 5, 78, 8};
        ListNode head = new ListNode(nums);
        System.out.println(head);
        System.out.println("--------");

        ListNode res = (new Solution()).removeElements(head, 8);
        System.out.println(res);


    }
}