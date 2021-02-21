import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

public class SetLock<E> implements Set {
    private ArrayList<E> arr = new ArrayList<>();
    private static final ReentrantLock re = new ReentrantLock();

    @Override
    public boolean add(Object o) {
       re.lock();
       boolean b = arr.add((E) o);
       re.unlock();
       return b;
    }

    @Override
    public boolean remove(Object o) {
        re.lock();
        boolean b = arr.remove(o);
        re.unlock();
        return b;
    }

    @Override
    public boolean addAll(Collection c) {
        re.lock();
        boolean b = arr.addAll(c);
        re.unlock();
        return b;
    }

    @Override
    public void clear() {
        re.lock();
        arr.clear();
        re.unlock();
    }

    @Override
    public boolean removeAll(Collection c) {
        re.lock();
        boolean b = arr.removeAll(c);
        re.unlock();
        return b;
    }

    @Override
    public boolean retainAll(Collection c) {
        re.lock();
        boolean b = arr.retainAll(c);
        re.unlock();
        return b;
    }

    @Override
    public boolean containsAll(Collection c) {
        re.lock();
        boolean b = arr.containsAll(c);
        re.unlock();
        return b;
    }

    @Override
    public boolean contains(Object o) {
        re.lock();
        boolean b = arr.contains((E) o);
        re.unlock();
        return b;
    }

    @Override
    public int size() {
        return arr.size();
    }

    @Override
    public boolean isEmpty() {
        return arr.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return arr.iterator();
    }

    @Override
    public Object[] toArray() {
        return arr.toArray();
    }

    @Override
    public Object[] toArray(Object[] a) {
        return arr.toArray(a);
    }

    @Override
    public String toString() {
        return "SetLock{" +
                "arr=" + arr +
                '}';
    }
}
