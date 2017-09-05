package com.bridgelabz.programs;

public class Queue<T> {
	LinkedList<T> list=new LinkedList<T>();
	public void enqueue(T data){
		list.add(data);
	}
	public T dequeue(){
		return list.pop(0);
	}
	public boolean isEmpty(){
		return list.isEmpty();
	}
	public int size(){
		return list.size();
	}
	
}
