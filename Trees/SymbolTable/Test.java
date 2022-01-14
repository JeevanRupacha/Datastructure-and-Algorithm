package Trees.SymbolTable;

public class Test {

  public static void main(String[] args) {
    STable st = new STable();

    /// Test Data 1
    // st.Enter_Symbol("ORANGE", "32", false);
    // st.Enter_Symbol("1 PEAR", "1C", true);
    // st.Enter_Symbol("13654 PEAR", "1C", true);
    // // st.Enter_Symbol("PEAR", "2A", false);
    // st.Enter_Symbol("PEACH", "60", true);
    // //st.Enter_Symbol("ORANGE", "0D", false);
    // st.Enter_Symbol("PEACH1", "23", true);
    // st.Enter_Symbol("BANANA", "50", false);
    // st.Enter_Symbol("MANGO", "45", true);
    // st.Enter_Symbol("MELLON", "80", true);
    // st.Enter_Symbol("APPLE", "5A", true);
    // //st.Enter_Symbol("PEAR", "6B", true);
    // st.Enter_Symbol("EGGPLANT", "9C", false);
    
    /// Test Data 3
    st.Enter_Symbol("ORANGE", "32", false);
    st.Enter_Symbol("1 PEAR", "1C", true);
    st.Enter_Symbol("PEACH", "60", true);
    st.Enter_Symbol("PEACH1", "23", true);
    st.Enter_Symbol("BANANA", "50", false);
    st.Enter_Symbol("MANGO", "45", true);
    st.Enter_Symbol("MELLON", "80", true);
    st.Enter_Symbol("APPLE", "5A", true);
    st.Enter_Symbol("EGGPLANT", "9C", false);

    // System.out.println("Searching ");
    // st.Search_Tree("PEACH");
    // st.Search_Tree("ORANGE");


    ////Test data 2
    // st.Enter_Symbol("o", "9C", false);
    // // st.Enter_Symbol("r", "9C", false);
    // st.Enter_Symbol("r", "9C", false);
    // // st.Enter_Symbol("r", "9C", false);
    // st.Enter_Symbol("s", "9C", false);
    // st.Enter_Symbol("a", "9C", false);
    // st.Enter_Symbol("m", "9C", false);
    // // st.Enter_Symbol("n", "9C", false);
    // st.Enter_Symbol("n", "9C", false);



    st.Print_Table();
  }
  
}
