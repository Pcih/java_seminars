package com.example;

import java.util.LinkedList;


/**
 * 
 * Реализуйте очередь с помощью LinkedList со следующими методами:
*  enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый *  элемент из очереди и удаляет его, first() - возвращает первый элемент из   *  очереди, не удаляя.
*/

public class task_2 {
    private static LinkedList<Integer> queue = new LinkedList<>();

    // добавляет элемент в хвост очереди
    public static void enqueue(int value) {
        queue.offerLast(value);
    }

    // удаляет элемент из головы очереди
    public static int dequeue() {
        return queue.pollFirst();
    }

    // возвращает первый элемент, не удаляя его
    public static int first() {
        return queue.peekFirst();
    }

    public static void addList(){
        for (int i = 0; i < 10; i++) {
            enqueue(i);        
        }
        System.out.println("Очередь: " + queue);

        System.out.println("Удаляем: " + dequeue());
        System.out.println("Удаляем: " + dequeue());
        System.out.println("Первый элемент: " + first());

        System.out.println("Очередь: " + queue);
    }

}
