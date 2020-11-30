package collections;

import java.util.HashSet;
import java.util.Set;

public class Cset {

	public static void main(String[] args) {
		Set<Setuser> set=new HashSet<Setuser>();
		set.add(new Setuser(100,"Alex","alex112"));
		set.add(new Setuser(100,"Alex","alex112"));
		set.add(new Setuser(100,"Ben","alex112"));
		set.add(new Setuser(100,"Alec","alex112"));
		set.add(new Setuser(100,"Alec","alex112"));

		System.out.println("size of set is "+set.size());
	}

}
