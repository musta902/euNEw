package day33_classObjecktsConstrucktors;

public class Car {


	String model;
	String make;
	int year;
	double mile;
	String color;
	
	
	
	public Car() {
		
		make = "BMW";
		model = "M3";
		year = 2019;
		mile = 23000;
		color = "red";
	}


	public Car(String model, String make, int year, double mile, String color) {
		this.model = model;
		this.make = make;
		this.year = year;
		this.mile = mile;
		this.color = color;
	}



	public String toString() {
		return "Car [model=" + model + ", make=" + make + ", year=" + year + ", mile=" + mile + ", color=" + color
				+ "]";
	}


	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public Car(String model,String make,int year,double mile,String color) {
		
		this.model = model;
		this.make = make;
		this.year = year;
		this.mile = mile;
		this.color = color;
	}
	*/
	
	
	

