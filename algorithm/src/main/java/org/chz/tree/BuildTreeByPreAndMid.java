package org.chz.tree;

import java.util.HashMap;

public class BuildTreeByPreAndMid {
    HashMap<Integer,Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null) return null;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return findNode(preorder,0,preorder.length,
                inorder,0,inorder.length);
    }

    private TreeNode findNode(int[] preorder, int i, int length, int[] inorder, int i1, int length1) {
        if (i >= length || i1 >= length1) return null;
        int rootIndex = map.get(preorder[i]);
        TreeNode root = new TreeNode(inorder[rootIndex]);
        int leftNum = rootIndex - i1;
        root.left = findNode(preorder,i+1,i+1+leftNum,
                inorder,i1,rootIndex);
        root.right = findNode(preorder,i+1+leftNum,length,
                inorder,rootIndex+1,length1);

        return root;
    }
}
