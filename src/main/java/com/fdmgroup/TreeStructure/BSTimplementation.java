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
				if(node.element.compareTo(current.element) < 0) {
					parent = current;
					current = current.left;
				}else {
					parent = current;
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

	public void search(Tree<E> root, Tree<E> node) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Tree<E> root, Tree<E> node) {
		// TODO Auto-generated method stub
		
	}

	public int getHeight(Tree<E> root) {
		// TODO Auto-generated method stub
		return 0;
	}

}
