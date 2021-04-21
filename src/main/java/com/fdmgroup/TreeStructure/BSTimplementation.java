package com.fdmgroup.TreeStructure;

public class BSTimplementation<E extends Comparable<E>> implements TreeOperations<E> {

	private Tree<E> root;
	
	public BSTimplementation(E[] objects) {
		for(E e : objects)
			create(new Tree<E>(e));
	}
	
	public Tree<E> getRoot() {
		return root;
	}

	public void create(Tree<E> node) {
		if(root == null)
			root = node;
		else {
			Tree<E> current = root;
			Tree<E> parent = null;
			
			while(current!=null) {
				parent = current;
				if(node.element.compareTo(current.element) < 0) {
					current = current.left;
				}else {
					current = current.right;
				}
			}
			
			if(node.element.compareTo(parent.element) < 0) {
				parent.left = node;
			}else {
				parent.right = node;
			}
		}
		
		
	}

	public boolean search(Tree<E> root, Tree<E> node) {
		Tree<E> current = root;
		
		while(current!=null) {
			if(node.element.compareTo(current.element) < 0) {
				current = current.left;
			}else if (node.element.compareTo(current.element) > 0){
				current = current.right;
			}else if (node.element.compareTo(current.element) == 0) {
				return true;
			}
		}
		
		return false;
	}

	public void delete(Tree<E> root, Tree<E> node) {
		// TODO Auto-generated method stub
		
	}

	public int getHeight(Tree<E> root) {
		// TODO Auto-generated method stub
		return 0;
	}

}
