package Selection;

public class Test {
    public static void main(String[] args )
    {
    MinMax mM = new MinMax();
    int[] arr = {-100,1,2,4,9,6,7,100,3};
    int[] result = mM.minMaxRefactored(arr, 0, arr.length-1);

    for(int i: result)
    {
        System.out.println(i);
    }
    }
}
