package com.example;

import java.util.Iterator;
import java.util.List;

public class task_2 {
     //Нужно удалить из него четные числа
     public static  List<Integer> removeNegativeValue(List<Integer> list){
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()){
            if (iter.next() % 2 == 0) iter.remove();
        } 
        return list;
    }
}
