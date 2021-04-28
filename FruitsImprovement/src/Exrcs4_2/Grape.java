package Exrcs4_2;

public class Grape extends Fruits {
	protected String colour;
	protected int calories, vitaC;
	
	public Grape(String name, String colour, int c, int v) {
	super(name);
	this.colour = colour;
	this.calories = c;
	this.vitaC = v;
	
}
	public int getCalories()  {
		return this.calories;
	}
	
	public int getVitaC() {
		return this.vitaC;
		
	}
	
	public String toString() {//overriding method
		return 	"Fruit: "+ name +"\n"+
				"Total calories: " +getCalories()+ " Cal" +"\n"+
				"Vitamin C: "+getVitaC() +" %" +"\n";
	}
}
