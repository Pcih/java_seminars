package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "\nTask 1" );
        int[] numsOfArray = { 1, 2, 0, 3, 5, 4, 2 };
        task_1.mergeSort(numsOfArray, numsOfArray.length);

        System.out.println("\nTask 2");
        //Создаём ArrayList 
        List<Integer> myList = new ArrayList<Integer>();
        //заполняем myList 
        myList.add(3);
        myList.add(4);
        
        //Удаляем чётные числа
        System.out.println("Remove odd values: " + task_2.removeNegativeValue(myList));
        System.out.println("\nTask 3");
        System.out.println("List" + myList);
        //Получаем максимальное значение из списка
        System.out.println("Max value equal: " + task_3.getMax(myList));
        //Получаем минимальное значение из списка
        System.out.println("Min value equal: " + task_3.getMin(myList));
        //Получаем среднее арифметическое
        System.out.println("Avarage value equal: " + task_3.getAverage(myList));

        System.out.println("\nTask 4");
        List<Integer> lst1 = filllist(5);
        List<Integer> lst2 = filllist(5);
        System.out.print("Первый лист : ");
        System.out.println(lst1);
        System.out.print("Второй лист : ");
        System.out.println(lst2);
        System.out.print("Все числа из первой коллекции, которые не содержатся во второй коллекции : ");
        System.out.println(raznostL1L2(lst1,lst2));
        System.out.print("Все числа из второй коллекции, которые не содержатся в первой : ");
        System.out.println(raznostL1L2(lst2,lst1));
        System.out.print("числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй, которых нет в первой : ");
        List<Integer> lst = raznostL1L2(lst1,lst2);
        lst.addAll(raznostL1L2(lst2,lst1));
        System.out.println(lst);
        
    }

    private static List<Integer> filllist(int size){
        List<Integer> lst = new ArrayList<Integer>(size);
        Random rand = new Random();
        for(int i = 0; i < size; i++)
            lst.add(rand.nextInt(20)); 
        return lst;
       }
       
    private static List<Integer> raznostL1L2(List<Integer> lst1, List<Integer> lst2){
        List<Integer> lst = new ArrayList<Integer>(lst1.size());
        lst.addAll(lst1);
        lst.removeAll(lst2);
        return lst;
       }


}
