package application;

import impl.Employee;
import impl.QueueImpl;
import skeleton.Person;
import skeleton.Queue;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		/*
		 * some testing here
		 */

		Employee e = new Employee("Verena", "Mittendorfer", 26, "lohnverrechnung", "lohnverrechner");

//		e.print();
		System.out.println(e.toString());

		QueueImpl q = new QueueImpl();

		Iterator<Person> iterator = q.iterator();
		while (iterator.hasNext()) {
			// do something
			iterator.next();
		}

	}

}
