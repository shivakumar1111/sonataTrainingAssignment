package assignmentday5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Product1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> pro = new ArrayList<>();
		pro.add(new Product(12,"Mixer",10000));
		pro.add(new Product(22,"Oven",7500));
		pro.add(new Product(73,"Tv",45500));
		pro.add(new Product(42,"Washing Machine",17800));
		pro.add(new Product(45,"Suitcase",4000));
		
		Collections.sort(pro,

					(e1,e2)->e1.getProPrize()-e2.getProPrize());
		pro.forEach(System.out::println);
		
		/*Collections.sort(pro, new Mysort());
		System.out.println(pro);*/
}

	}


