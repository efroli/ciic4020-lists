package ciic4020.linkedlist;

public interface List<E> extends Iterable<E> {

	public void add(E obj);
	public void add(int index, E obj);
	public boolean remove(E obj);
	public boolean remove(int index);
	public int removeAll(E obj);
	public E get(int index);
	public E set(int index, E obj);
	public E first();
	public E last();
	public int firstIndex(E obj);
	public int lastIndex(E obj);
	public int size();
	public boolean isEmpty();
	public boolean contains(E obj);
	public void clear();
	
	//Exercise 2
	public int replaceAll(E e, E f);
	
	//Exercise 3
	public List<E> reverse();
}