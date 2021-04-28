package Exrcs4_2;

public class GrannySmith extends Apple {
	private double discount;
	
	public GrannySmith(String name, int q, int p, double d) {
		super(name, q, p);
		this.discount = d;

	}
	
	public double getDiscount() {
		return quantity*price*this.discount;
	}
	
	public double getTotalDiscount() {
		return quantity*price*getDiscount();
	}
	
	public double TotalPaid() {
		return (quantity*price)-getTotalDiscount();
	}
	
	
	public String toString() {		//overriding method
		return 	"Fruit: "+ name +"\n"+
				"Discount Given: "+getDiscount()+ " %" + "\n"+
				"Total Discount: " + "RM "+getTotalDiscount()+"\n"+
				"Total After Discount: RM "+TotalPaid()+"\n";
}
}
