package DynamicProgramming.MultiStageGraph;

/**
 * https://www.youtube.com/watch?v=FcScLYJI42E&list=PLDN4rrl48XKpZkf03iYFl-O29szjTrs_O&index=48
 * ALGO:
 * 1> cost[n] = 0
 * 2> FOR(i = n-1; i>= 0; i--) THEN
 *  2.1> min = IntMin value
 *  2.2> FOR(k = i+1; k<= n; k++) THEN
 *    2.2.1> IF(c[i][k] != 0 and c[i][k] + cost[k] < min) THEN
 *    2.2.2> min = c[i][k] + cost[k]
 *    2.2.3> d[k] = k
 *    2.2.4> END IF
 *  2.3> END FOR
 * 3> cost[i] = min
 * 4> END FOR
 * 5> p[i] = 1, p[stages] = n
 * 6> FOR(i = 2; i < stages; i++) THEN
 * 7> p[i] = d[p[i-1]]
 * 8> END FOR
 * 
 * Analysis : 
 *    -time complexcity = O(n^2)
 * 
 */
public class MultiStageGraph {
  int n = 8; // Number of total vertex in graph 
  int cost[] = new int[n + 1]; // Cost to reach each vertex
  int d[] = new int[n + 1]; // the array of vertex in graph
  int stages = 4; // Number of stage/level of graph 
  int p[] = new int[stages + 1]; // to store the path of minimum 
  

  public void findPath(int [][]c)
  {
    // here c is weight of each egde from one vertex to another

    cost[n] = 0; // cost of target vertex is 0 itself 

    //Traverse from terget node to starting node vertex
    for (int i = n - 1; i >= 0; i--) {
      int min = Integer.MAX_VALUE;

      // traverse the vertices from current vertex to other remaing vertex 
      // We are travelling from right side target to starting vertex 
      for (int k = i + 1; k <= n; k++) {

        //if there is no edge then dont calculate min and only the minimun 
        // value is selected 
        if (c[i][k] != 0 && c[i][k] + cost[k] < min) {
          // System.out.println("Min value is " + c[i][k] + cost[k]);
          System.out.println("Cost of "+ k + "Is "+ cost[k]);
          System.out.println("Min value is " + c[i][k]);
          min = c[i][k] + cost[k];
          d[i] = k;
        }
        cost[i] = min;
      }
    }

    //filling the minimum path 
    p[1] = 1; //Because 1 is the starting vertex 
    p[stages] = n;
    for (int i = 2; i < stages; i++) {
      p[i] = d[p[i - 1]];
    }
  }
  
  public void minValue()
  {
    System.out.println("Minimum cost is : " + cost[1]);
  }

  public void path()
  {
    for(int i=1; i < p.length; i++)
    {
      System.out.print(p[i] +"-> ");
    }
  }
}
