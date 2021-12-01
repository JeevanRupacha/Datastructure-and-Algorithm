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
            int min = this.data[i];
            for(int j=i+1;j<n-i-1; j++)
            {
                if(this.data[i] > this.data[j])
                {
                    int temp = this.data[i];
                    this.data[i] = this.data[j];
                    this.data[j] = temp;
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
