import java.util.ArrayList;

public class preOrderItr {
    ArrayList<Integer> list =new ArrayList<>();
    public ArrayList<Integer> preorderItr(TreeNode root) {

preOrder(root);

return  list;
    }
    public void preOrder(TreeNode root){

        if(root!=null){
            list.add(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }

    }

}
