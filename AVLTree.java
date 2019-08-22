
public class AVLTree {
	AVLNode root;
	public void insert(int key) {
		if(root==null) {
			root = new AVLNode(key);
		}
		else {
			root.insert(key);
		}
	}
	
	public void inorder() {
		if(root==null) {
			return;
		}
		else {
			root.inorder();
		}
	}
	public void postorder() {
		if(root==null) {
			return;
		}
		else {
			root.postorder();
		}
	}
	public void preorder() {
		if(root==null) {
			return;
		}
		else {
			root.preorder();
		}
	}
	public int height() {
		if (root == null)
			return 0;
		else
			return root.height();
}
	public boolean search(int key) {
		if(root == null) {
			return false;
		}
		else {
			return root.search(key);
		}
	}
}
