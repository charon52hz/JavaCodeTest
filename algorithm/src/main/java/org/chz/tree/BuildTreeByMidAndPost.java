package org.chz.tree;

import java.util.HashMap;

public class BuildTreeByMidAndPost {
    HashMap<Integer,Integer> map = new HashMap();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null) return null;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return findNode(inorder,0,inorder.length,
                postorder,0, postorder.length);
    }

    private TreeNode findNode(int[] inorder, int beginIn, int endIn,
                              int[] postorder, int beginPost, int endPost){
        if (beginIn >= endIn || beginPost >= endPost){
            return null;
        }
        int rootIndex = map.get(postorder[endPost - 1]);
        TreeNode root = new TreeNode(inorder[rootIndex]);
        int leftNum = rootIndex - beginIn;
        root.left = findNode(inorder,beginIn,rootIndex,
                postorder,beginPost,beginPost+leftNum);

        root.right = findNode(inorder,rootIndex + 1,endIn,
                postorder,beginPost + leftNum,endPost - 1);

        return root;
    }
}
