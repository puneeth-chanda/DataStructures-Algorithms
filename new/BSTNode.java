
public class BSTNode {
	protected int data;
	protected BSTNode left;
	protected BSTNode right;
	public BSTNode(int data) {
		this.data = data;
	}
	public void insert(int d) {
		if(d<data) {
			if(left==null) {
				left = new BSTNode(d);
			}
			else {
				left.insert(d);
			}
		}
		else {
			if(right==null) {
				right = new BSTNode(d);
			}
			else {
				right.insert(d);
			}
		}
	}
    public void inorder() {
       
        if (left != null) { 
        	left.inorder();
        }
        System.out.print(data + " ");
        if (right != null) {  
        	right.inorder();
        }
        }
    
    public boolean search(int key) {
        if (key == data)
            return true;
        else if (key < data && left != null)
            return left.search(key);
        else if (key > data && right != null)
            return right.search(key);
        else
            return false;
    }
}
