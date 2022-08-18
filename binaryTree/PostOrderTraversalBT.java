package binaryTree;

public class PostOrderTraversalBT {
	
	 public static void main(String[] args) throws Exception {

	 BT bt = BT.create();

	 System.out.println("printing nodes of a binary tree on post order in Java"); 
	 bt.postOrder();
	 }
	 }

	 class BT
	 {
	 static class TreeNode
	 {
	 String data; TreeNode left, right;
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
	public void postOrder() 
	{ 
	postOrder(root); 
	}
	 private void postOrder(TreeNode node)
	 {
	 if (node == null) 
	{
	 return; 
	}
	 postOrder(node.left); 
	postOrder(node.right);
	 System.out.printf("%s ", node.data);

	  }
	public static BT create()
	 {
	 BT tree = new BT();
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
