package abstract1.data.type;

import java.util.EmptyStackException;

public class StackByList<E> {
	E data;
	int size;

	StackByList<E> prev;
	StackByList<E> next;

	public boolean empty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	public E peek() {
		if (empty()) {
			throw new EmptyStackException();
		}

		return getLastNode().data;
	}

	public E pop() {
		if (empty()) {
			throw new EmptyStackException();
		}
		StackByList<E> tNode = new StackByList<E>();
		tNode.prev.next = null;
		tNode.prev = null;

		return tNode.data;
	}

	public void push(E item) {
		if (empty()) {
			this.data = item;
		} else {
			StackByList<E> tNode = new StackByList<E>();

			tNode.prev = getLastNode();
			getLastNode().next = tNode;
			tNode.data = item;
		}

		size++;
	}

	public int search(Object o) {
		StackByList<E> tNode = this;
		int count=0;
		
		while (tNode != null) {
			if (tNode.data.equals(o)) {
				count++;
			}
			tNode = tNode.next;
		}
		return -1;
	}

	// private
	private StackByList<E> getLastNode() {
		if (empty()) {
			throw new EmptyStackException();
		}

		StackByList<E> tNode = this;
		while (tNode.next != null) {
			tNode = tNode.next;
		}

		return tNode;
	}
}
