package org.chz.backTrack;

import java.util.ArrayList;
import java.util.List;

public class 组合问题 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        backTrack(n,k,1);
        return res;
    }
    private void backTrack(int n, int k, int startIndex){
        if(path.size() == k){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=startIndex; i <= n - (k - path.size()) + 1; i++){
            path.add(i);
            backTrack(n,k,i+1);
            path.remove(path.size()-1);
        }
    }
    
}
