import java.util.*;

public class BST{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] arr = str.split(" ");
        Node root = new Node();
        root.setValue(Integer.parseInt(arr[0]));
        for(int i = 1; i < arr.length; i++){
            int n = Integer.parseInt(arr[i]);
            insert(n, root);
        }
        inOrder(root);
        System.out.println("");
        preOrder(root);
        System.out.println("");
        posOrder(root);
    }
    public static void inOrder(Node n){
        if(n == null){
            return;
        }
        inOrder(n.left);
        System.out.print(n.val+" ");
        inOrder(n.right);
    }

    public static void preOrder(Node n){
        if (n == null){
            return;
        }
        System.out.print(n.val+" ");
        preOrder(n.left);
        preOrder(n.right);
    }

    public static void posOrder(Node n){
        if (n == null){
            return;
        }
        posOrder(n.left);
        posOrder(n.right);
        System.out.print(n.val+" ");
    }
    public static void insert(int val, Node root){
        Node newNode = new Node();
        newNode.setValue(val);
        Node cur = root;
        Node parent = null;
        while(cur != null){
            if(cur.val < val){
                parent = cur;
                cur = cur.right;
            }
            else if(cur.val > val){
                parent = cur;
                cur = cur.left;
            }
        }
        if(parent.val < val){
            parent.right = newNode;
        }
        else if(parent.val > val){
            parent.left = newNode;
        }
    }
}

class Node{
    public int val;
    public Node left;
    public Node right;
    public void setValue (int val){
        this.val = val;
    }
}


