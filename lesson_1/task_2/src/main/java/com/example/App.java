/** 
 * 2. Вывести все простые числа от 1 до 1000 
 */
package com.example;

public class App {    

    /**
     * Функция для вывода простых чисел в диапазоне заданного числа `n`
     * При помощи Решита Эратосфена
     * @param n получаем предел простых чисел
     */
    public static void sieveOfEratosthenes(int n)
    {
        int[] a = new int[n + 1];
        for (int i = 0; i <= n; i++) {// инициализировать все числа как простые
            a[i] = 1;
        }

        for (int i = 2; i <= Math.sqrt(n); i++){
            if (a[i] == 1)          // проверяет, является ли `i` простым числом
            {
                for (int j = 2; i * j <= n; j++) {
                    a[i * j] = 0;    // числа, кратные `i`, не являются простыми
                }
            }
        }
        System.out.println("\nВывод простых чисел при помощи Решето Эратосфена:");
        for (int i = 2; i <= n; i++)
        {
            if (a[i] == 1) {
                System.out.print(i + " ");  // печатает простые числа
            }
        }        
    }
    /**
     * Функция для вывода простых чисел в диапазоне заданного числа `n`
     * При помощи цикла
     * @param n получаем предел простых чисел
     */
    public static void SimpleNum(int n){
        System.out.println("\nПростые числа при помощи цыкла: ");
        for (int i = 2; i <= n; i++) { // Первый цикл проходит от 2 до 999
            Integer rez = i;   // определяем вывод как счетчик 
            for (int j = 2; j < i; j++) { 
                if (i % j == 0) { 
                    rez = null; // проверяем число простое если нет то перезаписываем переменую
                        break;
                }
            }
            if (rez != null) { // если переменная не пуста выводим результат 
                System.out.print(rez + " ");
            }  
        }
    }
    
        public static void main(String[] args)
        {
            // вывести простые числа меньше 1000
            sieveOfEratosthenes(1000);
            SimpleNum(1000);
        }
}
