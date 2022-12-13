import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// 2. Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.


public class RecurringNames {
    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();
        String employees = "Антон " +
                "Марина " +
                "Светлана " +
                "Кристина " +
                "Анна " +
                "Анна " +
                "Иван " +
                "Анфиса " +
                "Мария " +
                "Иван " +
                "Павел " +
                "Мария " +
                "Светлана " +
                "Мария " +
                "Адрей" +
                "Мария " +
                "Мария " +
                "Марина " +
                "Иван " +
                "Анна " +
                "Иван " +
                "Павел " +
                "Иван ";
        String[] listOfNames = employees.split(" ");
        for (int i = 0; i < listOfNames.length; i ++) {
            if (nameMap.containsKey(listOfNames[i])) {
                nameMap.replace(listOfNames[i], nameMap.get(listOfNames[i]) + 1);
            } else {
                nameMap.put(listOfNames[i], 1);
            }
        }
        System.out.println("Количество имен в списке:\n" + nameMap);
        Map<String, Integer> sortedNameMap = new LinkedHashMap<>();
        int max = 1;
        for (int value : nameMap.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
                String key = entry.getKey();
                if (nameMap.get(key) == i) {
                    sortedNameMap.put(key, nameMap.get(key));
                }
            }
        }
        System.out.println("Отсортированный по убыванию популярности список имен:\n" + sortedNameMap);
    }
}
