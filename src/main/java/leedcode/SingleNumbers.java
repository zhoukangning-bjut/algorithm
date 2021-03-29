package leedcode;

import java.util.ArrayList;

public class SingleNumbers {

    /**
     * 剑指 Offer 56 - I. 数组中数字出现的次数
     * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
     * 示例 1：
     * <p>
     * 输入：nums = [4,1,4,6]
     * 输出：[1,6] 或 [6,1]
     * 示例 2：
     * <p>
     * 输入：nums = [1,2,10,4,1,4,3,3]
     * 输出：[2,10] 或 [10,2]
     */
    public static void main(String[] args) {
        int[] data = new int[]{1,2,2,5};
        singleNumbers(data);
    }

    /**
     * 分组计算，^,&
     * @param nums
     * @return
     */
    public static int[] singleNumbers(int[] nums) {
        int n = 0;
        int a = 0;
        int b = 0;
        for (int i : nums)
            n = i ^ n;
        int mask = 1;
        while ((mask & n) == 0)
            mask = mask << 1;
        for (int i : nums) {
            if ((mask & i) == 0)
                a = a ^ i;
            else
                b = b ^ i;
        }
        return new int[]{a, b};
    }
}
