package leedcode;

public class KthToLast {
    /**
     * 返回倒数第 k 个节点
     * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
     * 示例：
     * <p>
     * 输入： 1->2->3->4->5 和 k = 2
     * 输出： 4
     */
    public static void main(String[] args) {

    }

    public static int kthToLast(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.val;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
