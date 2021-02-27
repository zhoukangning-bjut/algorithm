package leedcode;

import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，
 * 请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 你可以按任意顺序返回答案。
 * <p>
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 */
public class TwoSum {

    public static void testMethod() {
        int[] data = new int[]{3, 3};
        int[] result = method(data, 6);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static void testMethod1() {
        int[] data = new int[]{3, 3};
        int[] result = method1(data, 6);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        testMethod();
        System.out.println("-----------------------------");
        testMethod1();
    }

    /**
     * 暴力求解
     */
    public static int[] method(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }

        }
        return new int[0];
    }



    /**
     * 哈希表
     */
    public static int[] method1(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{i, hashMap.get(target - nums[i])};
            }
            hashMap.put(nums[i], i);
        }
        return null;
    }
}

