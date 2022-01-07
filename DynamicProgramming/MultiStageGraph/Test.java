package DynamicProgramming.MultiStageGraph;

public class Test {

  public static void main(String[] args) {
    
    // the array numbers are 9 because array  starts form 0 so , 1 extra value
    int[][] c = { 
        { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 0, 2, 1, 3, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0, 2, 3, 0, 0 },
        { 0, 0, 0, 0, 0, 6, 7, 0, 0 },
        { 0, 0, 0, 0, 0, 0, 8, 9, 0 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 6 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 4 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 5 },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
      };
    MultiStageGraph mlGraph = new MultiStageGraph();
    mlGraph.findPath(c);
    mlGraph.minValue();
    mlGraph.path();
  }
  
}
