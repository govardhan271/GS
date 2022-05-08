package com.dailycode.rough;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class CollectionQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();//LinkedList, PriorityQueue, PBQ,in concurrent ABQ
		queue.add(5);
		queue.add(6);
		queue.add(6);
		queue.add(3);
		queue.add(9);
		System.out.println(queue);
		//System.out.println(queue.peek());//top check
		System.out.println(queue.poll());//remove top element and print
		//System.out.println(queue.remove());//remove top element and print
		System.out.println(queue.remove(9));//removes the element returns boolean
		System.out.println(queue);
	}

}
