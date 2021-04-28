package Exrcs4_2;

public class FujiApple extends Apple {
	private int weight;
	private int tall;
	private int maxgrowth;
	private int mingrowth;

	public FujiApple(String name, int q, int p, int w, int t, int m, int n) {
		super(name, q, p);
		this.weight = w;
		this.tall = t;
		this.maxgrowth = m;
		this.mingrowth = n;
	}
	
	public int getWeight() {//overloading method
		return this.weight;
	}
	
	public int getWeight(int weight) {
		return weight;
	}
	
	public double CalAgeOfAppleTreeMax() {
		return (tall*12)/maxgrowth;
	}
	
	public double CalAgeOfAppleTreeMin() {
		return (tall*12)/mingrowth;
	}
	
	public int TotalWeight() {
		return super.getQuantity()*weight;
	}
	
	// overriding method
		public String toString() {
			 return 	"Fruit: "+ name +"\n"+
					"Weight : " +weight + " grams" + "\n"+
					"Estimated age of tree is in between: " +CalAgeOfAppleTreeMin() + " to " +CalAgeOfAppleTreeMax() + " years" +"\n";
}
}