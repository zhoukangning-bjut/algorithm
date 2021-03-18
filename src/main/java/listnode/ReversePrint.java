package listnode;

import java.util.Stack;

public class ReversePrint {
    /**
     * 剑指 Offer 06. 从尾到头打印链表
     *
     * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
     *
     * 示例 1：
     *
     * 输入：head = [1,3,2]
     * 输出：[2,3,1]
     * @param args
     */
    public static void main(String[] args) {


    }

    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack();
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }
        int size = stack.size();
        int[] data = new int[size];
        for (int i = 0; i < size; i ++)
            data[i] = stack.pop();
        return data;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
