package reflection_api.ex_001_reflection.modifier;

import java.lang.reflect.Modifier;

public class Main {

    private static final class CatModifier {
    }

    public static void main(String[] args) {

        // Устанавливаем форматирование для вывода в консоль
        String s = (char) 27 + "[31m";
        String s2 = (char) 27 + "[39m";
        String s3 = (char) 27 + "[34m";

        // Получаем класс который описывает класс CatModifier
        Class cl = CatModifier.class;

        // Узнаем имя класса
        System.out.println(s + "Class name: " + s2 + cl.getName());
        System.out.print(s + "Modifiers of class: " + s2);

        // getModifiers(), возвращает целочисленное значение
        int mods = cl.getModifiers();
        if (Modifier.isPrivate(mods)) {
            System.out.print("private ");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.print("abstract ");
        }
        if (Modifier.isStatic(mods)) {
            System.out.print("static ");
        }
        if (Modifier.isFinal(mods)) {
            System.out.print("final ");
        }
    }

}
