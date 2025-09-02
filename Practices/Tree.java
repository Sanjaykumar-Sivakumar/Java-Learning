import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val)
    {
        this.val= val;
        left = null;
        right = null;
    }
}


public class Tree {
    
    //Build BT
    public static TreeNode buildBT(Integer[] arr)
    {
        if(arr.length == 0 || arr[0]== null)
        {
            return null;
        }
        TreeNode root = new TreeNode(arr[0]);
        Queue <TreeNode> que = new LinkedList<>();
        que.add(root);
        int i = 1;
        while(i<arr.length)
        {
            TreeNode curr = que.poll();
            if(i<arr.length && arr[i]!= null)
            {
                que.add(curr.left = new TreeNode(arr[i]));
            }
            i++;
            if(i<arr.length && arr[i]!= null)
            {
                que.add(curr.right = new TreeNode(arr[i]));
            }
            i++;
        }
        return root;
    }
    public static List<Integer> lvlorder(TreeNode root)
    {
        if(root == null)
        {
            return null;
        }
        List<Integer> lis = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty())
        {
            TreeNode curr = que.poll();
            lis.add(curr.val);
            if(curr.left!= null)
            {
                que.add(curr.left);
            }
            if(curr.right!= null)
            {
                que.add(curr.right);
            }
        }
        return lis;
    }
    public static void inorder(TreeNode root) {
    if(root == null) 
    return;
    inorder(root.left);
    System.out.print(root.val + " ");
    inorder(root.right);
    }
    public static void preorder(TreeNode root) {
    if(root == null) 
    return;
    System.out.print(root.val + " ");
    preorder(root.left);
    preorder(root.right);
    }
    public static void postorder(TreeNode root) {
    if(root == null) 
    return;
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.val + " ");
    }
    public static void main(String[] args) {
        List<Integer> lis = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true) { 
            int num = sc.nextInt();
            if(num == -1)
            {
                break;
            }
            lis.add(num);
        } 
        Integer[] arr = new Integer[lis.size()];
        int i = 0;
        for(Integer n : lis)
        {
            arr[i++] = n;
        }
        TreeNode root = buildBT(arr);
        
        List<Integer> res = lvlorder(root);
        for(Integer n: res)
        {
            System.out.println(n+" ");
        }
        inorder(root);
        preorder(root);
        postorder(root);
        }

}
