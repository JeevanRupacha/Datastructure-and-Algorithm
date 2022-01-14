package Trees.SymbolTable;

public class STable {
  Node node;
  
  public STable(String symbol, String value, boolean flag)
  {
    node = new Node();
    node.symbol = filteredSymbol(symbol);
    node.value = value;
    node.flag = flag;
  }

  public STable() {}
  
  public void Enter_Symbol(String symbol, String value, boolean flag)
  {

    if (node == null) {
      node = new Node();
      node.symbol = filteredSymbol(symbol);
      node.value = value;
      node.flag = flag;
    } else {
      Node temp = node;

      Node newNode = new Node();
      newNode.symbol = filteredSymbol(symbol);
      newNode.value = value;
      newNode.flag = flag;

      boolean foundRoot = false;

      while (!foundRoot) {

        if (temp.symbol.compareTo(filteredSymbol(symbol)) == 0) {

          throw new IllegalArgumentException("Already exits");

        }
        
        if (temp.symbol.compareTo(filteredSymbol(symbol)) > 0) {
          //temp.symbol is greater 
          // should be added to left side  
          if (temp.left == null) {
            foundRoot = true;
          } else {
            temp = temp.left;
          }
        } else {
          //add to right side 
          if (temp.right == null) {
            foundRoot = true;
          } else {
            temp = temp.right;
          }
        }
      }

      System.out.println(temp.symbol);

      if (temp.symbol.compareTo(filteredSymbol(symbol)) > 0) {
        //left side
        temp.left = newNode;
      } else {
        temp.right = newNode;
      }
    }
  }
  
  public String filteredSymbol(String symbol)
  {
    //removes all the non alphabetic from beginning string
    String result = symbol.replaceAll("^[^a-zA-Z]+", "");

    if (result.split("").length > 6) {
      result = result.substring(0, 6);
    }

    return result.trim();
  }
  
  public void Search_Tree(String symbol)
  {
    Node temp = node;

    boolean found = false;

    if (temp.symbol == symbol)
    {
      found = true;
    }else if (symbol.compareTo(temp.symbol) > 0)
    {
      // search to right 
      found =  searchChild(symbol, temp.right);
    } else {
      //search to left 
      found = searchChild(symbol, temp.left);
    }
    
    if(found)
    {
      System.out.print("SYMBOL: " + node.symbol);
      System.out.print("  VALUE: " + node.value);
      System.out.println("  FLAG: " + node.flag);
    } else {
      System.out.println("Given Symbol is not found ...");
    }
  }
  
  public boolean searchChild(String symbol,Node node)
  {
    if (node.symbol == symbol) {

      System.out.print("SYMBOL: " + node.symbol);
      System.out.print("  VALUE: " + node.value);
      System.out.println("  FLAG: " + node.flag);
      return true;
    }

    if (node.left != null) {
      //search to left again recurssively  
      return searchChild(symbol, node.left);
    }

    if (node.right != null) {
      return searchChild(symbol, node.right);
    }
    return false;
  }
  
  
  
  public void Print_Table()
  {
    Node temp = node;

    System.out.print("Parent is -> " + "SYMBOL: " + temp.symbol);
    System.out.print( "  VALUE: " + temp.value);
    System.out.println("  FLAG: " + temp.flag);
    
    if (temp.left != null) {
      traverseChild(temp.left, "Left");
    }

    if (temp.right != null) {
      traverseChild(temp.right, "Right");
    }
  }
  
  public void traverseChild(Node node, String id)
  {
    System.out.print(id + " is -> " + "SYMBOL: " + node.symbol);
    System.out.print("  VALUE: " + node.value);
    System.out.println("  FLAG: " + node.flag);

    if (node.left != null) {
      traverseChild(node.left, "Left");
    }

    if (node.right != null) {
      traverseChild(node.right, "Right ");
    }
  }



}
