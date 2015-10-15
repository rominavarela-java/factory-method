package mx.iteso.factory.store.impl;

import junit.framework.Assert;
import mx.iteso.factory.pozole.Meat;
import mx.iteso.factory.pozole.Pozole;
import mx.iteso.factory.pozole.PozoleType;
import mx.iteso.factory.store.PozoleStore;

import org.junit.Before;
import org.junit.Test;

public class PozolilloStoreTest {
PozoleStore store;
	
	@Before
	public void setup() {
		store = new PozolilloStore();
	}
	
	@Test
	public void orderPozole() {
		for(PozoleType type: PozoleType.values())
		{
			Pozole pozole = null;
			Exception exception = null;
			
			try
			{
				pozole= store.orderPozole(type, Meat.values()[0]);
			}
			catch (Exception ex)
			{
				exception= ex;
			}
			
			switch(type)
			{
				case pozolillo:
					
					String name= pozole.getName().toLowerCase();
					Assert.assertTrue(name.contains("verde"));
					Assert.assertTrue( exception == null );
					break;
					
				default:
					Assert.assertTrue( pozole == null );
					Assert.assertTrue( exception != null );
					break;
			}
		}
	}
}
