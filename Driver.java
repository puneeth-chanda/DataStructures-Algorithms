
public class Driver {

	public static void main(String[] args) {
		BinarySearchTree bst1 = new BinarySearchTree();
		Node root = bst1.insert(null, 4);
		bst1.insert(root, 4);
		bst1.insert(root,5);
		bst1.insert(root,2);
		bst1.insert(root,0);
		bst1.inorder(root);
		bst1.max(root);

	}

}
