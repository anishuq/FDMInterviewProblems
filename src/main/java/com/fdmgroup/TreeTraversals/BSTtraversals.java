package com.fdmgroup.TreeTraversals;

import com.fdmgroup.TreeStructure.Tree;

public class BSTtraversals<E extends Comparable<E>> implements TreeTraversals<E>{

	public void inorder(Tree<E> node) {
		if(node != null) {
			inorder(node.left);
			System.out.println(node.element);
			inorder(node.right);
		}
	}

}
