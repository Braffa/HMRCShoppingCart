package com.hmrc;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class BillTotalTest {

	BillTotal billTotal;

	@Before
	public void setUp() throws Exception {
		billTotal = new BillTotal();
	}

	@Test
	public void test1Apple() {
		assertEquals(0.60, billTotal.calulateTotaBill(Arrays.asList("apple")), 0.00);
	}

	@Test
	public void test1Orange() {
		assertEquals(0.25, billTotal.calulateTotaBill(Arrays.asList("orange")), 0.00);
	}

	@Test
	public void test3Apples1Orange() {
		assertEquals(2.05, billTotal.calulateTotaBill(Arrays.asList("apple", "apple", "orange", "apple")), 0.00);
	}

}
