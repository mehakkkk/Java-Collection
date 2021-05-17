import java.util.PriorityQueue;

//priorityQueue implements queue interface
public class PriorityQueCol {
    //by default priority queue is in ascending order
    PriorityQueue q = new PriorityQueue();

    void insert()
    {
        q.offer(1);
        //nonGeneric.add("hello"); //you cannot add any type of object in priority queue a priority queue should contain specific type of values only
        q.offer(2);
    }

    void display()
    {
        for(Object e:q)
        {
            System.out.println("In priority queue: "+e+" ");
        }
    }

    //performing different operations on priority queue
    void operations()
    {
        System.out.println("check element at top: "+q.peek());
        System.out.println("check queue size: "+q.size());
        System.out.println("check top element and remove from top: "+q.poll());

    }

    public static void main(String args[])
    {
        PriorityQueCol p = new PriorityQueCol();

        p.insert();
        p.display();
        p.operations();
    }

}
