package com.example.revature;

public class BinaryTree {
	
	
	 Node root;
	    
	    public BinaryTree() { root = null; }   //constructor
	    
	    //function to print level order traversal of tree
	    
	    void printLevelOrder()
	    {
	        int h = height(root);
	        int i;
	        for(i=0;i<=h;i++) 
	            PrintGivenLevel(root,i);
	    }
	    
	    //function for computing height
	    
	    int height(Node root)
	    {
	        if(root == null)
	            return 0;
	        else
	        {
	            int Leftheight = height(root.left);
	            int Rightheight = height(root.right);
	            //larger one
	            if(Leftheight > Rightheight)
	                return (Leftheight + 1);
	            else return (Rightheight + 1);
	        }
	    }
	    
	    /* Print nodes at the given level */
	    
	    void PrintGivenLevel (Node root ,int level) 
	    { 
	        if (root == null) 
	            return; 
	        if (level == 1) 
	            System.out.print(root.data + " "); 
	        else if (level > 1) 
	        { 
	            PrintGivenLevel(root.left, level-1); 
	            PrintGivenLevel(root.right, level-1); 
	        } 
	    } 

}
