package com.fdmgroup.app;

import java.util.Optional;

import com.fdmgroup.TreeStructure.*;
import com.fdmgroup.TreeTraversals.*;


public class MainApp {
	public static  void main(String[] args) {
		//Integer[] intArr = {40, 20, 60, 10, 30, 50, 70}; 
		//Integer[] intArr = {100, 110, 120, 130};
		//Integer[] intArr = {100, 90, 80, 70};
		//Integer[] intArr = {63, 47, 71};
		//Input from Data Structure & Algorithms in Java By Robert Lafore, page - 315. 
		Integer[] intArr = {63, 47, 71, 22, 53, 67, 11, 33, 50, 60, 17, 49, 51};
		
		BSTimplementation<Integer> bstimplementation = new BSTimplementation<Integer>(intArr); 
		
		System.out.println(bstimplementation.search(bstimplementation.getRoot(), new TreeNode<Integer>(70)));
		System.out.println(bstimplementation.search(bstimplementation.getRoot(), new TreeNode<Integer>(100)));
		
		TreeTraversals<Integer> traversals = new BSTtraversals<Integer>();
		traversals.inorder(bstimplementation.getRoot());
		
		traversals.dfs();
		
		traversals.levelorder(bstimplementation.getRoot());
		
		System.out.println(bstimplementation.getHeight(bstimplementation.getRoot()));
		
		//deletions test:
		
		bstimplementation.delete(bstimplementation.getRoot(), new TreeNode<Integer>(22));
		
		
		Optional<TreeNode<Integer>> parentWrap = Optional.ofNullable(bstimplementation.getRoot());
		if(parentWrap.isPresent())
			traversals.inorder(bstimplementation.getRoot());
		
		
		
		//Mirror always comes last.
		//bstimplementation.mirrorTree(bstimplementation.getRoot());
	}
}
