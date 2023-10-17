package com.sunbeam.drivingCost;

import java.util.Scanner;

class DrivingCost {
	 double MilesPerDay;
	 double CostGasoline;
	 double averageMilesPerGallon;
	 int parkingFee;
	 int TollsPerDay;
	 Scanner sc = new Scanner(System.in);
	 DrivingCost(){
		 this(10,150,3,4,2);
	 }
	 

	public DrivingCost(double milesPerDay, double costGasoline, double averageMilesPerGallon, int parkingFee,int tollsPerDay) 
	{
		super();
		MilesPerDay = milesPerDay;
		CostGasoline = costGasoline;
		this.averageMilesPerGallon = averageMilesPerGallon;
		this.parkingFee = parkingFee;
		TollsPerDay = tollsPerDay;
	}

	public double getMilesPerDay() {
		return MilesPerDay;
	}


	public void setMilesPerDay(double milesPerDay) {
		MilesPerDay = milesPerDay;
	}


	public double getCostGasoline() {
		return CostGasoline;
	}


	public void setCostGasoline(double costGasoline) {
		CostGasoline = costGasoline;
	}


	public double getAverageMilesPerGallon() {
		return averageMilesPerGallon;
	}


	public void setAverageMilesPerGallon(double averageMilesPerGallon) {
		this.averageMilesPerGallon = averageMilesPerGallon;
	}


	public int getParkingFee() {
		return parkingFee;
	}


	public void setParkingFee(int parkingFee) {
		this.parkingFee = parkingFee;
	}


	public int getTollsPerDay() {
		return TollsPerDay;
	}


	public void setTollsPerDay(int tollsPerDay) {
		TollsPerDay = tollsPerDay;
	}
	public void accept() {
		System.out.print("Enter total miles driven per day: ");
		MilesPerDay = sc.nextDouble();
		System.out.print("Enter Cost per gallon of gasoline: ");
		CostGasoline = sc.nextDouble();
		System.out.print("Enter Average miles per gallon:");
		averageMilesPerGallon = sc.nextDouble();
		System.out.print("Enter Parking fees per day: ");
		parkingFee = sc.nextInt();
		System.out.print("Enter Tolls per day: ");
		TollsPerDay = sc.nextInt();
	}
	
	public void CalculateCost(){
		double value = MilesPerDay/averageMilesPerGallon*CostGasoline;
		System.out.println("Cost Per day of driving to work Costs: "+(value+parkingFee+TollsPerDay));
	}
	public static void main(String[] args) {
		DrivingCost dc = new DrivingCost();
		dc.accept();
		dc.CalculateCost();
		

	}

}
