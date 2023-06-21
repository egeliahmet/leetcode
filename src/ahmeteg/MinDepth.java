package ahmeteg;

import java.util.ArrayList;
import java.util.Arrays;

public class MinDepth {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode left1=new TreeNode(2);
        root.right=left1;
        TreeNode right1=new TreeNode(20);
        left1.right=right1;

        TreeNode right2=new TreeNode(7);
        right1.right=right2;

        TreeNode left2=new TreeNode(15);
        right2.right=left2;


        System.out.println(minDepth(root,1));
        System.out.println(result.get(0));
        Integer i=result.stream().min(Integer::compareTo).get();
    }
    private static ArrayList<Integer> result=new ArrayList<>();


    public static int minDepth(TreeNode root,int depth) {


        if (root==null)
            return 0;

        if(root.left==null&&root.right==null){
            result.add(depth);
            return depth;
        }
        depth++;
        minDepth(root.left,depth);
        minDepth(root.right,depth);

        return 0;
    }
}
