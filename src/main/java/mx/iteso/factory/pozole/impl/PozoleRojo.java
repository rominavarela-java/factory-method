package mx.iteso.factory.pozole.impl;

import mx.iteso.factory.pozole.Meat;
import mx.iteso.factory.pozole.Pozole;

public class PozoleRojo extends Pozole {
    public PozoleRojo(Meat meat) {
        this.setName("Pozole Rojo");
    	this.setBroth("Caldo Rojo");
    	this.setMeat(meat);
    }
}
