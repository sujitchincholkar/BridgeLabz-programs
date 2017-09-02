package com.bridgelabz.programs;

public class OrderedList<T extends Comparable<T>> extends LinkedList<T> {
	@Override
	public void add(T data) {
		Node<T> tempCurrent = root;
		Node<T> tempPrev = root;
		Node<T> newNode = new Node<T>(data);
		if (this.isEmpty()) {
			root = newNode;
			current = root;
		} else if (root.data.compareTo(data) > 0) {
			newNode.next = root;
			root = newNode;
		} else if (current.data.compareTo(data) < 0) {
			current.next = newNode;
			newNode.next = null;
		} else {
			while (tempCurrent != null) {
				if (tempCurrent.data.compareTo(data) > 0) {
					newNode.next = tempPrev.next;
					tempPrev.next = newNode;
					break;
				}
				tempPrev=tempCurrent;
				tempCurrent=tempCurrent.next;
			}
		}
	}
    

}
