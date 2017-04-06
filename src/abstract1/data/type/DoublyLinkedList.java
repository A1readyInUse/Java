package abstract1.data.type;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class DoublyLinkedList<E> {

	DoublyLinkedList<E> prev;
	DoublyLinkedList<E> next;

	E element;

	//
	public E getFirst() {
		return getFirstNode().element;
	}

	public E getLast() {
		return getLastNode().element;
	}

	public E removeFirst() {
		DoublyLinkedList<E> tNode = getFirstNode();

		tNode.next.prev = null;
		tNode.next = null;
		E e = tNode.element;
		return e;
	}

	public E removeLast() {
		DoublyLinkedList<E> tNode = getLastNode();

		tNode.prev.next = null;
		tNode.prev = null;
		E e = tNode.element;
		return e;
	}

	public void addFirst(E e) {
		DoublyLinkedList<E> tNode = new DoublyLinkedList<E>();
		tNode.next = getFirstNode();
		tNode.next.prev = tNode;
		tNode.element = e;
	}

	public void addLast(E e) {
		DoublyLinkedList<E> tNode = new DoublyLinkedList<E>();
		tNode.prev = getLastNode();
		tNode.prev.next = tNode;
		tNode.element = e;
	}

	public boolean contains(Object o) {
		DoublyLinkedList<E> tNode = getFirstNode();

		while (tNode != null) {
			if (tNode.element.equals(o)) {
				return true;
			}

			tNode = tNode.next;
		}

		return false;
	}

	public int size() {
		DoublyLinkedList<E> tNode = getFirstNode();

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
		DoublyLinkedList<E> tNode = getFirstNode();

		while (tNode != null) {
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
		this.next.prev = null;
		this.next = null;
	}

	public E get(int index) {
		return getNode(index).element;
	}

	public E set(int index, E e) {
		DoublyLinkedList<E> tNode = getNode(index);

		E tElement = tNode.element;
		tNode.element = e;

		return tElement;
	}

	public void add(int index, E e) {
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException();
		}

		DoublyLinkedList<E> tNode = getNode(index);
		DoublyLinkedList<E> newNode = new DoublyLinkedList<E>();

		newNode.element = e;

		if (tNode.prev != null) {
			tNode.prev.next = newNode;
			newNode.prev = tNode;
		}
		if (tNode.next != null) {
			tNode.next.prev = newNode;
			newNode.next = tNode;
		}
	}

	public E remove(int index) {
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException();
		}

		DoublyLinkedList<E> tNode = getNode(index);

		if (tNode.prev != null) {
			tNode.prev.next = tNode.next;
		}
		if (tNode.next != null) {
			tNode.next.prev = tNode.prev;
		}

		return tNode.element;
	}

	public int indexOf(Object o) {
		DoublyLinkedList<E> tNode = getFirstNode();
		int count = 0;

		while (tNode != null) {
			if (tNode.element.equals(o)) {
				return count;
			}
			tNode = tNode.next;
			count++;
		}

		return -1;
	}

	public int lastIndexOf(Object o) {
		DoublyLinkedList<E> tNode = getLastNode();
		int count = size() - 1;

		while (tNode != null) {
			if (tNode.element.equals(o)) {
				return count;
			}
			tNode = tNode.prev;
			count--;
		}
		return -1;
	}

	// private
	private DoublyLinkedList<E> getFirstNode() {
		DoublyLinkedList<E> tNode = this;

		while (tNode != null) {
			tNode = tNode.prev;
		}

		return tNode;
	}

	private DoublyLinkedList<E> getLastNode() {
		DoublyLinkedList<E> tNode = this;

		while (tNode != null) {
			tNode = tNode.next;
		}

		return tNode;
	}

	private DoublyLinkedList<E> getNode(int index) {
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException();
		}

		DoublyLinkedList<E> tNode = getFirstNode();

		while (index-- > 0) {
			tNode = tNode.next;
		}

		return tNode;
	}
}
