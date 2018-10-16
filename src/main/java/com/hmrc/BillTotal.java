package com.hmrc;

import java.util.List;

public class BillTotal {

	private static double applePrice = 0.60;
	private static double orangePrice = 0.25;

	Fruit apples = (int totalApples) -> {
		return totalApples == 0 ? 0 : totalApples % 2 == 0 ? totalApples / 2 : (totalApples / 2) + 1;
	};

	Fruit oranges = (int totalOranges) -> {
		return totalOranges == 0 ? 0
				: (totalOranges % 3 == 0 ? (totalOranges / 3) + 1 : (totalOranges / 3) * 2) + (totalOranges % 3);

	};

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
		return (apples.calculateDiscount(totalApples) * applePrice)
				+ (oranges.calculateDiscount(totalOranges) * orangePrice);
	}

}
