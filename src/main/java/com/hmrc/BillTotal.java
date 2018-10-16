package com.hmrc;

import java.util.List;

public class BillTotal {

	private static double applePrice = 0.60;
	private static double orangePrice = 0.25;

	public double calulateTotaBill(List<String> listOfFruit) {
		int totalApples = 0;
		int totalOranges = 0;
		for (String fruit : listOfFruit) {
			if (fruit.toLowerCase().equals("apple")) {
				totalApples++;
			} else if (fruit.toLowerCase().equals("orange")) {
				totalOranges++;
			}
		}
		return (totalApples * applePrice) + (totalOranges * orangePrice);
	}

}
