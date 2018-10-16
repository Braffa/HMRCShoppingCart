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
	public void test2Apples() {
		assertEquals(0.60, billTotal.calulateTotaBill(Arrays.asList("apple", "apple")), 0.00);
	}

	@Test
	public void test3Apples() {
		assertEquals(1.20, billTotal.calulateTotaBill(Arrays.asList("apple", "apple", "apple")), 0.00);
	}

	@Test
	public void test1Orange() {
		assertEquals(0.25, billTotal.calulateTotaBill(Arrays.asList("orange")), 0.00);
	}

	@Test
	public void test3Oranges() {
		assertEquals(0.50, billTotal.calulateTotaBill(Arrays.asList("orange", "orange", "orange")), 0.00);
	}

	@Test
	public void test4Oranges() {
		assertEquals(0.75, billTotal.calulateTotaBill(Arrays.asList("orange", "orange", "orange", "orange")), 0.00);
	}

	@Test
	public void test5Oranges() {
		assertEquals(1.00, billTotal.calulateTotaBill(Arrays.asList("orange", "orange", "orange", "orange", "orange")),
				0.00);
	}

	@Test
	public void test3Apples1Orange() {
		assertEquals(1.45, billTotal.calulateTotaBill(Arrays.asList("apple", "apple", "orange", "apple")), 0.00);
	}

}
