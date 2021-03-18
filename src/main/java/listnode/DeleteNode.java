package listnode;

public class DeleteNode {
    /**
     * 剑指 Offer 18. 删除链表的节点
     * <p>
     * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
     * 返回删除后的链表的头节点。
     * <p>
     * 示例 1:
     * <p>
     * 输入: head = [4,5,1,9], val = 5
     * 输出: [4,1,9]
     * 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，
     * 该链表应变为 4 -> 1 -> 9.
     *
     * @param args
     */
    public static void main(String[] args) {

    }

    public ListNode deleteNode(ListNode head, int val) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode fakeHead = pre;
        while(head != null){
            if (head.val != val){
                pre = head;
                head = head.next;
            }else{
                pre.next = head.next;
                head.next = null;
                head = pre.next;
            }
        }
        return fakeHead.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
