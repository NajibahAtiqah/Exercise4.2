package Exrcs4_2;

public class Mango extends Fruits {
private double mass;

	public Mango() {
		super();
		mass=0;
	}
	
	public Mango(String name, double mass) {
		super(name);
		setDetails(name,mass);
	}
	
	public void setDetails(String name, double mass) {
		if (mass > 0)
			this.mass = mass;
		else
			mass = 0;
	}
	
	public double getWeight() {
		return mass*9.8;//acceleration due to gravity on Earth
	}	
		
	public String toString() {
			
		return  "Fruit: "+ name +"\n"+
				" Mass: " +mass + " KG" +"\n"+
				" Mass in Newton: " +getWeight() + " N";
	}
}
