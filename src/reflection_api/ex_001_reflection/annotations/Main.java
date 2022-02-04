package reflection_api.ex_001_reflection.annotations;

import java.lang.annotation.Annotation;

public class Main {

    public static void main(String[] args) {

        // Устанавливаем форматирование для вывода в консоль
        String s = (char) 27 + "[31m";
        String s2 = (char) 27 + "[39m";
        String s3 = (char) 27 + "[34m";

        // Получаем класс который описывает класс Person
        Class<?> personClass = Person.class;

        // Метод getAnnotations(), который содержит массив всех аннотациий исследуемого класса
        Annotation[] annotations = personClass.getAnnotations();

        // Пробегаемся по массиву циклом и выводим данные о каждой аннотации
        for (Annotation annotation : annotations) {
            System.out.println(s3 + "\tInfo about annotation: " + s2 + annotation.toString());
            System.out.println(s3 + "\tInfo about package: " + s2 + annotation.getClass());
        }

        // Проверяем имеется ли там необходимая аннотация
        for (Annotation annotation : annotations) {
            if (annotation instanceof Author) {
                System.out.println(s3 + "\tAnnotation: Author is present");
            }
        }
    }
}
