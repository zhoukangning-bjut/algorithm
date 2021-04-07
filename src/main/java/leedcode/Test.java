package leedcode;

import java.util.ArrayList;

public class Test {
    /**
     * aabc
     * 样例输出
     * 12
     * 提示
     * 有下列优美的子序列：””, ”a”, “a”, “b”, “c”, “ab”,
     * “ab”, “bc”, “ac”, “ac”, “abc”, “abc”，一共12个。
     */
    public static void main(String[] args) {
        String s = "aabc";
        System.out.println(test(s));
    }

    public static int test(String s) {
        ArrayList<String> res = new ArrayList();
        String temp = " ";
        backTrack(0, s, res, temp);
        for (String ss : res)
            System.out.println(ss);
        return res.size() % 20210101;
    }

    public static void backTrack(int i, String s,
                                 ArrayList<String> res, String temp) {
        res.add(temp);
        for (int j = i; j < s.length(); j++) {
            if (temp.contains(s.substring(j, j + 1))) {
                return;
            }
            temp = temp + s.substring(j, j + 1);
            backTrack(j + 1, s, res, temp);
            temp = temp.substring(0, temp.length() - 1);
        }
    }

}
