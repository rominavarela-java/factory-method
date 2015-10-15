package mx.iteso.factory.store.impl;

import mx.iteso.factory.store.PozoleStore;
import mx.iteso.factory.pozole.Meat;
import mx.iteso.factory.pozole.Pozole;
import mx.iteso.factory.pozole.PozoleType;
import mx.iteso.factory.pozole.decorator.impl.Col;
import mx.iteso.factory.pozole.decorator.impl.Oregano;
import mx.iteso.factory.pozole.decorator.impl.Rabanos;
import mx.iteso.factory.pozole.impl.Menudo;

public class MenudoStore extends PozoleStore {

	@Override
	protected Pozole createPozole(PozoleType type, Meat meat) throws java.lang.IllegalArgumentException {
		Pozole pozole;
		
		switch(type)
		{
			case menudo:
				pozole = new Menudo(meat);
				pozole = new Oregano(pozole);
				pozole = new Col(pozole);
				pozole = new Rabanos(pozole);
				break;
				
			default:
				throw new IllegalArgumentException("Unsuported pozole type");
				
		}
		
        return pozole;
	}
}
