package binaryTree;

import java.util.Stack;

	public class LeafNodes {
		
		public static void main(String[] args) throws Exception 
		{

			BinaryTree bt = new BinaryTree(); 
			bt.root = new BinaryTree.TreeNode("a");
			bt.root.left = new BinaryTree.TreeNode("b"); 
			bt.root.right = new BinaryTree.TreeNode("f"); 
			bt.root.left.left = new BinaryTree.TreeNode("c"); 
			bt.root.left.right = new BinaryTree.TreeNode("e");
			bt.root.left.left.left = new BinaryTree.TreeNode("d"); 
			bt.root.right.left = new BinaryTree.TreeNode("g"); 
			bt.root.right.right = new BinaryTree.TreeNode("h"); 
			bt.root.right.right.right = new BinaryTree.TreeNode("k");

			System.out .println("total number of leaf nodes of binary tree in Java (recursively)"); 
			System.out.println(bt.countLeafNodesRecursively());
	
			System.out .println("count of leaf nodes of binary tree in Java (iteration)"); 
			System.out.println(bt.countLeafNodes());
			 }
		 }
		 class BinaryTree 
		 {
			 static class TreeNode
			 {
				 String value;
				 TreeNode left, right;
				 TreeNode(String value) 
				 {
					 this.value = value; left = right = null;
				 }
			 boolean isLeaf()
				 {
				 	return left == null ? right == null : false;
				 }
			  }
				  TreeNode root;
				  
			  public int countLeafNodesRecursively()
				 {
				  	return countLeaves(root);
				 }
			  private int countLeaves(TreeNode node)
				 {
				  	if (node == null) return 0; if (node.isLeaf()) 
				   {
				  		return 1;
				   }
				  	else
				  	  {
				  		return countLeaves(node.left) + countLeaves(node.right); 
				  	  }
				 }
		
				public int countLeafNodes()
					{ 
						if (root == null) 
						  { 
							return 0; 
						  } 
				Stack<TreeNode> stack = new Stack<>();
				 	stack.push(root);
				 	int count = 0; 
				while (!stack.isEmpty()) 
					{
					 TreeNode node = stack.pop();
					 if (node.left != null) stack.push(node.left);
					 if (node.right != null) stack.push(node.right);
					 if (node.isLeaf()) count++; } return count;
					 }
}
