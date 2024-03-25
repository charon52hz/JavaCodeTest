package org.chz;

public class 最长回文字串 {
    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("babad"));
    }
    static class Solution {
        public String longestPalindrome(String s) {
            int pos1 = 0;
            int pos2 = 0;
            for (int i = 0; i < s.length(); i++) {
                for (int j = i; j < s.length(); j++) {
                    if (isHuiWen(s,i,j) && j - i > pos2 - pos1) {
                        pos1 = i;
                        pos2 = j;
                    }
                }
            }
            return s.substring(pos1,pos2+1);
        }
        private boolean isHuiWen(String s, int start, int end){
            while(start < end) {
                if (s.charAt(start) != s.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    }
}

