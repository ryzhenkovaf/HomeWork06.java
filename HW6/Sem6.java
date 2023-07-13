// Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
// Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество.

// Создайте метод
// public boolean equals(Object o)

// Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, 
// только если значения во всех полях сравниваемых объектов равны.

// Создайте метод
// public int hashCode()

// который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
// Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.

package HW6;

import java.util.*;

public class Sem6 {
    public static void main(String[] args) {
        Cat();
    }

    public static void Cat() {
        Cat cat1 = new Cat("Котэ", new holder("Василий Котоводов"));
        cat1.setCatMale('M');
        cat1.setMonth(6);
        cat1.setYearBirth(2020);

        Cat cat2 = new Cat("Котэ", new holder("Василий Котоводов"));
        cat2.setCatMale('M');
        cat2.setMonth(6);
        cat2.setYearBirth(2020);

        Cat cat3 = new Cat("Баунти", new holder("Ольга Кошколюбова"));
        cat3.setCatMale('F');
        cat3.setMonth(1);
        cat3.setYearBirth(2020);

        Cat cat4 = new Cat("Фрося", new holder("Антон Старокотов"));
        cat4.setCatMale('M');
        cat4.setMonth(12);
        cat4.setYearBirth(2009);

        Set<Cat> catSet = new HashSet<>();

        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);
        catSet.add(cat4);

        for (Cat i : catSet) {
            System.out.println(i);
        }

    System.out.println(catSet);
    }
}

