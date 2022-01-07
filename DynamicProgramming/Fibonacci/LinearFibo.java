package DynamicProgramming.Fibonacci;

/**
 * Using Dynamic solution 
 * 
 *  1> Fibo(num)
 *  2> Init Array of Size of num+1 -> F[num+1] 
 *  3> F[0] = 0, F[1] = 1
 *  4> FOR(int i =2; i<= num; i++) THEN 
 *  5> F[i] = F[i-1] + F[i-2]
 *  6> RETURN F[i]
 *  7> END FOR
 * 
 *  Analysis : 
 *          complexity is O(n) , linear time complexcity  
 */

public class LinearFibo {
  
  public int fibo(int num)
  {
    int[] F = new int[num+1];
    F[0] = 0;
    F[1] = 1;
    for(int i=2; i<= num; i++)
    {
      F[i] = F[i - 1] + F[i - 2];
    }
    return F[num];
  }
}
