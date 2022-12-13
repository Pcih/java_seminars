package com.example;

import java.util.Scanner;
import java.util.Stack;

public class task_3 {
    
    public static void polskaCalculator() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter in:");
        String[] str = scan.nextLine().split(" ");
        scan.close();
        Stack<Integer> st = new Stack<>();
        int result = 0;
        for (int i = 0; i < str.length; i++) {
            if (isDigit(str[i])) {
                st.push(Integer.parseInt(str[i]));
            } else {
                switch (str[i]) {
                    case "+":
                        result = st.pop() + st.pop();
                        st.push(result);
                        break;
                    case "-":
                        result = -st.pop() + st.pop();
                        st.push(result);
                        break;
                    case "*":
                        result = st.pop() * st.pop();
                        st.push(result);
                        break;
                    case "/":
                        result = st.pop() / st.pop();
                        st.push(result);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
