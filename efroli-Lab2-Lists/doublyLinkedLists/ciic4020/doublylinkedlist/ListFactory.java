package ciic4020.doublylinkedlist;

public interface ListFactory<E> {

	public List<E> newInstance(int initialCapacity);
	
	public List<E> newInstance();
}