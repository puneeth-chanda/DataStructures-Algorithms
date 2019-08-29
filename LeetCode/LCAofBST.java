/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(search(p,q.val)){
            // System.out.println(":)");
            return p;
        } 
        else if(search(q,p.val)) return q;
        // else System.out.println(search(p,q.val));
        return lca(root, p, q);
    }
    TreeNode dummy;
    public TreeNode lca(TreeNode root, TreeNode p, TreeNode q){
        if(search(root,p.val) && search(root,q.val)){
            dummy = root;
            if((p.val<root.val && q.val>root.val) || (q.val<root.val && p.val>root.val)){
                return dummy;
            }
        }
        if(p.val<root.val && q.val<root.val){
            if(root.left != null){
                lca(root.left,p,q);
                
            }
        }
        else if(root.right != null){
            lca(root.right,p,q);
           
        }
        return dummy;
    }
    public boolean search(TreeNode root, int key) {
        if(root == null) return false;
		if(key == root.val) return true;
		else if(key < root.val) {
            // System.out.println(key + " " + root.val);
			if(root.left == null) return false;
			return search(root.left,key);
		}
		else {
			if(root.right == null) return false;
			return search(root.right,key);
		}
	}
}