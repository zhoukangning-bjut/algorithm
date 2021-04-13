package leedcode;

public class IsUgly {
    /**
     * 263. 丑数
     * 给你一个整数 n ，请你判断 n 是否为 丑数 。如果是，返回 true ；否则，返回 false 。
     *
     * 丑数 就是只包含质因数 2、3 和/或 5 的正整数。
     * 示例 1：
     *
     * 输入：n = 6
     * 输出：true
     * 解释：6 = 2 × 3
     * 示例 2：
     *
     * 输入：n = 8
     * 输出：true
     * 解释：8 = 2 × 2 × 2
     */
    public static void main(String[] args) {
        System.out.println(isUgly(10));
    }

    public static boolean isUgly(int n) {
        if (n < 0)
            return false;
        int[] data = new int[]{2,3,5};
        for (int i : data){
            while (n % i == 0){
                n = n / i;
            }
        }
        return n == 1;
    }
}
