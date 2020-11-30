package java8;

import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		List<Laptop> laptop=Laptop.fetchLaptops();
		System.out.println("Sequential Stream");
		List<Laptop> particularLaptop=laptop.stream().filter(item->item.getBrandName().equals("Lenova")).filter(item->item.getPrice()<30000).sorted((i1,i2 )->Double.compare(i2.getRatings(),i1.getRatings())).
		collect(Collectors.toList());
		particularLaptop.forEach(item->System.out.println(item));
		System.out.println("Parallel Stream");
		laptop.stream().filter(item->item.getBrandName().equals("Lenova")).filter(item->item.getPrice()<30000).sorted((i1,i2)->Double.compare(i2.getRatings(), i1.getRatings())).forEach(item->System.out.println(item));

	}

}
