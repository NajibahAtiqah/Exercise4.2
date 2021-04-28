package Exrcs4_2;

public class Fruits {
protected String name;
	
	public Fruits () {
		name=null;
	}
	
	public Fruits(String name) {
		setDetails(name);
	}
	
	public void setDetails(String name) {
		if(name!=null)
			this.name=name;
		else
			this.name=null;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() { // overriding
		return "We should take " + name + " as our daily intake.";
}
	}
