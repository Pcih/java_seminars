/**
 *  1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! 
 */

package com.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        int UserNumber = GetInputNumber();
        int CycleNumber = ResultCycle(UserNumber);
        int FormulNumber = ResultFormul(UserNumber);
        int RecursionNumber = ResultRecursion(UserNumber);
        System.out.printf("Вы вели %d\n", UserNumber);
        System.out.printf("Резултат цикла %d\n", CycleNumber);
        System.out.printf("Результат формулы %d\n", FormulNumber);
        System.out.printf("Результат рекурсии %d\n", RecursionNumber);        
    }

        /**
         * Функция принемает число от  пользователя
         * @return Возрощает натурольное целое число
         */
    static int GetInputNumber(){        
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Ведите число");
        int value = iScanner.nextInt();
        iScanner.close();
        return value;
    }


        /**
         * При помощи цикла определяет n-ое треугольного число
         * @param number принемает натуральное n число
         * @return натуральное треугольное число
         */
    static int ResultCycle(int number){        
        int result = 0;
        for (int i = 1; i < number + 1; i++) {
            result += i;
        }      
        return result;
    }


        /**
         * При помощи формулы определяет n-ое треугольного число
         * @param number принемает натуральное n число
         * @return натуральное треугольное число
         */
    static int ResultFormul(int number){        
        int result = (number * (number + 1)) / 2;
        return result;
    }


        /**
         * При помощи рекурсии определяет n-ое треугольного число
         * @param number принемает натуральное n число
         * @return натуральное треугольное число
         */
    static int ResultRecursion(int number){        
        int result = number;
        if(number == 1) return 1;
        return result + ResultCycle(number - 1);
    }
}
