package com.alex.leetcode.easy;

import com.alex.datastructures.TreeNode;

public class MaximumDepthBinaryTree104 {

    public int maxDepth(TreeNode root) {

        return maxDepthHelper(root, 0);

    }

    public int maxDepthHelper(TreeNode node, int depth) {

        if (node == null) {
            return depth;
        }

        int leftMax = maxDepthHelper(node.left, depth + 1);
        int rightMax = maxDepthHelper(node.right, depth + 1);

        return Math.max(leftMax, rightMax);

    }


}
