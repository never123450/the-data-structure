package arithmetic.recursive;


//使用虚拟头结点
public class Solution3 {
    public ListNode removeElements(ListNode head, int val, int depth) {

        String depthStrng = generateDepthStirng(depth);
        System.out.print(depthStrng);
        System.out.println(" call: remove " + val + " in " + head);

        if (head == null) {
            System.out.print(depthStrng);
            System.out.println(" return :" + head);
            return head;
        }

//        ListNode res = removeElements(head.next, val);
//        if (head.val == val){
//            return res;
//        }else {
//            head.next = res;
//            return head;
//        }


        ListNode res = removeElements(head.next, val, depth + 1);
        System.out.print("--");
        System.out.print(depthStrng);
        System.out.println(" After remove " + val + ":" + res);

//        if (head.val == val) {
//            return head.next;
//        } else {
//            return head;
//        }

        ListNode ret;

        if (head.val == val) {
            ret = res;
        } else {
            head.next = res;
            return head;
        }


//        return head.val == val ? head.next : head;

        System.out.print("--");
        System.out.print(depthStrng);
        System.out.println(" return: " + ret);
        return ret;
    }

    private String generateDepthStirng(int depth) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            res.append("--");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 45, 6, 8, 2, 5, 78, 10, 9, 8};
        ListNode head = new ListNode(nums);
        System.out.println(head);
        System.out.print("--------");

        ListNode res = (new Solution3()).removeElements(head, 8, 0);
        System.out.println(res);
    }


}
