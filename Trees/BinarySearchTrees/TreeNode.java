package Trees.BinarySearchTrees;

public class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;
    
    public TreeNode(int data) {
        this.data = data;
    }

    public int min(){
        if(left == null){
            return data;
        } else{
            return left.min();
        }
    }

    public int max(){
        if(right == null){
            return data;
        } else{
            return right.max();
        }
    }

    public void insert(int value){
        if(value == data){
            return;
        }

        if(value < data){
            if(left == null){
                left = new TreeNode(value);
            } else{
                left.insert(value);
            }
        } else{
            if(right == null){
                right = new TreeNode(value);
            } else{
                right.insert(value);
            }
        }
    }

    public void inOrder(){
        if(left != null){
            left.inOrder();
        }
        System.out.print(data + " ");

        if(right!= null){
            right.inOrder();
        }
    }

    public TreeNode get(int value){
        if(value == data){
            return this;
        }

        if(value < data){
            if(left != null){
                return left.get(value);
            }
        } else{
            if(right != null){
                return right.get(value);
            }
        }

        return null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "data = " + data;
    }
}
