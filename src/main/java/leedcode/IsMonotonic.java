package leedcode;

/**
 * 如果数组是单调递增或单调递减的，那么它是单调的。
 * <p>
 * 如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。
 * 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。
 * <p>
 * 当给定的数组 A 是单调数组时返回 true，否则返回 false。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[1,2,2,3]
 * 输出：true
 */

public class IsMonotonic {

    public static void main(String[] args) {
        int[] data = new int[]{1,3,2};
        System.out.println(isMonotonic(data));
    }

    /**
     *一次遍历
     */
    public static boolean isMonotonic(int[] A) {
        boolean a = true;
        boolean b = true;
        for(int i = 1; i < A.length; i ++){
            if (A[i] > A[i - 1])
                b = false;
            if (A[i] < A[i - 1])
                a = false;
            if (a == false && b == false)
                return false;
        }
        return true;
    }
}
