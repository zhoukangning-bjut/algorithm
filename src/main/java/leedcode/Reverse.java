package leedcode;

public class Reverse {
    /**
     * 7. 整数反转
     * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
     * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
     * 假设环境不允许存储 64 位整数（有符号或无符号）。
     * 示例 1：
     * <p>
     * 输入：x = 123
     * 输出：321
     * 示例 2：
     * <p>
     * 输入：x = -123
     * 输出：-321
     */
    public static void main(String[] args) {
        System.out.println(reverse(-321));

    }
    public static int reverse(int x) {
        long reverse = 0;
        while (x != 0) {
            int temp = x % 10;
            x = x / 10;
            reverse = reverse  * 10 + temp;
        }
        return (int)reverse == reverse? (int)reverse:0;
    }
}
