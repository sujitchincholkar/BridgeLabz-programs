package com.bridgelabz.programs;

class Node<T> {
	T data;
	Node next;

	public Node(T data) {
		this.data = data;
		next = null;
	}

}

public class LinkedList<T> {
	Node<T> root;
	Node<T> current;
	int size;

	public LinkedList() {
		root = null;
		current = null;
		size = 0;
	}

	public void add(T data) {
		Node<T> node = new Node<T>(data);
		if (this.isEmpty()) {
			root = node;
			current = node;

		} else {
			current.next = node;
			current = current.next;
		}
		size++;
	}

	public void remove(T data) {
		Node<T> tempCurrent = root;
		Node<T> tempPrev = root;
		while (tempCurrent != null) {
			if (tempCurrent.data.equals(data)) {
				tempPrev = tempCurrent.next;
			}
			tempPrev = tempCurrent;
			tempCurrent = tempCurrent.next;
		}
		if (size != 0) {
			size--;
		}
	}


	public int size() {
		Node temp = root;
		int size = 0;
		while (temp != null) {
			temp = temp.next;
			size++;
		}
		return size;
	}
	
	public boolean isEmpty(){
		if(root==null){
			return true;
		}
		return false;
	}
	
	public boolean search(T item){
		Node temp=root;
		boolean isPresent=false;
		while(temp!=null){
			if(temp.data.equals(item)){
				isPresent=true;
			}
			temp=temp.next;
		}
		return isPresent;	
	}
	
	public int index(T item){
		Node temp=root;
		int index=0;
		while(temp!=null){
			index++;
			if(temp.data.equals(item)){
				return index;
			}
			temp=temp.next;
		}
		return index;
	}
	
	public T pop(){
		T data=current.data;
		return data;
	}
	public T pop(int pos){
		int tempPos=1;
		Node<T> tempNode=root;
		T tempData;
		while(pos<=tempPos&&tempNode!=null){
			tempNode=tempNode.next;
			tempPos++;
		}
		tempData= tempNode.data;
		remove(tempData);
		return tempData;
		
	}
	public void printList(){
		Node<T> temp=root;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}