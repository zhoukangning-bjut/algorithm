package leedcode;

import java.util.HashMap;

public class DetectCycle {
    /**
     * 环路检测
     * 给定一个链表，如果它是有环链表，实现一个算法返回环路的开头节点。
     * <p>
     * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
     * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链
     * 表中的位置（索引从 0 开始）。
     * 如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，
     * 仅仅是为了标识链表的实际情况。
     */
    public static void main(String[] args) {

    }

    /**
     * 哈希表，空间换时间
     * @param head
     * @return
     */
    public static ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> hashMap = new HashMap();
        ListNode current = head;
        while (current != null) {
            if (hashMap.containsKey(current))
                return current;
            hashMap.put(current, current.val);
            current = current.next;
        }
        return null;
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
