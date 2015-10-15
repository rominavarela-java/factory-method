package mx.iteso.factory.store.impl;

import mx.iteso.factory.pozole.Meat;
import mx.iteso.factory.pozole.Pozole;
import mx.iteso.factory.pozole.PozoleType;
import mx.iteso.factory.pozole.decorator.impl.Aguacate;
import mx.iteso.factory.pozole.decorator.impl.Cebolla;
import mx.iteso.factory.pozole.decorator.impl.Col;
import mx.iteso.factory.pozole.decorator.impl.Elote;
import mx.iteso.factory.pozole.decorator.impl.Lechuga;
import mx.iteso.factory.pozole.decorator.impl.Oregano;
import mx.iteso.factory.pozole.decorator.impl.Rabanos;
import mx.iteso.factory.pozole.impl.Menudo;
import mx.iteso.factory.pozole.impl.PozoleBlanco;
import mx.iteso.factory.pozole.impl.PozoleRojo;
import mx.iteso.factory.pozole.impl.PozoleVerde;
import mx.iteso.factory.store.PozoleStore;

public class AllPozolesStore extends PozoleStore {
	
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
			
			case verde:
				pozole = new PozoleVerde(meat);
				pozole = new Cebolla(pozole);
				pozole = new Lechuga(pozole);
				pozole = new Rabanos(pozole);
				break;
				
			case rojo:
				pozole = new PozoleRojo(meat);
				pozole = new Oregano(pozole);
				pozole = new Col(pozole);
				pozole = new Rabanos(pozole);
				break;
				
			case blanco:
				pozole = new PozoleBlanco(meat);
				pozole = new Cebolla(pozole);
				pozole = new Col(pozole);
				pozole = new Rabanos(pozole);
				pozole = new Aguacate(pozole);
				break;
				
			case pozolillo:
				pozole = new PozoleVerde(meat);
				pozole = new Elote(pozole);
				pozole = new Col(pozole);
				pozole = new Rabanos(pozole);
				break;
				
			default:
				throw new IllegalArgumentException("Unsuported pozole type");
				
		}
		
        return pozole;
	}
}
