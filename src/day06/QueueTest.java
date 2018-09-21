package day06;

import java.util.LinkedList;
import java.util.Queue;


public class QueueTest {

	public static void main(String[] args) {		//queue의 사용법
		// TODO Auto-generated method stub
		Queue q = new LinkedList<String>();
		q.offer("A"); 
		q.offer("B"); 	//inserts the specified element into this queue
		q.offer("C");
		System.out.println(q.poll());	//Retrieves and removes the head of this queue, or returns null if this queue is empty.
		System.out.println(q.peek()); 	//Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
		System.out.println(q.poll());

		q.offer("D");
		System.out.println(q.peek());
		System.out.println(q.element());	//Retrieves, but does not remove, the head of this queue
	}

}
