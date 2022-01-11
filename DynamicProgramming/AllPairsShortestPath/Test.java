package DynamicProgramming.AllPairsShortestPath;

public class Test {
  public static void main(String[] args) {
    Integer inf = Integer.MAX_VALUE / 2;
    // Here divided by because adding max value result is negative int value
    // And the result if different 
    // adding value in inf should be inf 

    int[][] A = {
      {0,0,0,0,0},
      {0,0,3,inf,7},
      {0,8,0,2,inf},
      {0,5,inf,0,1},
      {0,2,inf,inf,0}
    };

    AllPairsShortestPaths pa = new AllPairsShortestPaths(A);
    // pa.display();
  }
}
