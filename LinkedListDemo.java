package day13;
import java.util.LinkedList;
import java.util.List;
public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList l = new LinkedList ();

		l.add(2);
		l.add(5);
		l.addFirst(10);
		l.addLast(4);
		l.add(25);

		System.out.println("Linked list" + 1);

		l.removeFirst();

		System.out.println("Linked list" + 1);

		l.removeLast();

		System.out.println("Linked list" + 1);

	}

}
