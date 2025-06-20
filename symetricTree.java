class Solution {
    public boolean isSymmetric(TreeNode root) {
        return recursion(root.left,root.right);
    }
    boolean recursion(TreeNode p,TreeNode q)
    {
        if(p==null || q==null)
        {
            return p==q;
        }

        if(p.val!=q.val)
        {
            return false;
        }

        return recursion(p.left,q.right)&&recursion(p.right,q.left);
    }

    
}
