package com.fdmgroup.TreeTraversals;

import java.util.*;


import com.fdmgroup.TreeStructure.TreeNode;

public class BSTtraversals<E extends Comparable<E>> implements TreeTraversals<E>{

	public void inorder(TreeNode<E> node) {
		if(node != null) {
			inorder(node.left);
			System.out.println(node.element);
			inorder(node.right);
		}
	}

	/**
	 * Objective: – Given a Binary Search Tree, Do the Depth First Search/Traversal
	 * 
	 * use Stack. First add the add root to the Stack. Pop
	 * out an element from Stack and add its right and left children to stack. Pop
	 * out an element and print it and add its children. Repeat the above two steps
	 * until the Stack id empty.
	 */
	public void dfs() {
		//create a ad-hoc tree.
		TreeNode<Integer> root = new TreeNode<Integer>(1);
		root.left = new TreeNode<Integer>(2);
		root.left.left = new TreeNode<Integer>(4);
		root.left.right = new TreeNode<Integer>(5);
		
		root.right = new TreeNode<Integer>(3);
		root.right.left = new TreeNode<Integer>(6);
		root.right.right = new TreeNode<Integer>(7);
			
		Stack<TreeNode<Integer>> dfsStack = new Stack<TreeNode<Integer>>();
		dfsStack.add(root);
		
		while(!dfsStack.isEmpty()) {
			TreeNode<Integer> n = dfsStack.pop();
			System.out.println(n.element);
			
			if(n.right != null)
				dfsStack.add(n.right);
			
			if(n.left != null)
				dfsStack.add(n.left);
			
		}
 	}

	public void levelorder(TreeNode<E> root) {
		int b = 0;
		Queue<TreeNode<Integer>> queue = new LinkedList<TreeNode<Integer>>();
		if(root.element instanceof Integer)
				queue.add((TreeNode<Integer>) root);
		
		while(!queue.isEmpty()) {
			TreeNode<Integer> n = queue.remove();
			
			System.out.println(n.element);
			
			if(n.left != null)
				queue.add(n.left);
			
			if(n.right != null)
				queue.add(n.right);
		}
	}
}
