package BackTracking.EightQueen;


/**
 *   Algo: From Geeksforgeeks 
 *        1) Start in the leftmost column
          2) If all queens are placed
              return true
          3) Try all rows in the current column. 
            Do following for every tried row.
              a) If the queen can be placed safely in this row 
                then mark this [row, column] as part of the 
                solution and recursively check if placing
                queen here leads to a solution.
              b) If placing the queen in [row, column] leads to
                a solution then return true.
              c) If placing queen doesn't lead to a solution then
                unmark this [row, column] (Backtrack) and go to 
                step (a) to try other rows.
          3) If all rows have been tried and nothing worked,
            return false to trigger backtracking.
 */
public class EightQueen {
  
  public boolean isSafe(int[][] board, int row, int col )
  {
    int n = board[0].length; // Length of row 

    // Check the left side of all cols 
    for (int i = col-1; i >= 0; i--) {
      if (board[row][i] == 1) {
        return false;
      }
    }

    int i, j;

    //checks for left diagonal side 
    for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
      if (board[i][j] == 1)
        return false;
    }

    //Checks for left bottom diagonal side 
    for (i = row, j = col; i < n && j >= 0; i++, j--) {
      if (board[i][j] == 1)
        return false;
    }

    return true;
  }
  
  public boolean solveNQ(int [][]board, int col)
  {
    int n = board[0].length;

    //while recursive call (col+1) should not be 
    // Exceed length of board column number  
    if (col >= n)
    {
      return true;
    }

    //checking for all the rows positions 
    for (int i = 0; i < n; i++) {
      if (isSafe(board, i, col)) {
        board[i][col] = 1;

        System.out.println("First is assigned ");

        //Checks for next column 
        if (solveNQ(board, col + 1)) {
          return true;
        }

        //Applying backtrack because it gives no solution  
        board[i][col] = 0;
      }
    }
    return false;
  }

  public void invoke()
  {
    int [][]board = {
      {0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0},
      {0,0,0,0,0,0,0},
    };

    boolean result = solveNQ(board, 0);

    
    if(result)
    {
      for(int i =0; i< board[0].length; i++)
      {
        for (int j = 0; j < board[0].length; j++) {
          System.out.print(" " + board[i][j]);
        }
        System.out.println(" ");
      }
      
    }
    

  }

}
