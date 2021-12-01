package Sorting;

public class BubbleSort {
    int[] data;

    public BubbleSort(int[] data)
    {
        this.data = data;
    }

    public void sort()
    {
        int n = this.data.length;
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1;j++)
            {
                if(this.data[j+1] < this.data[j])
                {
                    int temp = this.data[j];
                    this.data[j] = this.data[j+1];
                    this.data[j+1] = temp;
                }
            }
        }
    }

    public void display()
    {
        for(int i:this.data)
        {
            System.out.println(i);
        }

    }
}
