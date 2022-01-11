package DynamicProgramming.AllPairsShortestPath;


/**
 *  All Pairs Shorest Paths also called Floyd-Warshall Algortihm 
 *  To find the shortest path between all the pairs . 
 * 
 *  note: i, j, k represents the vettex eg: 1 to 4
 *  ALGO : 
 *    1> Init graph as matrix A[r+1][c+1]
 *    2> FOR(k = 1; k< n; k++) THEN  ; k is the vertex, acts here as a middle
 *    3> FOR(i = 1; i< n; i++) THEN 
 *    4> FOR(j = 1; j< n ; j++) THEN 
 *    5> A[i][j] = Min{A[i][j], A[i][k] + A[k][j]}
 *    6> END FOR
 *    7> END FOR
 *    8> END FOR 
 * 
 *    Analysis:
 *        Time complexcity = O(n^3)
 */
public class AllPairsShortestPaths {
  private int[][] A;
  private int n;
  
  public AllPairsShortestPaths(int[][] A)
  {
    this.A = A;
    this.n = A[0].length;
    invoke();
  }

  public void invoke()
  {
    System.out.println("Before The Shorted Paths : ");
    display(A);

    for (int k = 1; k < n; k++) {
      for (int i = 1; i < n; i++) {
        for (int j = 1; j < n; j++) {
          A[i][j] = min(A[i][j], A[i][k] + A[k][j]);
        }
      }
    }

    System.out.println("After The Shorted Paths : ");
    display(A);
  }
  public int min(int a, int b)
  {
    return a<b? a: b; 
  }
  
  public void display(int A[][])
  {
    int n = A[0].length;

    for(int i=1; i<n; i++)
    {
      for(int j =1 ; j<n; j++)
      {
        System.out.print(A[i][j] + "   ");
      }
      System.out.println("");
    }
  }
}
