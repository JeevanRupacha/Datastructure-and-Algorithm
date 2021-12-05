package Sorting;

/**
 *  ALGO :
 *      1> Initialize the array data  : arrayData
 *      2> left = 0, right = arrayData.length-1
 *      3> Divide Array AS: 
 *          divide(arrayData, left , right)
 *      4> IF(left < right) THEN
 *          4.1> CAL middle = (left+right)/2
 *          4.2> CALL divide(arrayData, left, middle)
 *          4.3> CALL divide(arrayData, middle+1, right)
 *          4.4> CALL merge(arrayData,left,middle,right)
 *      5> merge AS:
 *          5.1> Declare i,j,k, tempArray
 *          5.2> i= left; j = middle+1; k = low(To hold the sorted index)
 *          5.3> Copy the original array to tempArr
 *          5.4> while(i <= middle AND j <= high) THEN 
 *              5.4.1> IF(tempArr[i] < tempArr[j]) THEN
 *                          arrayData[k] = tempArr[i]; i++
 *              5.4.2> ELSE
 *                  arrayData[k] = tempArr[j]; j++
 *              5.4.3> END IF
 *              5.4.5> k++
 *          5.5> END WHILE
 *          5.6> while(i<=middle) THEN 
 *              arrayData[k] = tempArr[i]; i++; k++
 *          5.7> END WHILE
 *          5.8> while(j <= right) THEN 
 *              arrayData[k] = tempArr[j]; j++; k++
 *          5.9> END WHILE
 */

public class MergeSort {
    int[] arrayData;
    int[] tempArr;

    public MergeSort(int[] arrayData)
    {
        this.arrayData = arrayData;
        this.tempArr = new int[arrayData.length];
    }

    public void sort()
    {
        int left = 0;
        int right = this.arrayData.length-1;
        divide(this.arrayData, left, right);
    }

    private void divide(int[] arr , int left, int right)
    {
        int middle = (left+right)/2;
        if(left < right)
        {
            divide(arr, left, middle); //Divided to left chunk
            divide(arr, middle+1, right); //Divided to right chunk
            merge(arr, left, middle, right); // Merging the divided array chunk
        }
    }

    private void merge(int[] arr, int left , int middle, int right)
    {
      
        int i = left;
        int j = middle+1;
        int k = left;
        int[] tempArr = new int[this.arrayData.length];

        // Copying the array form original to temp 
        for(int in =0; in< this.arrayData.length; in++)
        {
            tempArr[in] = this.arrayData[in];
        }

        while(i <= middle && j <= right)
        {
            if(tempArr[i] < tempArr[j])
            {
                arrayData[k] = tempArr[i];
                i++;
            }else{
                arrayData[k] = tempArr[j];
                j++;
            }

            k++;
        }

        // Taking the remaining data form left chunk 
        while(i <= middle)
        {
            arrayData[k] = tempArr[i];
            i++;
            k++;
        }

        // Taking the remaining data form right chunk 
        while(j <= right)
        {
            arrayData[k] = tempArr[j];
            j++;
            k++;
        }

    }

    public void display()
    {
           for(int i : this.arrayData)
           {
               System.out.println(i);
           }
    }
    
}
