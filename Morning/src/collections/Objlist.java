package collections;

import java.util.ArrayList;
import java.util.List;

public class Objlist {

	public static void main(String[] args) {
		
		List<Listuser> list=new ArrayList<>();
		list.add(new Listuser(123,"Navya","Navya123"));
		list.add(new Listuser(234,"Sravya","Sravya123"));
		list.add(new Listuser(345,"Bhavya","Bhavya123"));
		list.add(new Listuser(456,"Kavya","Kavya123"));
		list.add(new Listuser(567,"Divya","Divya123"));
		System.out.println("Users with name more than 5 letters: ");
		for(Listuser u:list)
		{
			if(u.getName().length()>5)
			{
				System.out.println(u);;
			}
		}
		
		
		
	}

}
