package abstract1.data.type;

public class QueueByArray<E> {
	E item;
	E[] array;
	int size;

	public QueueByArray() {
		this(16);
	}

	public QueueByArray(int size) {
		this.size = size;
		array = (E[]) new Object[size];
	}

	public boolean isEmpty() {
	}

	public E peek() {

	}

	public E pop() {

	}

	public E push(E e) {
	}

	public int search(Object o) {

	}

	private E[] getArray(int size) {
		return (E[]) new Object[size];
	}
}
