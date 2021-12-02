package Sorting;

public class SortingTest {

    public static void main(String[] args){
        // BubbleSort bs = new BubbleSort(new int[]{3,4,5,9,-1,3,5,-100,100});
        // // BubbleSort bs = new BubbleSort(new int[]{});
        // bs.sort();
        // bs.display();

        // SelectionSort ss = new SelectionSort(new int[]{1,-34,5,63,2,7,4,8});
        SelectionSort ss = new SelectionSort(new int[]{1,-34});
        ss.sort();
        ss.display();

        
    }
    
}
