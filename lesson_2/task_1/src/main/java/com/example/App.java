package com.example;
import java.io.*;
/**
*    В файле содержится строка с исходными данными в такой форме:
*    {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
*    Требуется на её основе построить и вывести на экран новую строку, в форме *    SQL запроса:
*    SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND *    city = "Moscow";
*    Для разбора строки используйте String.split.
*    Сформируйте новую строку, используя StringBuilder. Значения null не *       включаются в запрос.
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            FileReader fr = new FileReader("text.txt");
            BufferedReader reader = new BufferedReader(fr);
            String line_temp = reader.readLine();
            String line =  line_temp.substring(1, line_temp.length() - 1);
            String line1 = line.replace(",","");
            String[] words = line1.split(" ");
            String forName = words[0];
            String forCountry = words[1];
            String forCity = words[2];
            String[] name = forName.split(":");
            String[] country = forCountry.split(":");
            String[] city = forCity.split(":");
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT * FROM students WHERE name = ");
            sql.append(name[1]);
            sql.append(" ");
            sql.append("AND country = ");
            sql.append(country[1]);
            sql.append(" ");
            sql.append("AND city = ");
            sql.append(city[1]);
            sql.append(" ");
            System.out.println(sql);
            reader.close(); 

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
