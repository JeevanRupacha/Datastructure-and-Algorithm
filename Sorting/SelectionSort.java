package Sorting;

public class SelectionSort {
    int[] data;

    public SelectionSort(int[] data)
    {
        this.data = data;
    }

    public void sort()
    {
        // 1,2,4,5,3,5,3
        int n = this.data.length;

        for(int i=0;i<n;i++)
        {
            int minIndex = i;
            for(int j=i+1;j<n; j++)
            {
                if(this.data[j] < this.data[minIndex])
                {
                    int temp = this.data[j];
                    this.data[j] = this.data[minIndex];
                    this.data[minIndex] = temp;
                }
            }
        }
    }

    public void display()
    {
        for (int i:this.data)
        {
            System.out.println(i);
        }
    }
}
