public class Main {
  public static void main(String[] args) {

    BinaryTree BT = new BinaryTree(72,
                    new BinaryTree(99, null, new BinaryTree(79, new BinaryTree(80, new BinaryTree(85, null, new BinaryTree (83, new BinaryTree (84, null, null), new BinaryTree(82, null, null))), null), null)),
                    new BinaryTree(51, null, new BinaryTree(31, new BinaryTree(46, null, null), new BinaryTree(24, null, new BinaryTree(12, new BinaryTree(20, null, null), null)))));
                                               
        

    System.out.println("\n\n Binary Tree preorder: \n");
    BT.preorder();
    System.out.println("\n\n Binary Tree inorder: \n");
    BT.inorder();
    System.out.println("\n\n Binary Tree postorder: \n");
    BT.postorder();

    int nullCount, nodeCount;
    
    System.out.println("\n\n Binary Tree node count and null count: \n");
    nullCount = BT.countNull();
    nodeCount = BT.countNodes();

    System.out.println(" Node count = " + nodeCount + "\n" + " Null reference count = " + nullCount);
        
  }
}