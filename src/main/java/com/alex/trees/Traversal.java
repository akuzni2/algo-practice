package com.alex.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

public class Traversal {

    class Solution {

        List<Integer> visitedInOrder = new ArrayList<Integer>();

        public List<Integer> inorderTraversal(TreeNode root) {

            if (root != null) {
                inorderTraversal(root.left);
                visitedInOrder.add(root.val);
                inorderTraversal(root.right);
            }

            return visitedInOrder;

        }

    }

}
