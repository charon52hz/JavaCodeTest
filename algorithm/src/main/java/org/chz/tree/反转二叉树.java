package org.chz.tree;

public class 反转二叉树 {
    public static void main(String[] args) {
        TreeNode root = null;
        new Solution().invertTree(root);
    }

    static class Solution {
        public TreeNode invertTree(TreeNode root) {
            if (root == null) return null;
            TreeNode tmp = null;
            tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            invertTree(root.left);
            invertTree(root.right);
            return root;
        }

    }
}
