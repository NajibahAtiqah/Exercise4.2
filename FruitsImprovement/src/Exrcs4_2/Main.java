package Exrcs4_2;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("<<<<<<<<<<<<<<< APPLE'S DETAILS >>>>>>>>>>>>>>>");
		Apple A = new Apple("Apple", 15, 2);
		System.out.println(A);//print using overriding method
		
		System.out.println("<<<<<<<<<<<<<<< GRANNY SMITHS'S DETAILS >>>>>>>>>>>>>>>");
		GrannySmith GS = new GrannySmith("Granny Smith", 2, 2, 0.1);
		System.out.println(GS);

		System.out.println("<<<<<<<<<<<<<<<< FUJI APPLE'S DETAILS >>>>>>>>>>>>>>>>");
		FujiApple FA = new FujiApple("Fuji", 15, 10, 152,7, 24, 13);
		System.out.println(FA);
		
		System.out.println("<<<<<<<<<<<<<<<<< GRAPE'S DETAILS >>>>>>>>>>>>>>>>>");
		Grape G = new Grape("Grape", "Purple", 104, 27);
		System.out.println(G);
		
		System.out.println("<<<<<<<<<<<<<<<<< MANGO'S DETAILS >>>>>>>>>>>>>>>>>");		
		Mango M = new Mango("Mango", 0.3);
		System.out.println(M);
	}

}
