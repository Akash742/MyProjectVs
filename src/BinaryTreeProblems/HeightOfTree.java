package BinaryTreeProblems;

public class HeightOfTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;

        public static Node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }
    }

    public static int heightOfTree(Node root){
        if(root == null)
        {
            return 0;
        }

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        int maxHeight = Math.max(leftHeight,rightHeight)+1;

        return maxHeight;
    }
   public static void main(String Args[]){
    int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    BinaryTree tree = new BinaryTree();

    Node root = tree.BuildTree(nodes);

    System.out.println(root.data);

    System.out.println(heightOfTree(root));
   } 
}
