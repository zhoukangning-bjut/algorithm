package leedcode;

public class Search {
    /**
     * 33. 搜索旋转排序数组
     * 整数数组 nums 按升序排列，数组中的值互不相同 。
     * <p>
     * 在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了旋转，
     * 使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ...,
     * nums[k-1]]（下标 从 0 开始 计数）。例如，[0,1,2,4,5,6,7]在下标3处经旋转后可能变
     * 为 [4,5,6,7,0,1,2]。
     * <p>
     * 给你 旋转后 的数组 nums 和一个整数target，如果 nums 中存在这个目标值target，
     * 则返回它的下标，否则返回 -1 。
     * 示例 1：
     * <p>
     * 输入：nums = [4,5,6,7,0,1,2], target = 0
     * 输出：4
     * 示例 2：
     * <p>
     * 输入：nums = [4,5,6,7,0,1,2], target = 3
     * 输出：-1
     */
    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6,7,0,1,2};
        System.out.println(search(nums,0));
    }

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && nums[mid] >= target)
                    right = mid - 1;
                else
                    left = mid + 1;
            } else {
                if (nums[mid] <= target && target <= nums[right])
                    left = mid + 1;
                else
                    right = mid - 1;

            }
        }
        return -1;
    }
}
