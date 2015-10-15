package mx.iteso.factory.store.impl;

import mx.iteso.factory.pozole.Meat;
import mx.iteso.factory.pozole.Pozole;
import mx.iteso.factory.pozole.PozoleType;
import mx.iteso.factory.pozole.decorator.impl.Aguacate;
import mx.iteso.factory.pozole.decorator.impl.Cebolla;
import mx.iteso.factory.pozole.decorator.impl.Col;
import mx.iteso.factory.pozole.decorator.impl.Rabanos;
import mx.iteso.factory.pozole.impl.PozoleBlanco;
import mx.iteso.factory.store.PozoleStore;

public class PozoleBlancoStore extends PozoleStore {

	@Override
	protected Pozole createPozole(PozoleType type, Meat meat) throws java.lang.IllegalArgumentException {
		Pozole pozole;
		
		switch(type)
		{				
			case blanco:
				pozole = new PozoleBlanco(meat);
				pozole = new Cebolla(pozole);
				pozole = new Col(pozole);
				pozole = new Rabanos(pozole);
				pozole = new Aguacate(pozole);
				break;
				
			default:
				throw new IllegalArgumentException("Unsuported pozole type");
				
		}
		
        return pozole;
	}

}
