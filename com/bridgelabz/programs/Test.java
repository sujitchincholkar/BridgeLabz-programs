package com.bridgelabz.programs;

public class Test {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		System.out.println(list.isEmpty());
		list.add(2);
		list.add(4);
		list.add(3);
		list.add(6);
		list.add(7);
		list.add(12);
		list.add(15);
		list.printList();
		System.out.println("=======");
		System.out.println(list.size());
		System.out.println(list.index(12));
		System.out.println(list.search(9));
		System.out.println("=======");
		list.pop();
		list.printList();
		System.out.println("=======");
		System.out.println(list.pop(list.size()));
		list.printList();
		System.out.println("=======");
		list.remove(12);
		list.printList();
		System.out.println("======="+list.size());
		list.removeAt(list.size()-1);
		list.printList();
		
	}

}
