public class BinaryTree {
  private int info;
  private BinaryTree left;  //default value = null
  private BinaryTree right;   // --> private BinaryTree link = null;

  public BinaryTree(int value, BinaryTree left, BinaryTree right) {
    info = value;
    this.left = left;
    this.right = right;
  }

  public int nNodes, nNull;
  
  public int getInfo(){return info;}

  public BinaryTree getLeft(){return left;}

  public BinaryTree getRight(){return right;}

  public void preorder(){

    System.out.print("( ");
    
    System.out.print(this.getInfo());

    if(this.left != null)
      this.left.preorder();
    
    if(this.right != null)
      this.right.preorder();

    System.out.print(" )");
  }

  public void inorder(){

    System.out.print("( ");
    
    if(this.left != null)
      this.left.inorder();

    System.out.print(this.getInfo());
    
    if(this.right != null)
      this.right.inorder();

    System.out.print(" )");
  }

  public void postorder(){

    System.out.print("( ");
      
    if(this.left != null)
      this.left.postorder();

    if(this.right != null)
      this.right.postorder();

    System.out.print(this.getInfo());

    System.out.print(" )");
  }

  public int countNull(){
    
    if(this.left != null)
      nNull = this.left.countNull();
    else
      nNull++;

    if(this.right != null)
      nNull = nNull + this.right.countNull();
    else
      nNull++;

    return nNull;
    
  }

  public int countNodes(){

    if(this.left != null)
      nNodes = this.left.countNodes();

    nNodes++;
    
    if(this.right != null)
      nNodes = nNodes + this.right.countNodes();

    return nNodes;

  }

}