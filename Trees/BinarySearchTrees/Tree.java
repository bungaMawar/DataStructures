package Trees.BinarySearchTrees;

public class Tree {
    private TreeNode root;

    public void insert(int value){
        if(root == null){
            root = new TreeNode(value);
        } else{
            root.insert(value);
        }
    }

    public void inOrder(){
        if(root != null){
            root.inOrder();
        }
    }

    public void preOrder(){
        if(root != null){
            root.preOrder();
        }
    }

    public TreeNode get(int value){
        if(root != null){
            return root.get(value);
        }
        return null;
    }

    public int min(){
        if(root == null){
            return Integer.MIN_VALUE;
        } else{
            return root.min();
        }
    }

    public int max(){
        if(root == null){
            return Integer.MAX_VALUE;
        } else{
            return root.max();
        }
    }

    public void delete(int value){
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subTree, int value){
        if(subTree == null){
            return subTree;
        }

        if(value < subTree.getData()){
            subTree.setLeft((delete(subTree.getLeft(), value)));
        } else if(value > subTree.getData()){
            subTree.setRight(delete(subTree.getRight(), value));
        } else{
            //one or no children
            if(subTree.getLeft() == null){
                return subTree.getRight();
            } else if(subTree.getRight() == null){
                return subTree.getLeft();
            }
            //two children
            subTree.setData(subTree.getRight().min());
            subTree.setRight(delete(subTree.getRight(), subTree.getData()));

        }

        return subTree;
    }
}
