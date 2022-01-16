package BackTracking.HamiltionianCycle;

public class Test {
  
  public static void main(String[] args) {

    // int[][] graph = {
    //   {0,1,0,1},
    //   {1,0,1,0},
    //   {1,1,0,0},
    //   {1,0,1,0}
    // };

    int graph[][]  = {
      {0,1,0,0},
      {0,0,1,1},
      {1,0,0,0},
      {1,0,1,0}
    };

    HamiltonianCycle hm = new HamiltonianCycle();
    hm.hamiltonian(graph);
  }
}
