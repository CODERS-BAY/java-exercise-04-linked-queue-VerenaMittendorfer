package impl;

import java.util.Iterator;
import java.util.NoSuchElementException;

import skeleton.Person;
import skeleton.Queue;

public class QueueImpl extends Queue {

	public static int size = 0;

	public QueueImpl() {
		super();
	}

	@Override
	public void add(Person p) {
	}

	@Override
	public Person retrieve() throws NoSuchElementException {
		return null;
	}

	@Override
	public int size() {

		return -1;
	}

	@Override
	public void clear() {
		/*
		 * Comment from the Java implementation of clear() from the LinkedList
		 * 
		 * Clearing all of the links between nodes is "unnecessary", but: - helps a
		 * generational GC if the discarded nodes inhabit more than one generation - is
		 * sure to free memory even if there is a reachable Iterator
		 */
	}

	/**
	 * Iterator mostly used for printing in this exercise.
	 * 
	 * @return new Person iterator.
	 */
	public Iterator<Person> iterator() {
		return new Iterator<Person>() {

			Node current = first;

			@Override
			public boolean hasNext() {
				return current != null;
			}

			@Override
			public Person next() {
				if (current == null) {
					throw new NoSuchElementException();
				}
				// get the person from the node
				Person person = current.person;
				// get to the next node
				current = current.next;

				return person;
			}

		};
	}

	// This method is already implemented.
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Iterator<Person> it = iterator();

		while (it.hasNext()) {
			sb.append(it.next());
			sb.append(" -> ");
		}
		return sb.length() > 3 ? sb.substring(0, sb.length() - 3) : "empty list";
	}

}
