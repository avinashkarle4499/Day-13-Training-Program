package day13;

import java.util.ArrayList;

public class JavaCollectionDemo {

	public static void main(String[] args) {

		ArrayList<Integer> o1 = new ArrayList<Integer>();

		o1.add(1);
		o1.add(2);
		o1.add(3);

		System.out.println("elements are" + o1);
		o1.add(1,10);
		System.out.println("elements are" + o1);

		o1.set(2, 40);
		System.out.println("elements are" + o1);
	}

}
