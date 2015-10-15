package mx.iteso.factory.pozole.impl;

import org.junit.Assert;
import org.junit.Test;

import mx.iteso.factory.pozole.Meat;
import mx.iteso.factory.pozole.Pozole;

public class MenudoTest {

	@Test
	public void allMeats() {
		Pozole pozole;
		for(Meat meat: Meat.values())
		{
			pozole= new Menudo(meat);
			Assert.assertEquals(meat, pozole.getMeat());
		}
	}
	
	@Test
	public void serve() {
		new Menudo(Meat.values()[0]).serve();
	}
	
	@Test
	public void prepare() {
		new Menudo(Meat.values()[0]).prepare();
	}
}
