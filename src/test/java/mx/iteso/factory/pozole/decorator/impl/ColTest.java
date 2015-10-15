package mx.iteso.factory.pozole.decorator.impl;

import junit.framework.Assert;
import mx.iteso.factory.pozole.Meat;
import mx.iteso.factory.pozole.Pozole;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ColTest {
	Pozole basePozole;
	Pozole pozole;
	
	@Before
	public void setup() {
		basePozole= Mockito.mock(Pozole.class);
		Mockito.when(basePozole.getName()).thenReturn("Test Pozole");
		Mockito.when(basePozole.getBroth()).thenReturn("Test Broth");
		Mockito.when(basePozole.getMeat()).thenReturn(Meat.values()[0]);
		
		pozole= new Col(basePozole);
	}
	
	@Test
	public void serve() {
		pozole.serve();
	}
	
	@Test
	public void prepare() {
		pozole.prepare();
	}
	
	@Test
	public void getName() {
		Assert.assertEquals(basePozole.getName(), pozole.getName());
	}
	
	@Test
	public void getBroth() {
		Assert.assertEquals(basePozole.getBroth(), pozole.getBroth());
	}
	
	@Test
	public void getMeat() {
		Assert.assertEquals(basePozole.getMeat(), pozole.getMeat());
	}
}
