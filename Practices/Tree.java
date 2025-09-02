import java.util.*;
public class Tree {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val)
        {
            this.val= val;
            left.next = null;
            right.next = null;
        }
    }
    //Build BT
    public static buildBT(Integer[] arr)
    {
        if(arr.length == 0 && arr[0]== null)
        {
            return null;
        }
        TreeNode root = new TreeNode(arr[0]);
        Queue <TreeNode> que = new LinkedList<>();
        q.add(root);
        int i = 1;
        while(i<arr.length)
        {
            TreeNode curr = que.poll();
            if(i<arr.length && arr[i]!= null)
            {
                que.add(cuur.left = new TreeNode(arr[i]));
            }
            i++;
            if(i<arr.length && arr[i]!= null)
            {
                que.add(cuur.right = new TreeNode(arr[i]));
            }
            i++;
        }
        return root;
    }
}
