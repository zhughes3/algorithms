package list;

public interface List<E> {
	
public void add(E e);

public void add(int idx, E e);

public E get(int idx);

public int indexOf(E e);

public boolean isEmpty();

public void remove(int idx);

public int remove(E e);

public void removeAll();

public int getSize();
}
