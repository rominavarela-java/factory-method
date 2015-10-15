package mx.iteso.factory.pozole.impl;

import mx.iteso.factory.pozole.Meat;
import mx.iteso.factory.pozole.Pozole;

import org.junit.Assert;
import org.junit.Test;

public class PozoleVerdeTest {
	@Test
	public void allMeats() {
		Pozole pozole;
		for(Meat meat: Meat.values())
		{
			pozole= new PozoleVerde(meat);
			Assert.assertEquals(meat, pozole.getMeat());
		}
	}
	
	@Test
	public void serve() {
		new PozoleVerde(Meat.values()[0]).serve();
	}
	
	@Test
	public void prepare() {
		new PozoleVerde(Meat.values()[0]).prepare();
	}
}
