package model;

import java.util.Iterator;
import java.util.List;

public class ToysIterator <T> implements Iterator<T> {
    private int index;
    private List<T> toys;
    public ToysIterator(List <T> toys){
        this.toys=toys;
    }

    @Override
    public boolean hasNext() {
        return toys.size()>index;
    }

    @Override
    public T next() {
        return toys.get(index++);
    }
}
