package com.fdmgroup.TreeStructure;

public class Tree<E> {

	public E element;
	
	public Tree<E> left;
	public Tree<E> right;
	
	
	public Tree(E element) {
		super();
		this.element = element;
		this.left = null;
		this.right = null;
	}
}
