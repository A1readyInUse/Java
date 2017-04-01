package abstract1.data.type;

import java.util.Collection;

public class LinkedList<E> {
	E element;
	LinkedList<E> prev;
	LinkedList<E> next;

	public LinkedList() {
	}

	//
	public E getFirst() {
		return getFirstNode().element;
	}

	public E getLast() {
		return getLastNode().element;
	}

	public E removeFirst() {
		LinkedList<E> tNode = new LinkedList<E>();

		tNode = getFirstNode();
		E e = tNode.element;

		tNode = tNode.prev;
		return e;
	}

	public E removeLast() {
		LinkedList<E> tNode = new LinkedList<E>();

		tNode = getLastNode();
		E e = tNode.element;

		tNode = tNode.prev;
		tNode.next = null;
		return e;
	}

	public void addFirst(E e) {
		LinkedList<E> tmp = new LinkedList<E>();

		tmp.element = e;
		getFirstNode().prev = tmp;
	}

	public void addLast(E e) {
		LinkedList<E> tmp = new LinkedList<E>();

		tmp.element = e;
		getLastNode().next = tmp;
	}

	public boolean contains(Object o) {
		LinkedList<E> tmp = new LinkedList<E>();
		tmp = getFirstNode();

		while (tmp.next != null) {
			if (tmp.element.equals(o)) {
				return true;
			}

			tmp = tmp.next;
		}

		return false;
	}

	public int size() {
		LinkedList<E> tmp = new LinkedList<E>();

		tmp.getFirstNode();
		int size = 1;

		while (tmp.next != null) {
			size++;
		}

		return size;
	}

	public boolean remove(Object o) {
		LinkedList<E> tmp = new LinkedList<E>();
		tmp = getFirstNode();

		while (tmp.next != null) {
			if (tmp.element.equals(o)) {
				tmp.prev.next = tmp.next;
				tmp.next.prev = tmp.prev;
				return true;
			}

			tmp = tmp.next;
		}
		return false;
	}

	///////////////////////////////////////////////////////
	public boolean addAll(Collection<? extends E> c) {
		return false;
	}

	public void clear() {
		LinkedList<E> tmp = new LinkedList<E>();
		tmp = getFirstNode();

		while (tmp.next != null) {
			tmp = tmp.next;

			tmp.prev.element = null;
			tmp.prev.prev = null;
			tmp.prev.next = null;
		}
		tmp.element = null;
		tmp.prev = null;
		tmp.next = null;
	}

	public E get(int index) {
		return getNode(index).element;
	}

	public E set(int index, E e) {
		LinkedList<E> tNode = getNode(index);

		E tElem = tNode.element;
		tNode.element = e;

		return tElem;
	}

	public void add(int index, E e) {
		LinkedList<E> prevNode = new LinkedList<E>();
		LinkedList<E> nextNode = new LinkedList<E>();
		LinkedList<E> tmp = new LinkedList<E>();

		prevNode = getNode(index).prev;
		nextNode = getNode(index).next;

		tmp.element = e;
		tmp.prev = prevNode;
		tmp.next = nextNode;
	}

	public E remove(int index) {
		LinkedList<E> tmp = getNode(index);

		tmp.prev.next = tmp.next;
		tmp.next.prev = tmp.prev;

		return tmp.element;
	}

	public int indexOf(Object o) {
		
		return -1;
	}

	// private
	private LinkedList<E> getFirstNode() {
		LinkedList<E> tmp = new LinkedList<E>();
		tmp = this;

		while (tmp.prev != null) {
			tmp = prev;
		}
		return tmp;
	}

	private LinkedList<E> getLastNode() {
		LinkedList<E> tmp = new LinkedList<E>();
		tmp = this;

		while (tmp.next != null) {
			tmp = next;
		}

		return tmp;
	}

	private LinkedList<E> getNode(int index) {
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException();
		}

		LinkedList<E> tmp = new LinkedList<E>();
		tmp = getFirstNode();

		while (index-- > 0) {
			tmp = tmp.next;
		}

		return tmp;
	}
}
