package mx.iteso.factory.pozole.impl;

import mx.iteso.factory.pozole.Meat;
import mx.iteso.factory.pozole.Pozole;

public class PozoleBlanco extends Pozole {
    public PozoleBlanco(Meat meat) {
        this.setName("Pozole Blanco");
    	this.setBroth("Caldo Transparente");
    	this.setMeat(meat);
    }
}

