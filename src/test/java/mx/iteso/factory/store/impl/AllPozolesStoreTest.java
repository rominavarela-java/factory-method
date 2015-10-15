package mx.iteso.factory.store.impl;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import mx.iteso.factory.pozole.Meat;
import mx.iteso.factory.pozole.Pozole;
import mx.iteso.factory.pozole.PozoleType;
import mx.iteso.factory.store.PozoleStore;

public class AllPozolesStoreTest {
	PozoleStore store;
	
	@Before
	public void setup() {
		store = new AllPozolesStore();
	}
	
	@Test
	public void orderPozole() {
		for(PozoleType type: PozoleType.values())
		{
			Pozole pozole= store.orderPozole(type, Meat.values()[0]);
			String name= pozole.getName().toLowerCase();
			String typeName= type.name().substring(0,3).toLowerCase();
			
			Assert.assertTrue(name.contains(typeName));
		}
	}
}
