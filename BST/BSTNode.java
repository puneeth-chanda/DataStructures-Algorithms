
public class BSTNode {
	public int data;
	public BSTNode right;
	public BSTNode left;
	BSTNode(int d){
		this.data = d;
	}
	public void insert(int val){
		if(val<data){
			if(left==null){
				left = new BSTNode(val);
			}
			else{
				left.insert(val);
			}
		}
		else{
			if(right==null){
				right = new BSTNode(val);
			}
			else{
				right.insert(val);
			}
		}
	}
	public boolean search(int val){
		if(data ==val){
			return true;
		}
		else if(left!=null && val<data){
			return left.search(val);
		}
		else if(right!=null && val>data){
			return right.search(val);
		}
		else{
			return false;
		}
	}

	public void inorder(){
		if(left!=null){
			left.inorder();
		}
		System.out.println(data);
		if(right!=null){
			right.inorder();
		}
	}
	public void postorder(){
		if(left!=null){
			left.postorder();
		}
		if(right!=null){
			right.postorder();
		}
		System.out.println(data);
	}
	public void preorder(){
		System.out.println(data);
		if(left!=null){
			left.preorder();
		}

		if(right!=null){
			right.preorder();
		}
	}
	public boolean isLeft(){
		if(left==null && right==null){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean hasOnlyLeft(){
		if(left!=null && right==null){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean hasOnlyRight(){
		if(right!=null && left==null){
			return true;
		}
		else{
			return false;
		}
	}
	public int height(){
		if(isLeft()) {
			return 0;
		}
		else if(hasOnlyLeft()){
			return left.height()+1;
		}
		else if(hasOnlyRight()){
			return right.height()+1;
		}
		else{
			return max(left.height(),right.height()+1);
		}
	}
	public int max(int a, int b){
		if(a>b){
			return a;
		}
		else{
			return b;
		}
	}
}
