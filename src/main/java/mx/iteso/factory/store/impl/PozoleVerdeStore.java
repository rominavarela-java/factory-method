package mx.iteso.factory.store.impl;

import mx.iteso.factory.pozole.Meat;
import mx.iteso.factory.pozole.Pozole;
import mx.iteso.factory.pozole.PozoleType;
import mx.iteso.factory.pozole.decorator.impl.Cebolla;
import mx.iteso.factory.pozole.decorator.impl.Lechuga;
import mx.iteso.factory.pozole.decorator.impl.Rabanos;
import mx.iteso.factory.pozole.impl.PozoleVerde;
import mx.iteso.factory.store.PozoleStore;

public class PozoleVerdeStore extends PozoleStore {

	@Override
	protected Pozole createPozole(PozoleType type, Meat meat) throws java.lang.IllegalArgumentException {
		Pozole pozole;
		
		switch(type)
		{			
			case verde:
				pozole = new PozoleVerde(meat);
				pozole = new Cebolla(pozole);
				pozole = new Lechuga(pozole);
				pozole = new Rabanos(pozole);
				break;
				
			default:
				throw new IllegalArgumentException("Unsuported pozole type");
				
		}
		
        return pozole;
	}
    
}
