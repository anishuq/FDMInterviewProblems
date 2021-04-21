package com.fdmgroup.TreeTraversals;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

import com.fdmgroup.TreeStructure.Tree;

public class BSTtraversals<E extends Comparable<E>> implements TreeTraversals<E>{

	public void inorder(Tree<E> node) {
		if(node != null) {
			inorder(node.left);
			System.out.println(node.element);
			inorder(node.right);
		}
	}

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
		/*
		Queue<Integer> queue = new LinkedList<Integer>();
		if(root.element instanceof Integer)
				queue.add((Integer) root.element);
		*/
		
	}
}
