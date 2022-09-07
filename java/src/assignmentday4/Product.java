package assignmentday5;

/*Create a product class with list of products and 
 * display the products based on their price in sorted order and 
 * handle the custom exception if price is negative number.
 */

public class Product {
	int proId;
	String proName;
	int proPrize;

	public Product(int id, String name, int prize) {
		
		this.proId = id;
		this.proName = name;
		this.proPrize =prize;
	}

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public int getProPrize() {
		return proPrize;
	}

	public void setProPrize(int proPrize) {
		this.proPrize = proPrize;
	}

	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", proPrize=" + proPrize + "]";
	}




}
