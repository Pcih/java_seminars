import java.util.HashMap;
import java.util.List;

// 1. Реализуйте структуру телефонной книги с помощью HashphoneNumber, учитывая, что один человек может иметь несколько телефонов.
class Phonebook {
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();
    public static void main(String[] args) {
        dataOfBook();
        findInDataOfBook("Егоров");
    }
    
    public static void dataOfBook() {
        phoneBook.put("Егоров", List.of("+79999999999", "+79991234567"));
        phoneBook.put("Петров", List.of("+75552223322", "+77775556633", "+79995553366"));
        phoneBook.put("Московская", List.of("+79991112233", "+79523336633"));
    
    }
    
    public static void findInDataOfBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}
