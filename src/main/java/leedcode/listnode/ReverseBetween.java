package leedcode.listnode;

public class ReverseBetween {
    /**
     * 92. 反转链表 II
     * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
     * <p>
     * 说明:
     * 1 ≤ m ≤ n ≤ 链表长度。
     * <p>
     * 示例:
     * <p>
     * 输入: 1->2->3->4->5->NULL, m = 2, n = 4
     * 输出: 1->4->3->2->5->NULL
     */

    public static void main(String[] args) {

    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode fakeNode = new ListNode(-1);
        fakeNode.next = head;
        ListNode pre = fakeNode;
        for (int i = 0; i < left - 1; i++)
            pre = pre.next;
        ListNode current = pre.next;
        ListNode next;
        for(int i = 0; i < right - left; i++){
            next = current.next;
            current.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        return fakeNode.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }
}
