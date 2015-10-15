package mx.iteso.factory.pozole;

public abstract class Pozole {
    public String name;
    public String broth;
    public Meat meat;

    public void serve() {
        System.out.println("Serving " + this.getName() + " plate..." );
    }

    public void prepare() {
        System.out.println("Preparing " + this.getName() + " with " + meat);
        System.out.println("Adding corn kernels..." );
        System.out.println("Adding " + this.getBroth() + "..." );
        System.out.println("Adding toppings:" );
    }
    
    //getters and setters
    public String getName(){
        return this.name;
    }
    public String getBroth(){
        return this.broth;
    }
    public Meat getMeat(){
    	return this.meat;
    }
    
    public void setName(String n){
    	this.name = n;
    }
    public void setBroth(String b){
    	this.broth = b;
    }
    public void setMeat(Meat m){
    	this.meat = m;
    }
}