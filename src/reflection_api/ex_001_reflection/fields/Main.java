package reflection_api.ex_001_reflection.fields;

import java.lang.reflect.Field;

public class Main {

    private static final class CatFields {

        public String name = "Marsel";
        private int age = 7;
        short ears = 5;
        protected long tail = 30;

    }

    public static void main(String[] args) {

        // Устанавливаем форматирование для вывода в консоль
        String s = (char) 27 + "[31m";
        String s2 = (char) 27 + "[39m";
        String s3 = (char) 27 + "[34m";

        // Получаем класс который описывает класс CatMethods
        Class<?> cl = CatFields.class;
        System.out.println(s + "Public Reflection fields:");

        // Метод getFields(), возвращает только поля с модификатором public
        Field[] fields = cl.getFields();

        // Пробегаемся по классу Field и выводим все public поля
        for (Field field : fields) {
            Class<?> fieldType = field.getType();
            System.out.println(s3 + "\tName: " + s2 + field.getName());
            System.out.println(s3 + "\tType: " + s2 + fieldType.getName());
        }

        System.out.println(s + "All Modifiers Reflection fields:");
        fields = cl.getDeclaredFields();

        for (Field field : fields) {
            Class<?> fieldType = field.getType();
            System.out.println(s3 + "\tName: " + s2 + field.getName());
            System.out.println(s3 + "\tType: " + s2 + fieldType.getName());
        }
    }

}

