package Trees.BinarySearchTrees;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        
        tree.insert(20);
        tree.insert(19);
        tree.insert(42);
        tree.insert(34);
        tree.insert(12);
        tree.insert(4);

        tree.inOrder();

        System.out.println();
        System.out.println(tree.get(20));
        System.out.println(tree.get(333));

        System.out.println(tree.min());
        System.out.println(tree.max());

        tree.delete(19);
        tree.inOrder();
        System.out.println(); 

        tree.preOrder();
    }
}
