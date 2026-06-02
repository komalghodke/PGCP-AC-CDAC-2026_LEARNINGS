package com.demo.trees;

public class MyBinarySearchTree {
	Node root;
	class Node{
		int data;
		Node left,right;
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
		
	}
	public MyBinarySearchTree() {
		this.root = null;
	}
	
	public void insertNode(int key) {
		root=insertData(root,key);
	}

	private Node insertData(Node root, int key) {
		Node newNode=new Node(key);
		//tree is empty, terminating condition for recurssion
		if(root==null) {
			root=newNode;
			return root;
		}else {
			if(key<root.data) {
				root.left=insertData(root.left,key);
			}else {
				root.right=insertData(root.right,key);
			}
			return root;
		}
	}
	
	public void deleteNode(int key) {
		root=deleteData(root,key);
		
	}

	private Node deleteData(Node root, int key) {
	       if(root==null) {
	    	   return null;
	       }else {
	    	   //traverse to find the node
	    	   if(key<root.data) {
	    		   root.left=deleteData(root.left,key);
	    	   }else if(key>root.data) {
	    		   root.right=deleteData(root.right,key);
	    	   }else {
	    		   //found the node to delete
	    		   //1.if the node is leaf node
	    		   if(root.left==null && root.right==null) {
	    		     return null;
	    		   }
	    		   //2. the root has 1 child
	    		   if(root.left==null){
	    			   return root.right;
	    		   }else  if(root.right==null){
	    			   return root.left;
	    		   }
	    		   
	    		   //3. root has 2 children
	    		   root.data=minval(root.right);
	    		   root.right=deleteData(root.right,root.data);
	    	   }
	       }
		   return root;
	}

	private int minval(Node root) {
		int minval=root.data;
		while(root.left!=null) {
			minval=root.left.data;
			root=root.left;
		}
		return minval;
	
	}
	
public boolean search(int key) {
	return searchBinaryTreeRecurssive(root,key);
}

private boolean searchBinaryTreeRecurssive(Node root, int key) {
	if(root!=null) {
	       if(root.data==key) {
	    	   System.out.println("key found");
	    	   return true;
	       }else if(key<root.data) {
	    	   return searchBinaryTreeRecurssive(root.left, key);
	       }else {
	    	   return searchBinaryTreeRecurssive(root.right, key);
	       }
	}
	System.out.println(key + "not found");
	return false;
}

public boolean searchNonRecurssive(int key) {
	return searchBinaryTreeNonRecurssive(root,key);
}

private boolean searchBinaryTreeNonRecurssive(Node root, int key) {
	       if(root!=null) {
	    	   Node temp=root;
	    	   while(temp!=null) {
	    		     if(temp.data==key) {
	    		    	 System.out.println(key +"found");
	    		    	 return true;
	    		     }else if(key<root.data) {
	    		    	   temp=temp.left;
	    		     }else {
	    		    	 temp=temp.right;
	    		     }
	    	   }
	    	   System.out.println(key +" not found");
		    	 return false;
	       }
		   return false;
	
}

public void inorder() {
	inorderTraversal(root);
	System.out.println();
}

private void inorderTraversal(Node root) {
	if(root!=null) {
		inorderTraversal(root.left);
		System.out.print(root.data+",   ");
		inorderTraversal(root.right);
	}
}
	
	public void preorder() {
		preorderTraversal(root);
		System.out.println();
	}

	private void preorderTraversal(Node root) {
		if(root!=null) {
			System.out.print(root.data+",   ");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
	}
		
		public void postorder() {
			postorderTraversal(root);
			System.out.println();
		}

		private void postorderTraversal(Node root) {
			if(root!=null) {
				postorderTraversal(root.left);
				postorderTraversal(root.right);
				System.out.print(root.data+",   ");
			}
}
	

}
