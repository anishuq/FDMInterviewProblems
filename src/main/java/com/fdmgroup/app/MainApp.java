package com.fdmgroup.app;

import com.fdmgroup.TreeStructure.*;
import com.fdmgroup.TreeTraversals.*;


public class MainApp {
	public static void main(String[] args) {
		Integer[] intArr = {40, 20, 60, 10, 30, 50, 70}; 
		BSTimplementation<Integer> bstimplementation = new BSTimplementation<Integer>(intArr); 
		
		System.out.println(bstimplementation.search(bstimplementation.getRoot(), new Tree<Integer>(70)));
		System.out.println(bstimplementation.search(bstimplementation.getRoot(), new Tree<Integer>(100)));
		
		TreeTraversals<Integer> traversals = new BSTtraversals<Integer>();
		traversals.inorder(bstimplementation.getRoot());
	}
}
