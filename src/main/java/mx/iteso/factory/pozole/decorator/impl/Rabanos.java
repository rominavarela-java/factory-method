package mx.iteso.factory.pozole.decorator.impl;

import mx.iteso.factory.pozole.Pozole;
import mx.iteso.factory.pozole.decorator.TopingsDecorator;

public class Rabanos extends TopingsDecorator{
	Pozole pozole;
	
	public Rabanos(Pozole pozole) {
		this.pozole= pozole;
	}
	
	@Override
	public void serve() {
        this.pozole.serve();
    }
	
	@Override
    public void prepare() {
		this.pozole.prepare();
		System.out.println("    rábanos");
    }
	
	//getters and setters
	@Override
    public String getName(){
        return this.pozole.getName();
    }
	@Override
    public String getBroth(){
        return this.pozole.getBroth();
    }
    
	@Override
    public void setName(String n){
    	this.pozole.setName(n);
    }
	@Override
    public void setBroth(String b){
    	this.pozole.setBroth(b);
    }
}