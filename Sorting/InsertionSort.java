package Sorting;


/**
 * [1,2,4,5,6,7,8]
 *  ALGO: 
 *      1> Insert n number of data in array to sort 
 *      2> FOR (i=1; i<n; i++) THEN
 *          2.1> FOR(j=i; j>0; j--) THEN
 *              IF(Array[j] < Array[j-1]) THEN 
 *                  Swap AS :
 *                  1> temp = Array[j]
 *                  2> Array[j] = Array[j-1]
 *                  3> Array[j-1] = temp
 *              ELSE
 *                  BREAK
 *          2.2> END FOR
 *      3> END FOR 
 * 
 *      Analysis :
 *              We have to loop (n-1) elements to compare all elements . Again we have to compare 
 *              n elements with nth elements So the time complexcity in worst case scenario is O(n^2) 
 *              for n elements is array .   
 * 
 */             

public class InsertionSort {
    int[] arrayData;

    public InsertionSort(int[] arrayData)
    {
        this.arrayData = arrayData;
    }

    public void sort()
    {
        int n = arrayData.length;
        for(int i=1; i<n; i++)
        {
            for(int j = i; j>0; j--)
            {
                if(this.arrayData[j] <this.arrayData[j-1])
                {
                    int temp = this.arrayData[j];
                    this.arrayData[j] = this.arrayData[j-1];
                    this.arrayData[j-1] = temp;
                }else{
                    break;
                }
            }
        }
    }

    public void display()
    {
        for(int i:this.arrayData)
        {
            System.out.println(i);
        }
    }
}
