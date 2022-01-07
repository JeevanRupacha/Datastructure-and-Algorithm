package DynamicProgramming.Fibonacci;

/**
 * ALGO:
 * 1> Fibo(nth number) THEN 
 * 2> IF(number <= 1) THEN 
 * 3> RETURN number 
 * 4> ELSE 
 * 5> RETURN Fibo(number - 1) + Fibo(number - 2) 
 * 
 * Analysis : 
 *        T(n) = 2T(n-1) + 1
 *        complexcity = O(2^n)
 */

 // @returns nth number of fibonacci series

 public class RecurssiveFibo {
   int num;
  
  public int fibo(int num)
  {
    this.num = num;
    if (num <= 1) {
      return num;
    }

    return fibo(num - 1) + fibo(num - 2);
  }
  
  public int sum(int n)
  {
    int sum = 0;
    while (n >= 0)
    {
      sum = sum + fibo(n);
      n--;
    }
    return sum;
  } 
}
