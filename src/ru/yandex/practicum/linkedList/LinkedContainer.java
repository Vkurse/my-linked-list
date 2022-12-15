package ru.yandex.practicum.linkedList;

public class LinkedContainer<T> implements Linked<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size = 0;

    public LinkedContainer() {
        lastNode = new Node<T>(null, firstNode, null);
        firstNode = new Node<T>(null, null, lastNode);

    }

    @Override
    public void addFirst(T e) {
        Node<T> next = firstNode;
        next.setCurrentElement(e);
        firstNode = new Node<T>(null, null, next);
        next.setPrevElement(firstNode);
        size++;


    }

    @Override
    public void addLast(T e) {
        Node<T> prev = lastNode;
        prev.setCurrentElement(e);
        lastNode = new Node<T>(null, prev, null);
        prev.setNextElement(lastNode);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T getElementByIndex(int index) {
        Node<T> target = firstNode.getNextElement();
        for (int i = 0; i < index; i++) {
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }

    private Node<T> getNextElement(Node<T> current) {
        return current.getNextElement();
    }

    private class Node<T> {
        private T currentElement;
        private Node<T> nextElement;
        private Node<T> prevElement;

        public Node(T currentElement, Node<T> prevElement, Node<T> nextElement) {
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }

        public T getCurrentElement() {
            return currentElement;
        }

        public void setCurrentElement(T currentElement) {
            this.currentElement = currentElement;
        }

        public Node<T> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<T> nextElement) {
            this.nextElement = nextElement;
        }

        public Node<T> getPrevElement() {
            return prevElement;
        }

        public void setPrevElement(Node<T> prevElement) {
            this.prevElement = prevElement;
        }
    }
}
