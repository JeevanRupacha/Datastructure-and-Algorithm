package Matrix;

public class Test {

    public static void main(String[] args )
    {
        int [][]A = {{1,2,3}, {2,3,4}, {3,4,5}};
        int [][]B = {{1,2,3}, {2,3,4}, {3,4,5}};
        IterativeMult im = new IterativeMult(A, B);
        im.multiply();
        im.display();
    }
    
}
