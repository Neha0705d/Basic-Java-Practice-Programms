package com.linkedList;

import com.linkedList.LinkedList.Node;

public class LengthOfLinkedList {

	private Node head;

	public int length(){
		 int count=0;
		 Node current = this.head;

		 while(current != null){
		  count++;
		  current=current.next();
		 }
		 return count;
		}

	public static void main(String[] args) {
		LengthOfLinkedList lllength = new LengthOfLinkedList();
		System.out.println("Length of LinkedList is : " + lllength.length());
	}
}
