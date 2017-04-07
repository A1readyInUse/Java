package abstract1.data.type;

import java.util.Objects;

public class QueueByList<E> {
	E element;

	int size;

	QueueByList<E> prev;
	QueueByList<E> next;

	//
	public boolean add(E e) {
		// ClassCastException
		// IllegalArgumentException
		if (Objects.isNull(e)) {
			throw new NullPointerException();
		}

		QueueByList<E> tNode = new QueueByList<E>();

		tNode.prev = getLastNode();
		getLastNode().next = tNode;

		return true;
	}

	
	
	// private
	private boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	private QueueByList<E> getLastNode() {
		QueueByList<E> tNode = this;

		while (tNode != null) {
			tNode = tNode.next;
		}

		return tNode;
	}
}
