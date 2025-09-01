package com.codegnan.controlstatements;

import java.util.Scanner;

public class ATMExample {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double balance=50000;//initial account balance.
		int pin=1234;//original pin.
		int entreredpin;
		System.out.println("Enter Your pin..");
		entreredpin= scanner.nextInt();
		if(entreredpin != pin) {
			System.out.println("Incorrect pin.Existing");
			return;
			
		}
		int choice;
		
		System.out.println("||=====||");
		System.out.println("||=== ATM Menu===||");
		System.out.println("||===1.Check Balance===||");
		System.out.println("||===2.Deposit===||");
		System.out.println("||===3.Withdraw===||");
		System.out.println("||===4.Exit==||");
		System.out.println("||=====||");
		System.out.println("Enter Your Choice");
		choice=scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Your Balance is :"+balance);
			break;
		case 2:
			System.out.println("Enter Deposit Amount :");
			double depositAmount=scanner.nextInt();
			if(depositAmount%100!=0) {
				System.out.println("Please Deposit Multiples of 100 like"+"[700,1000,1200]");
			}else {
				if(depositAmount<500) {
					System.out.println("Please Deposit More than 500 ruppes ");	
				}else {
					balance+=depositAmount;
					System.out.println("Deposited :"+depositAmount+"succesfully...updated balance is :"+balance);
							
				}
			}
			break;
		case 3:
			System.out.println("Enter Withdraw Amount:");
			double withdrawAmount=scanner.nextDouble();
			if(withdrawAmount%100!=0) {
				System.out.println("Please Withdraw Multiples of 100 like"+"[700,1000,1200]");
			}else {
				if(withdrawAmount<500) {
					System.out.println("Please Withdraw  More than 500 ruppes ");	
			}else {
				if (withdrawAmount > balance) {
					System.out.println("insufficient funds..");
				}
				else {
					balance -= withdrawAmount;
					System.out.println("the"+withdrawAmount+"is withdrawAmount sucessfully..updated balance is"+balance);
				}
			}				
		}
			break;
		case 4 : 
			System.out.println("Exit Thank You for Using ATM Machine");
			break;
		default:System.out.println("Default");
		}
		scanner.close();
		
	}
}
