package listnode;

public class SwapPairs {
    /**
     * 交换链表中的节点
     * 给你链表的头节点 head 和一个整数 k 。
     * 交换 链表正数第 k 个节点和倒数第 k 个节点的值后，
     * 返回链表的头节点（链表 从 1 开始索引）。
     * <p>
     * 示例 1：
     * 输入：head = [1,2,3,4,5], k = 2
     * 输出：[1,4,3,2,5]
     */

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        swapNodes(node1, 2);

    }

    public static ListNode swapNodes(ListNode head, int k) {
        int count = 1;
        ListNode current = head;
        ListNode slow = head;
        ListNode fast = head;

        while (current.next != null) {
            if (count < k)
                fast = fast.next;
            else
                slow = slow.next;
            count ++;
            current = current.next;
        }
        int temp = fast.val;
        fast.val = slow.val;
        slow.val = temp;
        return head;
    }

    static class ListNode {
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
