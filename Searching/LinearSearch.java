package Searching;

public class LinearSearch {

    int[] data;

    public LinearSearch(int[] data)
    {
        this.data = data;
    }

    public boolean search(int value)
    {
        for(int i=0; i<this.data.length; i++)
        {
            if(this.data[i] == value)
            {
                return true;
            }
        }
        
        return false;
    }
    
}
