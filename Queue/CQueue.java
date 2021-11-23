package Queue;

public class CQueue {
    private int QUEUE_SIZE = 10;
    private Object[] queue;
    private int front = 0;
    private int rear = 0;

    public CQueue()
    {
        queue = new Object[QUEUE_SIZE];
    }

    public void enqueue(Object value)
    {
        //checking queue is full or not 
        if((front == 0 && rear >= (QUEUE_SIZE -1)) || front == (rear+1)%QUEUE_SIZE)
        {
            throw new Error("Queue is full ..");
        }
        // if(front == -1)
        // {
        //     //increase front only once because it starts from -1,
        //     front++;
        // }
        queue[rear] = value;
        rear = (rear+1)%QUEUE_SIZE;
    }

    public Object dequeue()
    {
        Object deletedVal;
        if(front == -1)
        {
            throw new Error("Queue is empty to dequeue ");
        }
        
        deletedVal = queue[front];
        queue[front] = null;
        front = (front+1) % QUEUE_SIZE;
        return deletedVal;

    }

    public void display()
    {
        for(Object val:queue)
        {
            System.out.println(val);
        }
    }

}
