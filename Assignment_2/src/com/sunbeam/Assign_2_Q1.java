package com.sunbeam;

import java.util.Scanner;


class Invoice {
		Scanner sc = new Scanner(System.in);
		String partNumber;
		String partDecr;
		int partQty;
		double price;
		public Invoice(){
			this("","",0,0.0);
		}
		public Invoice(String Num,String Decr,int qty,double price) {
			this.partNumber = Num;
			this.partDecr = Decr;
			this.partQty = qty;
			this.price = price;
			
		}
		public String getPartNumber() {
			return partNumber;
		}
		public void setPartNumber(String partNumber) {
			this.partNumber = partNumber;
		}
		public String getPartDecr() {
			return partDecr;
		}
		public void setPartDecr(String partDecr) {
			this.partDecr = partDecr;
		}
		public int getPartQty() {
			return partQty;
		}
		public void setPartQty(int partQty) {
			this.partQty = partQty;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		void accept() {
			System.out.print("Enter Part Number: ");
			partNumber = sc.next();
			System.out.print("Enter Part Description : ");
			partDecr = sc.next();
			System.out.print("Enter Quantity: ");
			partQty = sc.nextInt();
			if(partQty < 0)
				this.partQty = 0;
			System.out.print("Enter Price: ");
			price = sc.nextDouble();
			if(price < 0)
				this.price = 0.0;	
		}
		void display() {
			System.out.println("PartNumber: "+partNumber);
			System.out.println("PartDecr: "+partDecr);
			System.out.println("Part Quantity: "+partQty);
			System.out.println("Total Price: "+price * partQty );
		}
		
	}


