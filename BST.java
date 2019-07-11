public class BST {
    public Node root;

    public BST() {
        this.root = null;
    }

    private Node addRecursive(Node sub, int value) {
        if (sub == null)
            return (new Node(value));
        if (sub.value < value)
            sub.right = addRecursive(sub.right, value);
        if (sub.value > value)
            sub.left = addRecursive(sub.left, value);
        return (sub);
    }

    public void add(int value) {
        this.root = addRecursive(this.root, value);
    }

    private boolean containRecursive(Node sub, int value) {
        if (sub == null)
            return (false);
        if (sub.value == value)
            return (true);
        if (sub.value < value)
            return (containRecursive(sub.right, value));
        if (sub.value > value)
            return (containRecursive(sub.left, value));
        return (false);
    }

    public boolean isContain(int value) {
        return (containRecursive(this.root, value));
    }

    private Node searchRecursive(Node sub, int value) {
        if (sub == null)
            return (sub);
        if (sub.value == value)
            return (sub);
        if (sub.value < value)
            return (searchRecursive(sub.right, value));
        if (sub.value > value)
            return (searchRecursive(sub.left, value));
        return (null);
    }

    public Node search(int value) {
        return (searchRecursive(this.root, value));
    }

    private void showData(Node sub) {
        if(sub==null)
            return;
        else
            System.out.print(sub.value + " ");
        if(sub.left!=null)
            showData(sub.left);
        if(sub.right!=null)
            showData(sub.right);
    }

    public void show() {
        showData(this.root);        
    }
}