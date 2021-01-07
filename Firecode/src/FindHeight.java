public class FindHeight {

    public int findHeight(TreeNode root) {

        int a=4;
        if(root==null){
            return 0;
        }
        int right=1+findHeight(root.right);
        int left=1+findHeight(root.left);

        return Math.max(right,left);
    }
}
