package com.bridgelabz.programs;

public class UnorderedList<T> extends LinkedList<T>{
	public void insert(int pos, T data) {
		int tempPos = 0;
		Node<T> node = new Node<T>(data);
		Node<T> tempCurrent, tempPrev;
		tempCurrent = tempPrev = root;
		if (size < pos) {
			add(data);
		} else {
			while (pos != tempPos) {
				tempPrev = tempCurrent;
				tempCurrent = tempCurrent.next;
				tempPos++;
			}
			tempPrev.next = node;
			node.next = tempCurrent;
		}
	}
	public void append(T item){
		add(item);
	}
	
}
