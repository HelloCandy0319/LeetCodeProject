package com.leetcode.project.test;

/**
 * @author thh
 * @version 1.0
 * @date 2020/6/2 11:14 下午
 *
 * 面试题58 - II. 左旋转字符串
 */

/**
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 *
 *  
 *
 * 示例 1：
 *
 * 输入: s = "abcdefg", k = 2
 * 输出: "cdefgab"
 * 示例 2：
 *
 * 输入: s = "lrloseumgh", k = 6
 * 输出: "umghlrlose"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TransWordTest {

    public static void main(String[] args) {
        System.out.println(reverseLeftWords("abcdefg",2));
    }

    private static String reverseLeftWords(String s, int n) {
        if (n<0){
            return s;
        }
        if (n>=s.length()){
            return s;
        }
        String subStr = s.substring(n);
        String begStr = s.substring(0,n);
        return subStr+begStr;
    }
}
