package datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class QueueTest {
    @Test
    public void TestQueue() {
        Queue myQueue = new Queue();
        assertEquals(0,myQueue.size());
        myQueue.push(1);
        assertEquals(1,myQueue.size());
        myQueue.push(-1);
        myQueue.push(3);
        myQueue.pop();
        assertEquals(2,myQueue.size());

    }
}
