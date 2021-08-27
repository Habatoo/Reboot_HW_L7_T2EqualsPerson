package Laptenkov;

import java.util.Objects;

/**
 * Класс {@link Person} реализует интерфейс Comparable<Person>,
 * определить метод toString
 * Реализовать equals & hashCode
 * Гарантируется, что значения name, city не null
 * Условие равенства: все поля name, city, age должны совпадать.
 * (name и city без учета регистра)
 */
public class Person {
    String name;
    String city;
    int age;

    /**
     * Конструктор объекта типа {@link Person}.
     * @param name строковое имя (не null).
     * @param city строковое название города (не null).
     * @param age возраст - целое число.
     */
    public Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    /**
     * Метод {@link Person#equals} проверяет идентичность объектов типа {@link Person}.
     * @param o объект для сравнения.
     * @return <code>true</code> если объекты идентичны по полям age, name, city.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equalsIgnoreCase(person.name) && city.equalsIgnoreCase(person.city);
    }

    /**
     * Метод {@link Person#hashCode} считает hashCode по полям объекта типа {@link Person}.
     * @return целое число посчитанное по значению полей age, name, city.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name.toLowerCase(), city.toLowerCase(), age);
    }

    /**
     * Метод {@link Person#toString} возвращает строкове представление объекта типа {@link Person}.
     * @return строка объекта.
     */
    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", city=" + city +
                ", age=" + age +
                '}';
    }
}
