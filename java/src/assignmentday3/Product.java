package assignmentday4;

//2)	Create a product class The properties are ProID, ProName, ProPrice 
//display the information and ProPrice will be added additional tax of GST .

public class Product {
	int proId;
	String proName;
	double proPrice;
	public void product (int proId ,String proName,int proPrice) {
		System.out.println("productId="+proId+"productname="+proName+"productprice="+proPrice);
		System.out.println("GST of indian Government is 18%");
		double price;
		price=(proPrice *0.18)+proPrice;	
		System.out.println("product price after GST added is="+price);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product();
		p.product(123,"tv",999);

	}

}
