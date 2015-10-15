package mx.iteso;

import mx.iteso.factory.pozole.Meat;
import mx.iteso.factory.pozole.PozoleType;
import mx.iteso.factory.store.PozoleStore;
import mx.iteso.factory.store.impl.AllPozolesStore;
import mx.iteso.factory.store.impl.MenudoStore;
import mx.iteso.factory.store.impl.PozoleBlancoStore;
import mx.iteso.factory.store.impl.PozoleRojoStore;
import mx.iteso.factory.store.impl.PozoleVerdeStore;
import mx.iteso.factory.store.impl.PozolilloStore;

public class PozoleMain {
    public static void main (String[] args) {
    	
        new MenudoStore().orderPozole(PozoleType.menudo, Meat.pollo);
        new PozoleBlancoStore().orderPozole(PozoleType.blanco, Meat.cachete);
        new PozoleRojoStore().orderPozole(PozoleType.rojo, Meat.oreja);
        new PozoleVerdeStore().orderPozole(PozoleType.verde, Meat.pierna);
        new PozolilloStore().orderPozole(PozoleType.pozolillo, Meat.trompa);
        
        PozoleStore allStore = new AllPozolesStore();
        allStore.orderPozole(PozoleType.menudo, Meat.pollo);
        allStore.orderPozole(PozoleType.blanco, Meat.cachete);
        allStore.orderPozole(PozoleType.rojo, Meat.oreja);
        allStore.orderPozole(PozoleType.verde, Meat.pierna);
        allStore.orderPozole(PozoleType.pozolillo, Meat.trompa);
    }
}