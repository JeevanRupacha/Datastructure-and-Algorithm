package Sorting;

public class HeapSort {

    int[] data ;
    
    public HeapSort(int[] data)
    {
        this.data = data;
    }


    public void display()
    {
        for(int i:data)
        {
            System.out.println(i);
        }
    }


    public static void main(String[] args)
    {
        int data[] = {1,2,3,4,5,6};

        HeapSort heapSort = new HeapSort(data);
        heapSort.display();
        System.out.println("-----------------");
        for(int i:data){
            System.out.println(i);
        }
    }
    
}
