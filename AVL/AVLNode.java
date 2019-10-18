
public class AVLNode {
	protected int data;
	protected AVLNode left;
	protected AVLNode right;
	protected int balanceFactor =0;
	public AVLNode(int data) {
		this.data = data;
		this.balanceFactor = 0;
	}
	public AVLNode insert(int key) {
		if(key<data) {
			if(left==null) {
			left = new AVLNode(key);
			}
			else {
				left.insert(key);
		}
	}
		if(key>data) {
			if(right==null) {
				right = new AVLNode(key);
		}
			else {
				right.insert(key);
			}
	}
	balanceFactor = computeBalance();
	switch(balanceFactor) {
	case 2:
		if(left.balanceFactor >=0) {
			return rotateWithLeftChild();
		}
		else {
			left = left.rotateWithLeftChild();
			return rotateWithLeftChild();
		}
	case -2:
		if(right.balanceFactor<=0) {
			return rotateWithRightChild();
		}
		else {
			right = right.rotateWithRightChild();
			return rotateWithRightChild();
		}
			
		}
	return this;
	}
	public void inorder() {
		if(left!=null) {
			left.inorder();
		}
		System.out.print(data+" ");
		if(right!=null) {
			right.inorder();
		}
	}
	public void postorder() {
		if(left!=null) {
			left.postorder();
		}

		if(right!=null) {
			right.postorder();
		}
		System.out.print(data+" ");
	}
	public void preorder() {
		System.out.print(data+" ");
		if(left!=null) {
			left.preorder();
		}
		if(right!=null) {
			right.preorder();
		}
	}
	public boolean search(int key) {
		if(data==key) {
			return true;
		}
		else if(left!=null && key<data) {
			left.search(key);
		}
		else if(right!=null && key>data) {
			right.search(key);
		}
		return false;
	}
	public boolean isLeaf() {
		if(left==null && right==null) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean hasOnlyLeft() {
		if(left!=null && right==null) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean hasOnlyRight() {
		if(right!=null && left==null) {
			return true;
		}
		else {
			return false;
		}
	}
	public int height(){
		if(isLeaf()) {
			return 0;
		}
		else if(hasOnlyRight()) {
			return right.height() +1;
		}
		else if(hasOnlyLeft()) {
			return right.height() +1;
		}
		else {
			return max(left.height(),right.height())+1;
		}
	}
	public int max(int a,int b) {
		if(a>b) {
			return a;
	}
		else {
			return b;
		}
	}
    public AVLNode rotateWithLeftChild() {
    	AVLNode lc = left;
    	left = lc.right;
    	lc.right = this;
    	computeBalance(); lc.computeBalance();
    	return lc;
    }

    public AVLNode rotateWithRightChild() {
    	AVLNode rc = right;
    	right = rc.left;
    	rc.left = this;
    	computeBalance(); rc.computeBalance();
    	return rc;
    }

    public int computeBalance() {
        if (isLeaf()) return 0;
        else if (hasOnlyLeft()) {
        	return left.height()+1;
        }
        else if (hasOnlyRight()) {
        	return -1 * (right.height()+1);
        }
        else {
        	return left.height() - right.height();
        }
    }
}
