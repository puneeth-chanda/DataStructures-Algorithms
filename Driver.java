
public class Driver {
	public static void main(String[] args) {
		AVLTree avl = new AVLTree();
		System.out.println("Insertion sequence: 15, 10, 5");
		avl.insert(15); avl.insert(10); avl.insert(5);
		System.out.print("preorder: "); avl.preorder();
System.out.print("inorder: "); avl.inorder();

	}

}
