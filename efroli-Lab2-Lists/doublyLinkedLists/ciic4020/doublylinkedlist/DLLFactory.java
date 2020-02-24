package ciic4020.doublylinkedlist;

public class DLLFactory<E> implements ListFactory<E> {

	@Override
	public List<E> newInstance(int initialCapacity) {
		// We don't pre-allocate nodes, so initialCapacity isn't actually used
		return new DoublyLinkedList<E>();
	}

	@Override
	public List<E> newInstance() {
		return new DoublyLinkedList<E>();
	}

}