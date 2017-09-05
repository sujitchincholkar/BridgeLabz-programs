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
	public void remove(int pos){
		int tempPos=0;
		Node<T> tempPrev=root; 
		if(pos<this.size() && pos>0){
			while(tempPos<pos){
				tempPrev=tempPrev.next;
				tempPos++;
			}
			tempPrev.next=tempPrev.next.next;
		}
		else{
			System.out.println("given index does not exist");
		}
		
	}
	public void remove(T data) {
		Node<T> tempCurrent = root;
		Node<T> tempPrev = root;
		if(root.data.equals(data)){
			root=root.next;
		}else if(current.data.equals(data)){
			while(tempCurrent!=null){
				tempPrev=tempCurrent;
				tempCurrent=tempCurrent.next;
			}
			tempPrev.next = tempPrev.next.next;
			current=tempPrev;
		}else{
			while (tempCurrent != null) {
				if (tempCurrent.data.equals(data)) {
					tempPrev.next = tempCurrent.next;
					break;
				}
				tempPrev = tempCurrent;
				tempCurrent = tempCurrent.next;
			}
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
			
			if(temp.data.equals(item)){
				return index;
			}
			temp=temp.next;
			index++;
		}
		return index;
	}
	public T get(int index){
		Node<T> tempCurrent=root;
		for(int i=0;i<index;i++){
			tempCurrent=tempCurrent.next;
		}
		return tempCurrent.data;
	}
	
	public T pop(){
		T data=current.data;
		remove(this.size()-1);
		return data;
	}
	public T pop(int pos){
		T tempData=get(pos);
		remove(pos);
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