package com.fdmgroup.TreeTraversals;

import com.fdmgroup.TreeStructure.Tree;

public interface TreeTraversals<E extends Comparable<E>> {
	public void inorder(Tree<E> root);
	public void dfs(); 
	public void levelorder(Tree<E> root);
}
