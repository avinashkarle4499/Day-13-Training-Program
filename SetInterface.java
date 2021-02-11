package day13;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetInterface {

	public static void main(String[] args) {

		HashSet h = new HashSet();
		h.add(3);
		h.add(20);
		h.add(6);
		h.add("java");
		h.add("hello");
		h.add("java");

		System.out.println("hashset" + h);


		LinkedHashSet lh = new LinkedHashSet ();
		lh.add(3);
		lh.add(6);
		lh.add(20);
		lh.add("java");
		lh.add("hello");
		lh.add("java");

		System.out.println("linkedhashset" + lh);
	}

}
