package Stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {
    MyStack stack;

    @Before
    public void setUp() throws Exception{
        stack = new MyStack();
     }

    @Test
    public void pop(){
        stack.push("test2");
        stack.push("item2");
        Assert.assertEquals("item2", stack.pop());
        stack.push("item3");
        stack.push("item4");
        stack.push("item5");
        Assert.assertEquals("item5", stack.pop());
    }

    @Test
    public void push(){
        stack.push("test2");
        stack.push("item2");
        Assert.assertEquals(1, stack.top);
        stack.push("item3");
        stack.push("item4");
        Assert.assertEquals(3, stack.top);

        stack.push("item5");
        Assert.assertEquals(4, stack.top);

    }
}
