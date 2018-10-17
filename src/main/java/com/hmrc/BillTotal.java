package com.hmrc;

import java.util.List;

public class BillTotal {

	public double calulateTotaBill(List<String> listOfFruit) {

		Apple apples = new Apple();
		Orange oranges = new Orange();

		listOfFruit.forEach(fruit -> {
			if (fruit.toLowerCase().equals("apple")) {
				apples.setCount();
			} else if (fruit.toLowerCase().equals("orange")) {
				oranges.setCount();
			}
		});

		apples.setDiscount();
		oranges.setDiscount();

		return (apples.getBill()) + oranges.getBill();
	}

}
