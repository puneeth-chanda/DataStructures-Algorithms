
public class BinarySearchTree {
    protected BSTNode root;
    
    public void insert(int key) {
        if (root == null)
            root = new BSTNode(key);
        else
            root.insert(key);
    }
    public void inorder() {
        if (root == null)
            return;
        else
            root.inorder();
    }
    public void search(int key) {
    	if(root==null) {
    		return root;
    	}
    	else {
    		root.search(key);
    	}
    }
}