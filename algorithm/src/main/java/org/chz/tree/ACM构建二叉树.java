package org.chz.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ACM构建二叉树 {
    public static void main(String[] args) {
        TreeNode root = ACMBuildTree();
        preOrderTree(root);

    }

    private static void preOrderTree(TreeNode root) {
        if (root == null) return;
        System.out.println();
        preOrderTree(root.left);
        preOrderTree(root.right);
    }

    private static TreeNode ACMBuildTree() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();  //去掉第一个回车
        List<String[]> line = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str = in.nextLine();
            String[] s = str.split(" ");
            line.add(s);
        }

        List<TreeNode> nodes = new ArrayList<>();
        for (int i = 0; i < line.size(); i++) {
            TreeNode node = new TreeNode(line.get(i)[0].charAt(0));
            nodes.add(node);
        }

        for (int i = 0; i < nodes.size(); i++) {
            int leftIndex = Integer.parseInt(line.get(i)[1]);
            int rightIndex = Integer.parseInt(line.get(i)[2]);
            if (leftIndex != 0){
                nodes.get(i).left = nodes.get(leftIndex - 1);
            }
            if (rightIndex != 0) {
                nodes.get(i).right = nodes.get(rightIndex - 1);
            }
        }
        return nodes.get(0);
    }
}
