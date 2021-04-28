package Exrcs4_2;

public class Apple extends Fruits {
	protected int quantity;
	protected double price;
	
	public Apple() {//constructor with no argument
		super();
		quantity=0;
		price=0;
	}
		
	public Apple(String name,int q,int p) {	//constructor with argument
		super(name);
		setDetails(name,q,p);//calling method
	}
	
		public void setDetails(String name,int q,int p) {//overloading method with 2 parameter
	{
			if(q > 0) 
				quantity = q;
			else 
				quantity = 0;

			if(p > 0) 
				price= p;
			else 
				price= 0;
	}
		}
		
		public int getQuantity() {
			return quantity;
		}
		
		public double getPrice() {
			return price;
		}
		
		public double TotalPrice() {
			return quantity*price;
		}
		
		
		
		public String toString() {//overriding method
			return 	"Enter: "+ name +"\n"+
					"Quantity of fruit: "+ quantity + "\n"+
					"Price of fruit: " + "RM" + price + "\n"+
					"Total Price: " + "RM" + TotalPrice() + "\n";

					
			}
		{
	}	
}
