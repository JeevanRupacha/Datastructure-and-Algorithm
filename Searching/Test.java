package Searching;

public class Test {

    public static void main(String[] args)
    {
        // BinarySearch bs = new BinarySearch(new int[]{1,2,3,4,5,6,7,8,9});
        // System.out.println(bs.search(200));
        // bs.search(9);

        LinearSearch ls = new LinearSearch(new int[]{1,2,4,6,7,3,5, 20, 19});
        // System.out.println(ls.search(-10));
        // System.out.println(ls.search(1));
        System.out.println(ls.search(19));
    }
}
