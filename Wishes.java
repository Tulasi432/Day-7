package com.codegnan.controlstatements;

import java.util.Scanner;

public class Wishes {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter city name :");
		String city=scanner.next();
		if(city.equalsIgnoreCase("hyderabad")) {
			System.out.println("Hello Hyderabadi...Adaad..");
		}else{
			if(city.equalsIgnoreCase("bangolre")) {
				System.out.println("Hello Kannadiga...Namaskara..");
			}else {
				if(city.equalsIgnoreCase("chennai")) {
					System.out.println("Hello Madrasi...vanakkam..");
				}else {
					System.out.println("please enter vaild city name");
					
				}
				
			}
			
			
		}

	}

}

//
s







