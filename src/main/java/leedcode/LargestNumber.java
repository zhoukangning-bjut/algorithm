package leedcode;

import java.util.Arrays;

public class LargestNumber {
    /**
     * 179. 最大数
     * 给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）
     * 使之组成一个最大的整数。
     * <p>
     * 注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
     * 示例 1：
     * <p>
     * 输入：nums = [10,2]
     * 输出："210"
     * 示例 2：
     * <p>
     * 输入：nums = [3,30,34,5,9]
     * 输出："9534330"
     */
    public static void main(String[] args) {
        int[] nums = new int[]{10, 2, 9, 39, 17};
        String res = largestNumber(nums);
        System.out.println(res);
    }

    public static String largestNumber(int[] nums) {
        int n = nums.length;
        String numsToWord[] = new String[n];
        for (int i = 0; i < n; i++) {
            numsToWord[i] = String.valueOf(nums[i]);
        }
        //compareTo()方法比较的时候是按照ASCII码逐位比较的
        //通过比较(a+b)和(b+a)的大小，就可以判断出a,b两个字符串谁应该在前面
        //所以[3,30,34]排序后变为[34,3,30]
        //[233，23333]排序后变为[23333，233]
        Arrays.sort(numsToWord, (a, b) -> {
            return (b + a).compareTo(a + b);
        });
        //如果排序后的第一个元素是0，那后面的元素肯定小于或等于0，则可直接返回0
        if (numsToWord[0].equals("0")) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(numsToWord[i]);
        }
        return sb.toString();
    }

}
