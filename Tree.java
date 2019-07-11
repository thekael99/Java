import java.util.Scanner;

public class Tree {
    public BST bst;

    public Tree() {
        this.bst = new BST();
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.bst.add(10);
        tree.bst.add(12);
        tree.bst.add(6);
        tree.bst.add(5);
        tree.bst.add(7);
        tree.bst.show();
    }
}