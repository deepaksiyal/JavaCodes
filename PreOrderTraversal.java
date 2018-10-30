/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
        ArrayList<Integer>ai;
        int []x;
    void sol(TreeNode b)
    {
        if(b==null)return;
        ai.add(b.val);
        sol(b.left);
        sol(b.right);
    }
    public int[] preorderTraversal(TreeNode A) {
        ai=new ArrayList<Integer>();
        sol(A);
        x=new int[ai.size()];
        
        for(int i=0;i<ai.size();i++)
        {//System.out.println(ai.get(i).intValue());
        x[i]=ai.get(i).intValue();
        }return x;
    }
}