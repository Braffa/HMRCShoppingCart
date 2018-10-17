package com.hmrc;

public class Apple extends Fruit {

	IFruit applesDiscount = (totalApples) -> {
		return totalApples == 0 ? 0 : totalApples % 2 == 0 ? totalApples / 2 : (totalApples / 2) + 1;
	};

	public Apple() {
		this.setPrice(0.60);
	}

	@Override
	public void setDiscount() {
		this.count = applesDiscount.calculateDiscount(this.getCount());
	}
}
