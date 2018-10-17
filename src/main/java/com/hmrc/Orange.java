package com.hmrc;

public class Orange extends Fruit {

	IFruit orangeDiscount = (int totalOranges) -> {
		return totalOranges == 0 ? 0
				: (totalOranges % 3 == 0 ? (totalOranges / 3) + 1 : (totalOranges / 3) * 2) + (totalOranges % 3);

	};

	public Orange() {
		this.setPrice(0.25);
	}

	@Override
	public void setDiscount() {
		this.count = orangeDiscount.calculateDiscount(this.getCount());
	}
}
