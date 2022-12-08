// 3. Реализовать простой калькулятор

package com.example;
import java.util.Scanner;


public class App 
{
    public static String[] myGeLists(){
       Scanner iScanner = new Scanner(System.in);
       System.out.printf("Ведите пример разделяя значения пробелами: ");
       String name = iScanner.nextLine();
       String result[] = name.split(" ");
       iScanner.close();
        return result;
    } 

    public static Double calculator(String[] ListResult) {
        char value = ListResult[1].charAt(0);
        double FirstNumber = Double.parseDouble(ListResult[0]);
        double SecondNumber = Double.parseDouble(ListResult[2]);
        double result = 0;
        if (value == '+') {
             result = FirstNumber + SecondNumber;
        }

        if (value == '-') {
            result = FirstNumber - SecondNumber;
        }

        if (value == '/') {
            result = FirstNumber / SecondNumber;
        }

        if (value == '*') {
            result = FirstNumber * SecondNumber;
        }

        return result;
    }     

    


    public static void main( String[] args ){
        String[] UserSend = myGeLists();
        double ResultCalc = calculator(UserSend);
        
        
        System.out.println(ResultCalc);
       
      
       
    }
}