package demo.tree;

public class MainApp {
	public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        Node root = null;

        // Insert values
        /*root = bst.insertValue(root, "Mango");
        root = bst.insertValue(root, "Apple");
        root = bst.insertValue(root, "Orange");
        root = bst.insertValue(root, "Banana");
        root = bst.insertValue(root, "Grapes");*/
        
        root = bst.insertValue(root, "5");
        root = bst.insertValue(root, "1");
        root = bst.insertValue(root, "8");
        //root = bst.insertValue(root, "4");
        //root = bst.insertValue(root, "6");

        System.out.println("Inorder Traversal:");
        bst.inorder(root);

        System.out.println("\nPreorder Traversal:");
        bst.preorder(root);

        System.out.println("\nPostorder Traversal:");
        bst.postorder(root);
    }
}
