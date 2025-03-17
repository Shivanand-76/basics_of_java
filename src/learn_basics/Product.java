package learn_basics;

public class Product {

	public static void main(String[] args) {
		int p1=1250;
		int p2=1450;
		int finalCost=p1+p2;
		int finalCostwithGst=finalCost+finalCost*12/100;
		System.out.println(finalCostwithGst);
			
	}
}
