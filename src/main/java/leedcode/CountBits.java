package leedcode;

public class CountBits {
    /**
     * 338. 比特位计数
     * 给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，
     * 计算其二进制数中的 1 的数目并将它们作为数组返回。
     * <p>
     * 示例 1:
     * <p>
     * 输入: 2
     * 输出: [0,1,1]
     * 示例 2:
     * <p>
     * 输入: 5
     * 输出: [0,1,1,2,1,2]
     */
    public static void main(String[] args) {
        int[] data = countBits(7);
        for (int i : data){
            System.out.println(i);
        }
    }

    /**
     * 奇数：二进制表示中，奇数一定比前面那个偶数多一个 1，因为多的就是最低位的 1。
     *           举例：
     *          0 = 0       1 = 1
     *          2 = 10      3 = 11
     * 偶数：二进制表示中，偶数中 1 的个数一定和除以 2 之后的那个数一样多。
     * 因为最低位是 0，除以 2 就是右移一位，也就是把那个 0 抹掉而已，
     * 所以 1 的个数是不变的。
     *
     * @param num
     * @return
     */
    public static int[] countBits(int num) {
        int[] result = new int[num + 1];
        result[0] = 0;
        for (int i = 1; i <= num; i++) {
            if ((i & 1) == 0) {//偶数
                result[i] = result[i / 2];
            } else { //奇数
                result[i] = result[i - 1] + 1;
            }
        }
        return result;
    }
}
