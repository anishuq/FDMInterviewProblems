package com.fdmgroup.TreeTraversals;

import java.util.*;


import com.fdmgroup.TreeStructure.Tree;

public class BSTtraversals<E extends Comparable<E>> implements TreeTraversals<E>{

	public void inorder(Tree<E> node) {
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
		Tree<Integer> root = new Tree<Integer>(1);
		root.left = new Tree<Integer>(2);
		root.left.left = new Tree<Integer>(4);
		root.left.right = new Tree<Integer>(5);
		
		root.right = new Tree<Integer>(3);
		root.right.left = new Tree<Integer>(6);
		root.right.right = new Tree<Integer>(7);
			
		Stack<Tree<Integer>> dfsStack = new Stack<Tree<Integer>>();
		dfsStack.add(root);
		
		while(!dfsStack.isEmpty()) {
			Tree<Integer> n = dfsStack.pop();
			System.out.println(n.element);
			
			if(n.right != null)
				dfsStack.add(n.right);
			
			if(n.left != null)
				dfsStack.add(n.left);
			
		}
 	}

	public void levelorder(Tree<E> root) {
		Queue<Tree<Integer>> queue = new LinkedList<Tree<Integer>>();
		if(root.element instanceof Integer)
				queue.add((Tree<Integer>) root);
		
		while(!queue.isEmpty()) {
			Tree<Integer> n = queue.remove();
			
			System.out.println(n.element);
			
			if(n.left != null)
				queue.add(n.left);
			
			if(n.right != null)
				queue.add(n.right);
		}
	}
}
