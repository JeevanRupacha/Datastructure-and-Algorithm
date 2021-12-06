package Sorting;


/**
 *  ALGO: 
 *        1> Initialize arrayData to be sorted
 *        2> IF (low < high) THEN 
 *           2.1> pivot = arrayData[low], i = low, j = high
 *           2.2> While(i < j) THEN:
 *              2.2.1> While(arrayData[i] < pivot ) THEN: 
 *                  i++
 *              END While
 *              2.2.2> While(arrayData[j] > pivot ) THEN: 
 *                  j--
 *              END while
 *              2.2.3> IF(i<j) THEN:
 *                  Swap(arrayData[i], arrayData[j])
 *          2.3> END while
 *          2.3> Swap(pivot, arrayData[j])
 *          2.4> Recurresive call QuickSort(low, j)
 *          2.5> Recurresive call QuickSort(j+1, high)
 *      3> END IF 
 */

public class QuickSort {

    int[] dataArray ;

    public QuickSort(int[] dataArray)
    {
        this.dataArray = dataArray;
    }

    public void sort()
    {
        int low, high;

        low = 0;
        high = this.dataArray.length - 1;
        quickSort(low, high);
    }

    public void quickSort(int low, int high)
    {   
        if(low < high)
        {
            int sortedPosition = partition(low, high);
            quickSort(low, sortedPosition);
            quickSort(sortedPosition+1, high);
        }

    }

    public int partition(int low, int high)
    {
        int pivot = dataArray[low];
        int i = low;
        int j = high;

        while(i < j)
        {
            
            while(dataArray[i] <= pivot){
                i++;
            }
            while(dataArray[j] > pivot){
                j--;
            }

            if(i < j)
            {
                int temp = dataArray[i];
                dataArray[i] = dataArray[j];
                dataArray[j] = temp;
            }
        }

        //Swaping pivot and jth value
        int temp = dataArray[j];
        dataArray[j] = pivot;
        dataArray[low] = temp;
        return j;
    }


    public void display()
    {
        for(int i: this.dataArray)
        {
            System.out.println(i);
        }
    }
}
