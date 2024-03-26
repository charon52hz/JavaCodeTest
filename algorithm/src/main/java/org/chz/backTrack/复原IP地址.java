package org.chz.backTrack;

import java.util.ArrayList;
import java.util.List;

public class 复原IP地址 {
    public static void main(String[] args) {
        String s = "25525511135";
        System.out.println(new Solution().restoreIpAddresses(s));
    }

    static class Solution {
        List<String> res = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        public List<String> restoreIpAddresses(String s) {
            if(s.length()>12) return res;
            backtracking(s,0,0);
            return res;
        }
        private void backtracking(String s, int index, int count) {
            if(( count == 4 && index < s.length() )|| count > 4) return;
            if(index >= s.length() && count == 4) {
                res.add(sb.substring(0,sb.length()-1));
                return;
            }
            for(int i = index; i < s.length(); i++) {
                String sub = s.substring(index,i+1);
                if(sub.length() > 3) return;
                if(isIp(sub)){
                    sb.append(sub+"."); //255.255.
                    backtracking(s,i+1,count+1);
                    sb.delete(sb.length()-sub.length()-1, sb.length());
                }
            }

        }

        private boolean isIp(String str) {
            if(str.length() > 3) return false;
            if("0".equals(str)) return true;
            else if(str.charAt(0) == '0') return false;
            int a = Integer.parseInt(str);
            if(a <= 255) return true;
            return false;
        }
    }
}
