package Queue;

public class CQueueTest {

    public static void main(String[] args)
    {
        CQueue cqueue = new CQueue();

        cqueue.enqueue("item1");
        cqueue.display();
        Object deletedVal = cqueue.dequeue();
        System.out.println("deletedVal: " +deletedVal );
        cqueue.display();
        
        // cqueue.enqueue("item2");
        // cqueue.enqueue("item3");
        // cqueue.enqueue("item4");
        // cqueue.enqueue("item5");
        // cqueue.enqueue("item6");
        // cqueue.display();

    }
}
