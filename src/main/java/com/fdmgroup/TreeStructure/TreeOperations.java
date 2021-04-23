package com.fdmgroup.TreeStructure;

public interface TreeOperations<E extends Comparable<E>> {
	public void create(TreeNode<E> root);
	public boolean search(TreeNode<E> root, TreeNode<E> node);
	public void delete(TreeNode<E> root, TreeNode<E> node);
	public int getHeight(TreeNode<E> root);
	
	public int getMax(TreeNode<E> root);
	public int getMin(TreeNode<E> root);
}
