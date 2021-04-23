package com.fdmgroup.TreeStructure;

import java.util.LinkedList;
import java.util.Queue;

public class BSTimplementation<E extends Comparable<E>> implements TreeOperations<E> {

	private TreeNode<E> root;
	private TreeNode<E> searchedNode;
	
	//for delete operation. Generated in the search function.
	private TreeNode<E> parent;
	
	public BSTimplementation(E[] objects) {
		for(E e : objects)
			create(new TreeNode<E>(e));
	}
	
	public TreeNode<E> getRoot() {
		return root;
	}
	
	public void setRoot(TreeNode<E> root) {
		this.root = root;
	}

	public TreeNode<E> getParent() {
		return parent;
	}

	public void setParent(TreeNode<E> parent) {
		this.parent = parent;
	}

	
	public TreeNode<E> getSearchedNode() {
		return searchedNode;
	}

	public void setSearchedNode(TreeNode<E> searchedNode) {
		this.searchedNode = searchedNode;
	}

	/**
	 * 
	 */
	public void create(TreeNode<E> node) {
		if(root == null)
			root = node;
		else {
			TreeNode<E> current = root;
			TreeNode<E> parent = null;
			
			while(current!=null) {
				parent = current;
				if(node.getElement().compareTo(current.getElement()) < 0) {
					current = current.left;
				}else {
					current = current.right;
				}
			}
			
			if(node.getElement().compareTo(parent.getElement()) < 0) {
				parent.left = node;
			}else {
				parent.right = node;
			}
		}
		
		
	}

	public boolean search(TreeNode<E> root, TreeNode<E> node) {
		TreeNode<E> current = root;
		parent = null;
		
		while(current!=null) {
			if(node.getElement().compareTo(current.getElement()) < 0) {
				parent = current;
				current = current.left;
			}else if (node.getElement().compareTo(current.getElement()) > 0){
				parent = current;
				current = current.right;
			}else if (node.getElement().compareTo(current.getElement()) == 0) {
				this.setParent(parent);
				this.setSearchedNode(current);
				return true;
			}
		}
		
		return false;
	}

	
	public int getHeight(TreeNode<E> root) {
		System.out.println("-------------Tree Height---------------");
		int height = 0;
		Queue<TreeNode<E>> queue = new LinkedList<TreeNode<E>>();
		
		if(root != null) 
			queue.add(root);
		
		
		while(true) {
			int nodes = queue.size();
			//nodes contain the number of nodes at each LEVEL. 
			
			//when "NODES" is ZERO it means every node has been
			//popped from the queue in the last level and
			//we don't need to go any further.
			if(nodes == 0) return height;
			
			//after crossing each level 
			height++;
			while (nodes > 0) {
				TreeNode<E> n = queue.remove();
				nodes--;
				
				if (n.left != null)
					queue.add(n.left);

				if (n.right != null)
					queue.add(n.right);
			}
		}
		
	}

	public void mirrorTree(TreeNode<E> root) {
		System.out.println("-------------Mirrored Tree---------------");
		TreeNode<E> temp = null;
		
		Queue<TreeNode<E>> queue = new LinkedList<TreeNode<E>>();
		queue.add(root);
		 
		
		while(!queue.isEmpty()) {
			TreeNode<E> n = queue.remove();
			System.out.println(n.getElement());
			//swap left and right child of n.
			temp = n.left;
			n.left = n.right;
			n.right = temp;
			
			if(n.left != null)
				queue.add(n.left);
			
			if(n.right != null)
				queue.add(n.right);  
			
		}
	}

	public int getMax(TreeNode<E> root) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMin(TreeNode<E> root) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	public void delete(TreeNode<E> root, TreeNode<E> node) {
		if (search(root, node)) {
			System.out.println("------------Searched Node Found For Deletion--------------");
			node = this.getSearchedNode();
			TreeNode<E> parent = this.getParent();

			// ============================================================================================
			// //
			// the node to be deleted is a LEAF.
			if ((node.left == null) && (node.right == null)) {
				if (parent != null) {
					if ((parent.left != null) && (parent.left.getElement().compareTo(node.getElement()) == 0)) {
						parent.left = null;
					} else if ((parent.right != null) && (parent.right.getElement().compareTo(node.getElement()) == 0)) {
						parent.right = null;
					}
				} else {// parent null means its ROOT and here its a ONE node tree..
					this.setRoot(null);
				}
			}
			// ============================================================================================
			
			// ============================================================================================
			// Node to be deleted has only ONE child
			if ((node.left != null) && (node.right == null)) {
				if (parent != null) {// node is not ROOT
					if ((parent.left != null) && (parent.left.getElement().compareTo(node.getElement()) == 0)) {
						parent.left = node.left;
					} else if ((parent.right != null) && (parent.right.getElement().compareTo(node.getElement()) == 0)) {
						parent.right = node.left;
					}
				} else {// node is ROOT
					this.setRoot(node.left);
				}
			}

			if ((node.left == null) && (node.right != null)) {
				if (parent != null) {// node is not Root
					if ((parent.left != null) && (parent.left.getElement().compareTo(node.getElement()) == 0)) {
						parent.left = node.right;
					} else if ((parent.right != null) && (parent.right.getElement().compareTo(node.getElement()) == 0)) {
						parent.right = node.right;
					}
				} else {// node is ROOT
					this.setRoot(node.right);
				}
			}
			// ============================================================================================ 
			

			// ============================================================================================
			// Node to be deleted has TWO children 
			if ((node.left != null) && (node.right != null)) {
				//find successor
				TreeNode<E> successorParent = node;
				TreeNode<E> successor = node.right;
				while(successor.left != null) {
					successorParent = successor;
					successor = successor.left;
				}
				
				node.setElement(successor.getElement());
				
				//if the successor is the immediate right child of the node to be deleted.
				if( node.right.getElement().compareTo(successor.getElement()) == 0 ){
					//successorParent is root.
					node.right = null;
				}else {
					successorParent.left = null;
				}
			}
			// ============================================================================================
			// 
		}
	}
}
