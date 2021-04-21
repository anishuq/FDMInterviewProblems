package com.fdmgroup.TreeStructure;

public class Tree<E> {

	E element;
	
	Tree<E> left;
	Tree<E> right;
	
	
	public Tree(E element) {
		super();
		this.element = element;
		this.left = null;
		this.right = null;
	}
}
