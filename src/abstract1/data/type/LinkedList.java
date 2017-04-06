package abstract1.data.type;

import java.util.Collection;

public class LinkedList<E> {

	LinkedList<E> prev;
	LinkedList<E> next;

	E element;

	//
	public E getFirst() {
		return getFirstNode().element;
	}

	public E getLast() {
		return getLastNode().element;
	}

	public E removeFirst() {
		LinkedList<E> tNode = getFirstNode();

		E e = tNode.element;
		tNode = tNode.prev;

		return e;
	}

	public E removeLast() {
		LinkedList<E> tNode = getLastNode();

		E e = tNode.element;
		tNode = tNode.prev;
		return e;
	}

	public void addFirst(E e) {
		LinkedList<E> tNode = new LinkedList<E>();
		tNode.next = getFirstNode();
		getFirstNode().prev = tNode;
		tNode.element = e;
	}

	public void addLast(E e) {
		LinkedList<E> tNode = new LinkedList<E>();
		tNode.prev = getLastNode();
		getLastNode().next = tNode;
		tNode.element = e;
	}

	public boolean contains(Object o) {
		LinkedList<E> tNode = getFirstNode();

		while (tNode.next != null) {
			if (tNode.element.equals(o)) {
				return true;
			}

			tNode = tNode.next;
		}
		return false;
	}

	public int size() {
		LinkedList<E> tNode = new LinkedList<E>();

		tNode = getFirstNode();
		if (tNode == null) {
			return 0;
		}

		int size = 1;
		while (tNode.next != null) {
			size++;
		}

		return size;
	}

	public boolean remove(Object o) {
		LinkedList<E> tNode = new LinkedList<E>();
		tNode = getFirstNode();

		while (tNode.next != null) {
			if (tNode.element.equals(o)) {
				tNode.prev.next = tNode.next;
				tNode.next.prev = tNode.prev;
				return true;
			}

			tNode = tNode.next;
		}
		return false;
	}

	///////////////////////////////////////////////////////
	public boolean addAll(Collection<? extends E> c) {
		return false;
	}

	public void clear() {
		this.next = null;
	}

	public E get(int index) {
		return getNode(index).element;
	}

	public E set(int index, E e) {
		LinkedList<E> tNode = getNode(index);

		E tElement = tNode.element;
		tNode.element = e;

		return tElement;
	}

	public void add(int index, E e) {
		LinkedList<E> newNode = new LinkedList<E>();
		LinkedList<E> tNode = getNode(index);

		tNode.next.prev = newNode;
	}

	public E remove(int index) {
		LinkedList<E> tNode = getNode(index);

		tNode.prev.next = tNode.next;
		tNode.next.prev = tNode.prev;

		return tNode.element;
	}

	public int indexOf(Object o) {

		return -1;
	}

	// private
	private LinkedList<E> getFirstNode() {
		LinkedList<E> tNode = this;

		while (tNode.prev != null) {
			tNode = prev;
		}

		return tNode;
	}

	private LinkedList<E> getLastNode() {
		LinkedList<E> tNode = this;

		while (tNode.next != null) {
			tNode = next;
		}

		return tNode;
	}

	private LinkedList<E> getNode(int index) {
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException();
		}

		LinkedList<E> tNode = getFirstNode();

		while (index-- > 0) {
			tNode = tNode.next;
		}

		return tNode;
	}
}
