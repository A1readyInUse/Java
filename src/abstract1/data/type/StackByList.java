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

		return getLastNode().next.data;
	}

	public E pop() {
		if (empty()) {
			throw new EmptyStackException();
		}

		getLastNode().next = null;
		return getLastNode().next.data;
	}

	public void push(E item) {
		if(empty()) {
			this.data=item;
		}else if() {
			
		}
	}

	public int search(Obejct o) {

	}

	private StackByList<E> getLastNode() {
		if (empty()) {
			throw new EmptyStackException();
		}

		while()
	}
}
