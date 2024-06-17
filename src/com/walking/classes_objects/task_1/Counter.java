package com.walking.classes_objects.task_1;

public class Counter {
    String name;
    int counter;

    public Counter(String name, int counter) {
        this.name = name;
        this.counter = counter;
    }

    public Counter(String name) {
        this(name, 0);
    }

    public int incrementCounter() {
       return ++counter;
    }

    public int decrementCounter() {
        return --counter;
    }

    public int addValue (int value) {
        return counter += value;
    }

    public int subtractValue (int value) {
        return counter -= value;
    }
}
