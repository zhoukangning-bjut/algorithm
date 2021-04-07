package leedcode;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    /**
     * 78. 子集
     * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
     * <p>
     * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
     * 示例 1：
     * <p>
     * 输入：nums = [1,2,3]
     * 输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
     * 示例 2：
     * <p>
     * 输入：nums = [0]
     * 输出：[[],[0]]
     */
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3};
        List<List<Integer>> result = subsets(data);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List temp = new ArrayList<Integer>();
        backTrack(0, nums, result, temp);
        return result;
    }

    public static void backTrack(int i, int[] nums,
                                 List<List<Integer>> result, List<Integer> temp) {
        result.add(new ArrayList<>(temp));
        for (int j = i; j < nums.length; j++) {
            temp.add(nums[j]);
            backTrack(j + 1, nums, result, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
