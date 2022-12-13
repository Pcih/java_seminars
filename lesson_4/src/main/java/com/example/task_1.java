package com.example;

import java.util.LinkedList;

/**
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который    * вернет “перевернутый” список.
 */

public class task_1 {
    public static LinkedList<Integer> createLinkedList(){
        LinkedList<Integer> linkedListMain = new LinkedList<Integer>();
        linkedListMain.add(0);
        linkedListMain.add(1);
        linkedListMain.add(2);
        linkedListMain.add(3);
        linkedListMain.add(4);
        System.out.print("Изначальный массив:  ");
        System.out.println(linkedListMain);
        linkedListMain = reversLinkedList(linkedListMain);
        System.out.print("Перевернутый массив: ");
        System.out.println(linkedListMain);
        return linkedListMain;
    }

    public static LinkedList<Integer> reversLinkedList(LinkedList<Integer> lLforRevers) {
        LinkedList<Integer> temp = new LinkedList<Integer>();
        for (int i = lLforRevers.size()-1; i >= 0; i--) {
            temp.add(lLforRevers.get(i));
        }
        return temp;
    }
}
