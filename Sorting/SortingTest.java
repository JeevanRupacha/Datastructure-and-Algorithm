package Sorting;

public class SortingTest {

    public static void main(String[] args){
        // BubbleSort bs = new BubbleSort(new int[]{3,4,5,9,-1,3,5,-100,100});
        // // BubbleSort bs = new BubbleSort(new int[]{});
        // bs.sort();
        // bs.display();

        // SelectionSort ss = new SelectionSort(new int[]{1,-34,5,63,2,7,4,8});
        // SelectionSort ss = new SelectionSort(new int[]{1,-34});
        // ss.sort();
        // ss.display();

        // InsertionSort is = new InsertionSort(new int[]{2,3,4,5,6,-1,9,4,2,-100,100});
        // is.sort();
        // is.display();

        MergeSort ms = new MergeSort(new int[]{101,2,3,45,-50,4,5,6,7,-100});
        ms.sort();
        ms.display();

        
    }
    
}
