package mx.iteso.factory.store;

import mx.iteso.factory.pozole.Meat;
import mx.iteso.factory.pozole.Pozole;
import mx.iteso.factory.pozole.PozoleType;

public abstract class PozoleStore {

    public Pozole orderPozole(PozoleType type, Meat meat){
        Pozole pozole;

        pozole = createPozole(type, meat);

        pozole.prepare();
        pozole.serve();

        return pozole;
    }

    protected abstract Pozole createPozole(PozoleType type, Meat meat);
}