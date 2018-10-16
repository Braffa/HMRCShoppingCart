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
		if (totalApples > 0) {
			if (totalApples % 2 == 0) {
				totalApples = totalApples / 2;
			} else {
				totalApples = (totalApples / 2) + 1;
			}
		}
		if (totalOranges > 0) {
			if (totalOranges % 3 == 0) {
				totalOranges = (totalOranges / 3) + 1;
			} else {
				totalOranges = ((totalOranges / 3) * 2) + (totalOranges % 3);
			}
		}
		return (totalApples * applePrice) + (totalOranges * orangePrice);
	}

}
