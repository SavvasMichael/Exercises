package com.savvas.pairing.stack;

import java.util.ArrayList;
import java.util.List;

public class StackImpl<E> implements Stack<E> {

    private List<E> stack = new ArrayList<E>();
    @Override
    public E push(E e) {
        stack.add(0,e);
        return e;
    }

    @Override
    public E pop() {
        return stack.remove(0);
    }

    @Override
    public int size() {
        return stack.size();
    }
}
