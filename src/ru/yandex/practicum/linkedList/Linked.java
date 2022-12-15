package ru.yandex.practicum.linkedList;

public interface Linked<T> {

    void addFirst(T e);

    void addLast(T e);

    int size();

    T getElementByIndex(int index);
}
