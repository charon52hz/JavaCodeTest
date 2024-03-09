package org.chz.tree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class PathSum {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        List<Integer> path = new ArrayList<>();
        dfs(root,targetSum,res,path);
        return res;
    }

    private void dfs(TreeNode node, int targetSum, List<List<Integer>> res, List<Integer> path){
        path.add(node.val);
        targetSum -= node.val;
        if (node.left == null && node.right == null){
            if (targetSum == 0){
                res.add(new ArrayList<>(path));
            }
            return;
        }
        if (node.left != null){
            dfs(node.left,targetSum,res,path);
            path.remove(path.size()-1);
        }
        if (node.right != null){
            dfs(node.right,targetSum,res,path);
            path.remove(path.size()-1);
        }
    }
}

