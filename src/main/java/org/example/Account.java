package org.example;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        if (this.name.length() >= 3 & this.name.length() <= 19) {
            if (!name.startsWith(" ") & !name.endsWith(" ")) {
                String[] partsOfName = name.split("\\s");
                boolean hasSingleSpace = partsOfName.length == 2;

                return hasSingleSpace;
            }
        }
        return false;
    }

}
