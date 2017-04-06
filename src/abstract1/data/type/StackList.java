package abstract1.data.type;

public class StackList<E> {
	E element;

	StackList<E> prev;
	StackList<E> next;

	public boolean push(E e) {
	}

	public E pop() {
	}

	private StackList<E> findLast() {
		while (next != null) {
			next = next.next;
		}

		return this;
	}
}
