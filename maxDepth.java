class Solution {
     static  int count=0;
    public int maxDepth(TreeNode root) {
       
        if(root==null)
            return count;
        else
        {
            return 1+ Math.max(maxDepth(root.left),maxDepth(root.right));
        }
}
}
