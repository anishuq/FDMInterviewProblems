package com.fdmgroup.TreeStructure;

public class TreeNode<E> {

	private E element;
	
	public TreeNode<E> left;
	public TreeNode<E> right;
	
	
	public TreeNode(E element) {
		super();
		this.element = element;
		this.left = null;
		this.right = null;
	}

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}
}
