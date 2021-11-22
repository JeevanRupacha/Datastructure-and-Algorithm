package Queue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class LQueueTest {
    
    LQueue lQueue;

    public static void main(String[] args)
    {
        LQueue lQueue = new LQueue();


        lQueue.enqueue("item1");
        lQueue.enqueue("item2");
        lQueue.enqueue("item3");
        lQueue.enqueue("item4");
        lQueue.enqueue("item5");
        lQueue.enqueue("item6");
        lQueue.enqueue("item6");
        lQueue.enqueue("item6");
        lQueue.enqueue("item6");
        lQueue.enqueue("item6");
        lQueue.enqueue("item6");

        lQueue.dequeue();
        lQueue.dequeue();
        lQueue.dequeue();
        lQueue.display();

    }

    @Before
    public void estUp() throws Exception
    {
        lQueue = new LQueue();
    }

    @Test
    public void enqueues()
    {
        lQueue.enqueue("item1");
        Assert.assertEquals("item1", lQueue.dequeue());
        lQueue.enqueue("item2");
        Assert.assertEquals("item2", lQueue.dequeue());
        lQueue.enqueue("item3");
        lQueue.enqueue("item4");
        lQueue.enqueue("item5");
        Assert.assertEquals("item5", lQueue.dequeue());
    }

    @Test
    public void dequeues()
    {
        lQueue.dequeue();
        lQueue.dequeue();
        lQueue.dequeue();
        // Assert.assertEquals()
    }
}
