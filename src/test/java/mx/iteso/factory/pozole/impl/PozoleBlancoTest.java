package mx.iteso.factory.pozole.impl;

import mx.iteso.factory.pozole.Meat;
import mx.iteso.factory.pozole.Pozole;

import org.junit.Assert;
import org.junit.Test;

public class PozoleBlancoTest {
	@Test
	public void allMeats() {
		Pozole pozole;
		for(Meat meat: Meat.values())
		{
			pozole= new PozoleBlanco(meat);
			Assert.assertEquals(meat, pozole.getMeat());
		}
	}
	
	@Test
	public void serve() {
		new PozoleBlanco(Meat.values()[0]).serve();
	}
	
	@Test
	public void prepare() {
		new PozoleBlanco(Meat.values()[0]).prepare();
	}
}
