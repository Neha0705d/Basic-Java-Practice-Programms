package binaryTree;

import java.util.Stack;

public class PostOrderTraversal {
	
	 public static void main(String[] args) throws Exception {

	 BTree bt = BTree.create();
	 System.out .println("printing nodes of binary tree on post order using iteration");
	 bt.postOrderWithoutRecursion();
	 }
  }
class BTree 
		{
			static class TreeNode
			{
				 String data;
				 TreeNode left, right;
				 TreeNode(String value)
				 	{
					   this.data = value;
					   left = right = null;
					} 
				boolean isLeaf()
				  {
					return left == null ? right == null : false;
				  }
	        }
				TreeNode root;
   public void postOrderWithoutRecursion() 
		{
		   Stack<TreeNode> nodes = new Stack<>();
		   nodes.push(root);
		while (!nodes.isEmpty()) 
		  {
		   TreeNode current = nodes.peek();
		   if (current.isLeaf()) 
		     {
			   TreeNode node = nodes.pop();
			   System.out.printf("%s ", node.data);
			 }
		   else
			 {
			   if (current.right != null) 
			   	{
				 nodes.push(current.right);
				 current.right = null;
				}
			   
			   if (current.left != null)
			   	{
				   nodes.push(current.left); 
				   current.left = null; 
			   	}
			 }
		  }
	   }
	public static BTree create() 
		{
			BTree tree = new BTree(); 
			TreeNode root = new TreeNode("55");
			tree.root = root;
			tree.root.left = new TreeNode("35");
			tree.root.left.left = new TreeNode("25");
			tree.root.left.left.left = new TreeNode("15"); 
			tree.root.left.right = new TreeNode("45");
			tree.root.right = new TreeNode("65");
			tree.root.right.right = new TreeNode("75"); 
			tree.root.right.right.left = new TreeNode("87");
			tree.root.right.right.right = new TreeNode("98");
			 return tree;
		}
	}
