package Selection;

/**
 * Find minimum and maximum using 
 * Divvide and Conquer method 
 */

 /**
  * ALGO: 
        1> DEFINE MinMax(ArrayData,left,right) // returns [minVal , maxVal]
        2> DEFINE min and max
        2> ELSE IF(right-left <= 1) THEN    // Only two value exits in one chunk array, division ends here
            2.1> IF(ArrayData[left] > ArrayData[right]) THEN 
                max = ArrayData[left]
                min = ArrayData[right]
            2.2> ELSE
                max = ArrayData[right]
                min = ArrayData[left]
        3> ELSE 
            3.1> mid = (left+right)/2
            3.2> [minR, maxR] = MinMax(ArrayData, mid+1, right) // GOTO right side, min & max from right array chunk
            3.3> [minL, maxL] = MinMax(ArrayData, left, mid)  // GOTO left side, min & max from left array chunk
            3.4> IF(minL < minR) THEN  
                min = minL
            3.5> ELSE 
                min = minR
            3.6> IF(maxR > maxL) THEN
                max = maxR
            3.7> ELSE
                max = maxL
        4> RETURN [min,max]
        5> END

        Worst complexcity if O(n) , and it is more better than linear minmax 
  */

public class MinMax {

    public MinMax(){}

    // Depth Details version
    public int[] minMax(int[] arrayData, int left, int right)
    {
        int min = 999, max = -999;

        if(right-left <= 1)
        {
            if(arrayData[left] > arrayData[right])
            {
                max = arrayData[left];
                min = arrayData[right];
            }else{
                max = arrayData[right];
                min = arrayData[left];
            }
        }else{
            int mid = (left+right)/2;
            int[] rightArray = minMax(arrayData, mid+1, right);
            int[] leftArray = minMax(arrayData, left, mid);
            min = (rightArray[0] > leftArray[0]) ? leftArray[0] : rightArray[0];
            max = (rightArray[1] > leftArray[1]) ? rightArray[1] : leftArray[1];
        }

        System.out.println("{ " + min +" " + max + " }");

        return new int[]{min,max};
    }

    //Refactored version 
    public int[] minMaxRefactored(int[] arrayData, int left, int right)
    {
        if(right-left <= 1)
        {
            return new int[]{
                (arrayData[left] > arrayData[right] ? arrayData[right] : arrayData[left]),
                (arrayData[left] < arrayData[right] ? arrayData[right] : arrayData[left])
            };
        }

        int[] rightArray = minMaxRefactored(arrayData, (left+right)/2+1, right);
        int[] leftArray = minMaxRefactored(arrayData, left, (left+right)/2);

        return new int[]{
                        (rightArray[0] > leftArray[0]) ? leftArray[0] : rightArray[0],
                        (rightArray[1] > leftArray[1]) ? rightArray[1] : leftArray[1]
                    };
    }
}
