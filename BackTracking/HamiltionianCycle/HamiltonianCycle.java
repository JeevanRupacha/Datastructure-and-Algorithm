package BackTracking.HamiltionianCycle;


/**
 *      ALGO : 
 *          1> HamiltionianCycle(graph, path, v, pos)
 *          2> IF(pos == length of path) TEHN
 *          3> Check if Last And First has edge connected AS:
 *          4> IF graph[path[pos-1]][0] == 1 THEN
 *          5> Return True 
 *          6> Else False
 *          7> End IF
 *          8> End IF
 *          9> FOR( v = 0; v< n; v++) THEN
 *          10> Check the v gives solution or not AS:
 *          11> IF(graph[path[pos-1]][v] == 1) THEN // checking path for previous vertex
 *          12> Path exit return true
 *          13> End IF
 *          14> FOR(i = 0; i<n; i++) THEN // Duplication check 
 *          15> IF(Path[i] == v) return false
 *          16> Return true
 *          17> End IF
 *          18> End FOR
 *          19> If v gives solution then 
 *          20> path[pos] = v
 *          21> IF(HamiltonianCycle(graph, path, pos + 1) == True) THEN
 *          22> Return True 
 *          23> ELSE 
 *          24> path[pos] = -1
 *          25> End IF
 *          26> End FOR
 *          
 */
public class HamiltonianCycle {
  
  int[][] Graph;
  int[] path;
  
  // length of all vertex 
  int n;

  public HamiltonianCycle(){ }

  public boolean isSafe(int[][] graph, int[] path, int v, int pos)
  {

    //checking if there is path between previous vertex
    if (graph[path[pos-1]][v] == 0)
    {
      return false;
    }
    
    //checking the duplication of vertex
    for (int i = 0; i < n; i++) {
      if (path[i] == v) {
        return false;
      }
    }
    return true;
  }

  public boolean hamiltonianUtil(int[][] graph, int[] path, int pos)
  {

    // cheking if the position if last+1 position
    // if it is last position the the pos is last
    // positioned index 
    if (pos == path.length)
    {
      // checks the last vertex and starting vertex has path or not
      if (Graph[path[pos-1]][path[0]] == 1) {
        return true;
      } else {
        return false;
      }
    }
    
    // try all the vertex one by one starting from 0 vertex 
    // because we start vertex from 0 here 
    for (int v = 0; v < n; v++)
    {
      // here v is vertex node and starts from 0 
      if(isSafe(this.Graph, path, v, pos))
      {
        path[pos] = v;

        if (hamiltonianUtil(this.Graph, path, pos + 1)) {
          return true;
        }

        //applying the backtracking here 
        // because the next vertex will not give 
        // the soultion so we have to try another 
        // vetrex here 
        path[pos] = -1;
      }
    }


    return false;
  }

  public void hamiltonian(int[][] graph)
  {
    this.Graph = graph;
    this.n = graph[0].length;
    this.path = new int[n];

    //initialize all the path with -1 at first
    // it means no vetrex is assigned to this path
    for (int i = 0; i < n; i++) {
      path[i] = -1;
    }

    // asign 0 at first path position 
    // At position 0 at 0 beacuse 
    // we fix the starting value in path as 0
    path[0] = 0;

    // starting form the position 1 
    // Start from 1 position and iterate further it
    if (hamiltonianUtil(Graph, path, 1) == false) {
      // No path exits 
      System.out.println("Path Doesnot exit ... ");
    } else {
      printPath();
    }
  }
  
  public void printPath() {
    for(int i=0; i< path.length; i++)
    {
      System.out.print(path[i] + "  ");
    }
  }
}
