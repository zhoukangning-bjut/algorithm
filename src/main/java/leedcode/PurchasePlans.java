package leedcode;

import java.util.Arrays;

public class PurchasePlans {
    /**
     * LCP 28. 采购方案
     * 小力将 N 个零件的报价存于数组 nums。小力预算为 target，假定小力仅购买两个零件，要求购买零件的花费不超过预算，请问他有多少种采购方案。
     * <p>
     * 注意：答案需要以 1e9 + 7 (1000000007) 为底取模，如：计算初始结果为：1000000008，请返回 1
     * <p>
     * 示例 1：
     * <p>
     * 输入：nums = [2,5,3,5], target = 6
     * <p>
     * 输出：1
     * <p>
     * 解释：预算内仅能购买 nums[0] 与 nums[2]。
     */
    public static void main(String[] args) {
        int[] nums = new int[]{2, 5, 3, 5};
        int result = purchasePlans(nums, 6);
        System.out.println(result);
    }

    public static int purchasePlans(int[] nums, int target) {
        int mod = 1_000_000_007;
        int ans = 0;
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] > target) right--;
            else {
                ans += right - left;
                left++;
            }
            ans %= mod;
        }
        return ans % mod;
    }
}
