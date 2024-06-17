package com.walking.classes_objects.task_1;

public class Main {
    public static void main(String[] args) {
        Counter oddCounter = new Counter("Odd counter");
        Counter evenCounter = new Counter("Even counter");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenCounter.incrementCounter();
            } else {
                oddCounter.incrementCounter();
            }
        }

        System.out.println("Even numbers : " + evenCounter.counter);
        System.out.println("Odd numbers : " + oddCounter.counter);
    }
}
