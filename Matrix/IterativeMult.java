package Matrix;

/**
 *  1(0,0)  2(0,1)  3(0,2)      
 *  2(1,0)  4(1,1)  5(1,2)
 *  3(2,0)  4(2,1)  5(2,2) 
 * 
 *  ALOG : 
 *      1> Initialize the matrix A[n][], B[][n] and result[n][]
 *      2> FOR(int i=0; i<n; i++) THEN  // Cursour for Row 
 *          2.1> FOR (int j =0 ; j< n; j++) THEN   // Cursour for Cols
 *              2.1.1> FOR(int k =0; k<n; k++) THEN   //Coursour for Additions of elements 
 *                      result[i][j] += A[j][k]*B[k][j]
 *              2.1.2> END FOR
 *          2.2> END FOR
 *      3> END FOR
 *      4> END 
 * 
 * Time Complexcity id O(n^3)
 * 
 *  Analysis : 
 *  Time Complexity Analysis
        The naive matrix multiplication algorithm contains three nested loops.
        For each iteration of the outer loop, the total number of the runs in 
        the inner loops would be equivalent to the length of the matrix. Here,
        integer operations take O(1) time. In general, if the length 
        of the matrix is N, the total time complexity would be
        O(N * N * N) = O(N^3).
 */

public class IterativeMult {
    int [][]A;
    int [][]B;
    int [][]results;

    int rowsA;
    int colsB;

    public IterativeMult(int[][] A, int[][] B)
    {
        this.A = A;
        this.B = B;
        rowsA = A[0].length;
        colsB = B.length;
        results = new int[rowsA][colsB];
    }

    public void multiply()
    {
        for(int i=0; i < rowsA; i++ )
        {
            for(int j = 0; j < colsB; j++)
            {
                for(int k =0; k < rowsA; k++)
                {
                    this.results[i][j] += A[i][k] * B[k][j];
                }
            }
        }
    }

    public void display()
    {
        for(int i=0; i< A.length; i++)
        {
            for (int j =0; j< A.length; j++)
            {
                System.out.print(results[i][j] + "  ");
            }

            System.out.println("");
        }
    }
}
