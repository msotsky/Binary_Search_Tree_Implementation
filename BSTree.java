public class BSTree {
    private Node root;

    public BSTree(){
        root = null;
    }

    public void insert(int input){
        Node nodeIn = new Node(input);

        if(root == null){
            root = nodeIn;
        }
        else{
            insertR(nodeIn, root);
        }
    }

    private void insertR(Node nodeIn, Node curr){

        if(nodeIn.data < curr.data){
            if(curr.left == null){
                curr.left = nodeIn;
            }
            else{
                insertR(nodeIn, curr.left);
            }
        }
        else if (nodeIn.data > curr.data){
            if(curr.right == null){
                curr.right = nodeIn;
            }
            else{
                insertR(nodeIn, curr.right);
            }
        }
        else{
            System.out.println("Data " + nodeIn.data + " already in tree");
        }
    }

    public void printInOrder(){
        if(root != null){
            printIO(root);
        }
    }

    //(Left, current, right)
    private void printIO(Node curr){
        if(curr.left != null){
            printIO(curr.left);
        }

        System.out.print(curr.data + " ");

        if(curr.right != null){
            printIO(curr.right);
        }
    }

    private class Node{
        public Node left;
        public Node right;
        public int data;

        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
}
