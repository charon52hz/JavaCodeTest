package org.chz.backTrack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 组合总和III {
    public  static void main(String[] args) {
        System.out.println(new Solution().combinationSum3(3, 9));
    }

    static class Solution {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        public List<List<Integer>> combinationSum3(int k, int n) {
            backtracking(k,n,1);
            return res;
        }

        private void backtracking(int k, int n, int index) {
            if (k == path.size()) {
                if(n == 0) {
                    res.add(new ArrayList<>(path));
                }
                return;
            }
            for (int i = index; i <= 9; i++) {
                path.add(i);
                backtracking(k,n-i,i+1);
                path.remove(path.size()-1);
            }
        }
    }
}
