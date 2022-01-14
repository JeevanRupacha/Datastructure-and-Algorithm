package Trees;

/**
 *      ALGO : 
 *            1> Init the Node of tree 
 *            2> insert value in BTree as :
 *            3> init foundRoot = false , stop while position of 
 *               of node where the value to be inserted 
 *            4> Init temp = node
 *            5> while(!foundRoot) THEN //traverse until root is not found
 *            6> IF(temp.root > value ) THEN // exits in left side 
 *              6.1> IF(temp.left == null)  // left root is null so found root
 *              6.2> foundRoot = True 
 *              6.3> ELSE: temp = temp.left // traverse to left again
 *              6.4> END IF
 *            7> IF(temp.root < value ) THEN // exits in right side 
 *              7.1> IF(temp.right == null)  // right root is null so found root
 *              7.2> foundRoot = True 
 *              7.3> ELSE: temp = temp.right // traverse to right again
 *              7.4> END IF
 *            8> END WHILE
 *            9> IF(temp.root > value ) THEN 
 *                9.1> temp.left = newNode
 *            10> IF(temp.root < value) THEN
 *                10.1> temp.right = newNode
 * 
 *        
 * 
 */           
public class BinaryTree {

  Node node;

  public BinaryTree() {
  }

  public BinaryTree(int value)
  {
    node = new Node();
    node.root = value;
  }
  
  public void insert(int value)
  {
    if (node == null) {
      node = new Node();
      node.root = value;
    } else {
      Node temp = node;
      Node newNode = new Node();
      newNode.root = value;

      boolean foundRoot = false;

      while (!foundRoot) {

        if (temp.root > value) {
          // go to left side 
          if (temp.left == null)
          {
            foundRoot = true;
          } else {
            temp = temp.left;
          }
        }
        
        if (temp.root < value) {
          // go to right side 
          if (temp.right == null)
          {
            foundRoot = true;
          } else {
            temp = temp.right;
          }
        }
      }

      // printing the parent node that added the value 
      System.out.println(temp.root);

      if(temp.root < value) {
        //add to right side 
        temp.right = newNode;
      } else {
        //add to left side 
        temp.left = newNode;
      }
    }

  }
  
  public void traverse()
  {
    Node temp = node;

    System.out.println("parent root " + temp.root);

    if (temp.left != null) {
      //traverse to left node 
      traverseLeft(temp.left);
    }

    if (temp.right != null) {
      //traverse to right node 
      traverseRight(temp.right);
    }
  }
  
  public void traverseLeft(Node node)
  {
    System.out.println("left child " + node.root);
    if(node.left != null)
    {
      traverseLeft(node.left);
    }

    if(node.right != null)
    {
      traverseRight(node.right);
    }
  }

  public void traverseRight(Node node)
  {
    System.out.println("Right child of "+ node.root);
    if (node.left != null) {
      traverseLeft(node.left);
    }

    if (node.right != null) {
      traverseRight(node.right);
    }
  }
  
}

