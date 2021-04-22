package com.fdmgroup.TreeStructure;

public class BSTimplementation<E extends Comparable<E>> implements TreeOperations<E> {

	private TreeNode<E> root;
	
	public BSTimplementation(E[] objects) {
		for(E e : objects)
			create(new TreeNode<E>(e));
	}
	
	public TreeNode<E> getRoot() {
		return root;
	}

	public void create(TreeNode<E> node) {
		if(root == null)
			root = node;
		else {
			TreeNode<E> current = root;
			TreeNode<E> parent = null;
			
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

	public boolean search(TreeNode<E> root, TreeNode<E> node) {
		TreeNode<E> current = root;
		
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

	public void delete(TreeNode<E> root, TreeNode<E> node) {
		// TODO Auto-generated method stub
		
	}

	public int getHeight(TreeNode<E> root) {
		// TODO Auto-generated method stub
		return 0;
	}

}
