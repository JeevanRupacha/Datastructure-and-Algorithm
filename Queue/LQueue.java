package Queue;

/*
* Linear Queue 
*/

public class LQueue {
    private int QUEUE_SIZE = 10;
    private Object[] queue;
    private int front = -1;
    private int rear = -1;

    public LQueue()
    {
        queue = new Object[QUEUE_SIZE];
    }

    public void enqueue(Object value)
    {
        if(rear >= QUEUE_SIZE - 1)
        {
            throw new Error("queue is full");
        }

        if(front == -1)
        {
            //increase front for first time only
            front++;
        }
        rear++;
        queue[rear] = value;
    }

    public Object dequeue()
    {
        Object val;
        if(front > rear)
        {
            throw new Error("Queue is empty");
        }

        val = queue[front];
        queue[front] = null;
        front++;
        return val;
    }

    public void display()
    {
        for(Object val:queue){
            System.out.println(val);
        }
    }

}
