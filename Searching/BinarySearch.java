package Searching;

public class BinarySearch {
    int[] data;

    public BinarySearch(int[] data)
    {
        this.data = data;
    }

    public boolean search(int value)
    {
        int start = 0;
        int end = data.length-1;
        return BS(this.data, start, end, value);
    }

    public boolean BS(int[] data, int start, int end, int value)
    {
        int midI = (int)(start + end) / 2;

        if(start > end)
        {
            return false;
        }

        if(data[midI] == value )
        {
            return true;
        }

        if(value > data[midI])
        {
            return BS(data, midI+1, end, value);
        }

        if(value < data[midI])
        {
            return BS(data, start, midI-1, value);
        }

        return false;
    }
}
