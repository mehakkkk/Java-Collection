//ArrayDeque implements deque interface
//no default ordering

import java.util.ArrayDeque;

public class DequeCol {
    //it can store any type of data in it
    ArrayDeque q = new ArrayDeque();

    void insert()
    {
        q.offerFirst(1);
        q.offerFirst("hello");//adds this to the first ==> hello 1
        q.offerLast(2);
        q.offerLast(10);//add at the back
    }

    void display()
    {
        for(Object e:q)
        {
            System.out.println("In Arraydeque: "+e+" ");
        }
    }

    //functions to perform different operations on deque
    void operations()
    {
        System.out.println("element at the back of queue: "+q.getLast());
        System.out.println("element at first of queueL "+q.getFirst());
        System.out.println("Size of queue: "+q.size());
        System.out.println("remove first element from queue: "+q.removeFirst());
        System.out.println("remove last element from queue: "+q.removeLast());

    }

    public static void main(String args[])
    {
        DequeCol p = new DequeCol();

        p.insert();
        p.display();
        p.operations();
    }
}
