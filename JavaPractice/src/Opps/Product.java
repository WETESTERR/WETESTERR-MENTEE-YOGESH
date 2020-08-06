package Opps;

public class Product {
	String name;
	double price;
	int quantity;
public void initiateProduct(String initialName, double initialPrice, int initialQuantity)
{
	name = initialName;
	price = initialPrice;
	quantity = initialQuantity;
}
public void printProduct()
{
	System.out.println(name +", " + "price "+ price +", " +quantity +" pices");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product fruite = new Product();
fruite.initiateProduct("Bannana", 5.0, 12);
fruite.printProduct();
	}

}
