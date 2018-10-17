package com.hmrc;

public abstract class Fruit {
	
	double price;
	
	int count;
	
	double bill;

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount() {
		this.count++;
	}

	public abstract void setDiscount (); 

	public double getBill() {
		return count * price;
	}


	

}
