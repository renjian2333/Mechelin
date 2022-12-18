package com.tongji.michelin.scene.staffarea.WorkerIterator;

/**
 * @classname Iterator
 * @description All iterators should implement this interface so that they can be iterators.
 */
public interface Iterator {

    Object first();

    Object next();

    boolean hasNext();
}
