package leedcode;

public class ReverseWords {
    /**
     * 剑指 Offer 58 - I. 翻转单词顺序
     * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。
     * <p>
     * <p>
     * <p>
     * 示例 1：
     * <p>
     * 输入: "the sky is blue"
     * 输出: "blue is sky the"
     * 示例 2：
     * <p>
     * 输入: "  hello world!  "
     * 输出: "world! hello"
     * 解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
     */
    public static void main(String[] args) {
        String s = "  hello world!  ";
        System.out.println(reverseWords(s));
        System.out.println(s.trim().charAt(11));
    }

    public static String reverseWords(String s) {
        s = s.trim();
        int i = s.length() - 1;
        int j = i;
        StringBuffer str = new StringBuffer();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') i--;
            str.append(s.substring(i + 1, j + 1) + " ");
            while (i >= 0 && s.charAt(i) == ' ') i--;
            j = i;
        }
        return str.toString().trim();
    }
}
