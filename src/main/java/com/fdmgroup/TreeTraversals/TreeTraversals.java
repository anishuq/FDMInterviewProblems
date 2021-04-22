package com.fdmgroup.TreeTraversals;

import com.fdmgroup.TreeStructure.TreeNode;

public interface TreeTraversals<E extends Comparable<E>> {
	public void inorder(TreeNode<E> root);
	public void dfs(); 
	public void levelorder(TreeNode<E> root);
}
