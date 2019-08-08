
public class BinarySearchTree {
	Node root = null;
	
	public Node search(Node root, int d) {
		if(root == null ) {
			return null;
		}
		else if(root.data == d) {
			return root;
		}
		else if(d<root.data) {
			return search(root.left,d);
		}
		else if(d>root.data) {
			return search(root.right,d);
		}
		return root;
		
	}
	public Node insert(Node root,int d) {
		
		if(root == null ) {
			root = new Node(d);
			return root;
		}
		if(d<root.data) {
			root.left = insert(root.left, d);
		}
		if(d>root.data) {
			root.right = insert(root.right, d);
		}
		return root;
	} 
	public void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data);
		inorder(root.right);
	}
	public Node max(Node root) {
		if(root==null) {
			return root;
		}
		else {
			if(root.right == null) {
				System.out.println(root.data);
				return(root);
			}
			else {
				return(max(root.right));
			}
		}
	}
	public Node min(Node root) {
		if(root==null) {
			return root;
		}
		else {
			if(root.left == null) {
				System.out.print(root.data);
				return(root);
			}
			else {
				return(max(root.left));
			}
		}
	}
	void printPreorder(Node node) 
    { 
        if (node == null) 
            return; 
  
        /* first print data of node */
        System.out.print(node.data + " "); 
  
        /* then recur on left sutree */
        printPreorder(node.left); 
  
        /* now recur on right subtree */
        printPreorder(node.right); 
    } 
	
}
