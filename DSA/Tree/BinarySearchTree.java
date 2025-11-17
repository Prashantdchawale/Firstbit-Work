package demo.tree;

class Node {
	
    String data;
    Node left, right;

    public Node(String data) 
    {
        this.data = data;
        left = right = null;
    }
}

public class BinarySearchTree {

    // Insert Value (Recursive)
    public Node insertValue(Node root, String value) 
    {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value.compareTo(root.data) > 0) {
            root.right = insertValue(root.right, value);            
        }
        else if (value.compareTo(root.data) < 0) {
            root.left = insertValue(root.left, value);
        }

        return root;
    }


  // Inorder Traversal (Left, Root, Right)
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);					//L           
            System.out.print(root.data + " ");  //N
            inorder(root.right);				//R
        }
    }

    // Preorder Traversal (Root, Left, Right)
    public void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");  //N
            preorder(root.left);				//L
            preorder(root.right);				//R
        }
    }

    // Postorder Traversal (Left, Right, Root)
    public void postorder(Node root) {
        if (root != null) {
            postorder(root.left);				//L
            postorder(root.right);				//R
            System.out.print(root.data + " ");	//N
        }
    }
    }