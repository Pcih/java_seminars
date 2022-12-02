package com.example;

import java.util.Collections;
import java.util.List;

public class task_3 {
    // Найти минимальное значение
    public static  Integer getMin(List<Integer> list){
        int minValue = Collections.min(list);
        return minValue;
    }

    // Найти максимальное значение
    public static Integer getMax(List<Integer> list){
        int maxValue = Collections.max(list);
        return maxValue;
    }

    // Найти среднее значение
    public static double getAverage(List<Integer> list){
        int listAvarage = 0;
        for (int i = 0; i < list.size(); i++){
            listAvarage += list.get(i);
        }
        return ((double)listAvarage/(double)list.size());
    }
}
