package Latihan.latihanArray;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Training.Array.ShoopingActivity;

public class TestShopping {

	ShoopingActivity sa = new ShoopingActivity();
	
	@Test
	public void addProdSatu()
	{
		assertEquals(sa.addProdSatu(), 10000);
	}
	
	@Test
	public void hitungBelanja()
	{
		assertEquals(sa.hitungTotalBelanja(),9500);
	}
	
	
}