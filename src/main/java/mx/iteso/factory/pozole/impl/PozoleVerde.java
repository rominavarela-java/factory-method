package mx.iteso.factory.pozole.impl;

import mx.iteso.factory.pozole.Meat;
import mx.iteso.factory.pozole.Pozole;

public class PozoleVerde extends Pozole {
    public PozoleVerde(Meat meat) {
        this.setName("Pozole Verde");
    	this.setBroth("Caldo Verde");
    	this.setMeat(meat);
    }
}
