package Laptenkov;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс тестирования публичных методов класса {@link Person}
 *
 */
class PersonTest {

    List<Person> arrayList;

    /**
     * Инициализация объектов типа {@link Person}
     * перед тестированием.
     */
    @BeforeEach
    void setUp() {
        arrayList = new ArrayList<>();

        arrayList.add(new Person("Z_user", "A_CiTY", 23));
        arrayList.add(new Person("D_USER", "z_city", 29));
        arrayList.add(new Person("a_user", "Z_city", 22));
        arrayList.add(new Person("a_user", "A_CITY", 39));
        arrayList.add(new Person("C_uSER", "C_cITy", 38));
        arrayList.add(new Person("C_uSER", "C_cITy", 38));
    }

    /**
     * Очистка объектов {@link Person} после проведения теста
     */
    @AfterEach
    void tearDown() {
        arrayList = null;
    }

    /**
     * Проверка метода {@link Person#equals(Object)}.
     * Сценарий проверяет сравнение идентичных объектов.
     */
    @Test
    void equalsSuccess_Test() {
        Assert.assertEquals(new Person("Z_user", "A_CiTY", 23), arrayList.get(0));
        Assert.assertEquals(new Person("C_uSER", "C_cITy", 38), arrayList.get(5));
        Assert.assertEquals(arrayList.get(4), arrayList.get(5));
        Assert.assertNotEquals(new Person("New_user", "New_city", 20), arrayList.get(5));
        Assert.assertNotEquals(arrayList.get(1), arrayList.get(5));
    }

    /**
     * Проверка метода {@link Person#hashCode()}.
     * Сценарий проверяет отображение объекта в hashCode.
     */
    @Test
    void hashCodeSuccess_Test() {
        Assert.assertEquals(
                new Person("Z_user", "A_CiTY", 23).hashCode(), arrayList.get(0).hashCode());
        Assert.assertEquals(
                new Person("C_uSER", "C_cITy", 38).hashCode(), arrayList.get(5).hashCode());
        Assert.assertEquals(
                arrayList.get(4).hashCode(), arrayList.get(5).hashCode());
        Assert.assertNotEquals(
                new Person("New_user", "New_city", 20).hashCode(), arrayList.get(5).hashCode());
        Assert.assertNotEquals(
                arrayList.get(1).hashCode(), arrayList.get(5).hashCode());
    }

    /**
     * Проверка метода {@link Person#toString()}.
     * Сценарий проверяет отображение объекта в строковом виде.
     */
    @Test
    void testToString() {
        Assert.assertEquals("Person{name=Stas, city=Novosibirsk, age=47}",
                new Person("Stas", "Novosibirsk", 47).toString());
    }

}