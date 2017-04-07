package abstract1.data.type;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;

public class QueueByArray<E> {
	E[] data;

	int capacity;
	int size; // current queue size

	public QueueByArray() {
		this(16);
	}

	public QueueByArray(int capacitySize) {
		this.size = 0;
		data = increaseCapacity(capacitySize);
	}

	//
	public boolean add(E e) {
		// ClassCastException
		// IllegalArgumentException
		if (Objects.isNull(e)) {
			throw new NullPointerException();
		}

		if (isFull()) {
			throw new IllegalStateException();
		}

		data[size++] = e;
		return true;
	}

	public boolean offer(E e) {
		// ClassCastException
		// IllegalArgumentException
		if (Objects.isNull(e)) {
			throw new NullPointerException();
		}

		if (isFull()) {
			increaseCapacity(2 * data.length);
		}

		data[size++] = e;
		return true;
	}

	public E remove() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}

		return data[(size--) - 1];
	}

	public E poll() {
		if (isEmpty()) {
			return null;
		}

		return data[(size--) - 1];
	}

	public E element() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}

		return data[size - 1];
	}

	public E peek() {
		if (isEmpty()) {
			return null;
		}

		return data[size - 1];
	}

	// private
	private boolean isEmpty() {
		if (size == 0) {
			return true;
		}

		return false;
	}

	private boolean isFull() {
		if (size == capacity) {
			data = increaseCapacity(2 * data.length);
		}

		return false;
	}

	private E[] increaseCapacity(int capacity) {
		return Arrays.copyOf(data, capacity);
	}
}
