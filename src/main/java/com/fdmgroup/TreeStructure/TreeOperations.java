package com.fdmgroup.TreeStructure;

public interface TreeOperations<E extends Comparable<E>> {
	public void create(Tree<E> root);
	public void search(Tree<E> root, Tree<E> node);
	public void delete(Tree<E> root, Tree<E> node);
	public int getHeight(Tree<E> root);
}
