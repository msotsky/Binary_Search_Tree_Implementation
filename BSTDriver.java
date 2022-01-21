public class BSTDriver {
    

    public static void main(String[] args) {

        BSTree tree = new BSTree();

        tree.insert(5);
        tree.insert(3);
        tree.insert(8);
        tree.insert(2);
        tree.insert(10);
        tree.insert(3);

        tree.printInOrder();
    }
}
