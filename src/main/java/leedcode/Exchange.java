package leedcode;

import utils.Util;

public class Exchange {
    /**
     * 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
     * 使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
     * <p>
     * 示例：
     * <p>
     * 输入：nums = [1,2,3,4]
     * 输出：[1,3,2,4]
     * 注：[3,1,2,4] 也是正确的答案之一。
     */
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5};
        for (int i :
                exchange(nums)) {
            System.out.print(i + " ");
        }
    }
    public static int[] exchange(int[] nums) {
        int start = 0, end = nums.length - 1;
        int length = nums.length;
        while (start < end) {
            while (start < length && nums[start] % 2 == 1)
                start++;
            while (end > 0 && nums[end] % 2 == 0)
                end--;
            if (start < end)
                Util.change(nums, start, end);
        }
        return nums;
    }
}
