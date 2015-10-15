package mx.iteso.factory.pozole.impl;

import mx.iteso.factory.pozole.Meat;
import mx.iteso.factory.pozole.Pozole;

import org.junit.Assert;
import org.junit.Test;

public class PozoleRojoTest {
	@Test
	public void allMeats() {
		Pozole pozole;
		for(Meat meat: Meat.values())
		{
			pozole= new PozoleRojo(meat);
			Assert.assertEquals(meat, pozole.getMeat());
		}
	}
	
	@Test
	public void serve() {
		new PozoleRojo(Meat.values()[0]).serve();
	}
	
	@Test
	public void prepare() {
		new PozoleRojo(Meat.values()[0]).prepare();
	}
}
