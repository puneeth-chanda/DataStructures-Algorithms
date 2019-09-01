public class AVL{
    protected AVLNode root;
    public void insert(int val){
        if(root==null){
            root = new AVLNode(val);
        }
        else{
            root.insert(val);
        }
    }
    public boolean search(int val){
        if(root == null){
            return false;
        }
        else{
            return root.search(val);
        }

    }
    public AVLNode searchNode(int val){
        if(root==null){
            return null; 
        }
        else{
            return root.searchNode(val);
        }
    }
    public void inorder(){
        if(root==null){
            return;
        }
        else{
            root.inorder();
        }
    }
    public void postorder(){
        if(root==null){
            return;
        }
        else{
            root.postorder();
        }
    }
    public void preorder(){
        if(root==null){
            return;
        }
        else{
            root.preorder();
        }
    }
    public int height(){
        if(root==null){
            return 0;
        }
        else{
            return root.height();
        }
    }
    public AVLNode maxNode(){
        if(root.isLeaf()){
            return root;
        }
        else{
            return root.maxNode();
        }
    }
    public AVLNode sucessor(int val){
        AVLNode b = searchNode(val);
        return b.right;
    }
    public AVLNode predecessor(int val){
        AVLNode b = searchNode(val);
        return b.left;
    }
}