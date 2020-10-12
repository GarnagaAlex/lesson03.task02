package com.garnagaaa.lesson03.task02.app1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksei Garnaga
 * Класс хранилище Objects
 */
public class ObjectBox {

    private List<Object> base = new ArrayList<>();

    /**
     * Метод добавляющий объект в коллекцию
     *
     * @param o Объект
     */
    public void addObject(Object o) {
        base.add(o);
    }

    /**
     * Метод проверяющий наличие объекта в коллекции и при наличии удаляющий его.
     *
     * @param o Объект
     */
    public void deleteObject(Object o) {
        base.remove(o);
    }

    /**
     * Метод выводящий содержимое коллекции в строку
     *
     * @return Строка содержащая объекты коллекции
     */
    public String dump() {
        return base.toString();
    }

    @Override
    public String toString() {
        return "ObjectBox{" +
                "base=" + base +
                '}';
    }
}
