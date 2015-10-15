package mx.iteso.factory.pozole.impl;

import mx.iteso.factory.pozole.Meat;
import mx.iteso.factory.pozole.Pozole;

public class Menudo extends Pozole {
    public Menudo(Meat meat) {
    	this.setName("Menudo");
    	this.setBroth("Caldo Rojo");
    	this.setMeat(meat);
    }

    @Override
    public void serve() {
        System.out.println("Serving xtra hot in special menudo plate..." );
    }
}
