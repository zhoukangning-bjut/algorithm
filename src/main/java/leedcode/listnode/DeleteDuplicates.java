package leedcode.listnode;

public class DeleteDuplicates {
    /**
     *83. 删除排序链表中的重复元素
     * 存在一个按升序排列的链表，给你这个链表的头节点 head，
     * 请你删除所有重复的元素，使每个元素 只出现一次 。
     * 返回同样按升序排列的结果链表。
     *
     * 示例 1：
     * 输入：head = [1,1,2]
     * 输出：[1,2]
     */
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode slow = head, fast = head.next;
        while(fast != null){
            if (slow.val == fast.val){
                slow.next = fast.next;
                fast = fast.next;
            } else{
                slow = slow.next;
                fast = fast.next;
            }
        }
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
