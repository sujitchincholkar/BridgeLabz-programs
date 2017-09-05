package com.bridgelabz.programs;

import java.util.Scanner;

public class BankSimulator {
	static Scanner sc=new Scanner(System.in);
	int cash=0;
	Queue<String> queue;
	public static void main(String[] args) {
		BankSimulator bank=new BankSimulator();
		System.out.println("Enter number of people in line");
		int numberOfPeople=sc.nextInt();
		bank.addPeople(numberOfPeople);
		while(!bank.queue.isEmpty()){
			while(!bank.queue.isEmpty()){
				String task=bank.queue.dequeue();
				if(task.equals("Withdraw")){
					bank.withdraw();
				}else if(task.equals("Deposite")){
					bank.deposite();
				}
			}
		System.out.println("how many people added in line?");	
		numberOfPeople=sc.nextInt();
		bank.addPeople(numberOfPeople);
		}
		System.out.println(bank.cash>=0);
	}
	public void addPeople(int number){
		queue=new Queue<String>(); 
		int choice;
		int i=0;
		while(i<number){
			System.out.println("Enter task of Person"+(i+1)+" \n1.Withdraw \n2.Deposite");
			choice=sc.nextInt();
			if(choice==1){
				queue.enqueue("Withdraw");
			}else if(choice ==2){
				queue.enqueue("Deposite");
			}
			i++;
		}
	}
	private  void withdraw() {
		int amount=0;
		System.out.println("Hello sir!\nEnter Amount to withdraw");
		amount=sc.nextInt();
		if((cash-amount)>=0){
		cash-=amount;
		} else {
			System.out.println("Sorry not enough balance");
		}
		
	}
	private void deposite(){
		int amount;
		System.out.println("Hello sir!\nEnter Amount to deposite");
		amount=sc.nextInt();
		cash+=amount;
	}

}
