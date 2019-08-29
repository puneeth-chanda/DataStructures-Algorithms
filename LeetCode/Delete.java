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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
        {
            return null;
        }
        if(key<root.val)
        {
            root.left=deleteNode(root.left,key);
        }
        else if(key>root.val)
        {
            root.right=deleteNode(root.right,key);
        }
        else
        {
            if(root.left==null)
            {
                root=root.right;
            }
            else if(root.right==null)
            {
                root=root.left;
            }
            else
            {
                root.val=minvalue(root.right);
                root.right=deleteNode(root.right,root.val);
            }
        }
        return root;
        
    }
     public int minvalue(TreeNode root)
    {
        while(root.left!=null)
        {
            root = root.left;
        }
        return(root.val);
    }
}