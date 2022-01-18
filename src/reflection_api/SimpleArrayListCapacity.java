package reflection_api;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class SimpleArrayListCapacity {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println(getCapacity(arrayList));
        for (int i = 0; i < 23; i++) {
            arrayList.add(i);
        }
        System.out.println(getCapacity(arrayList));
//        System.out.println(getCapacity(arrayList));
//        arrayList.add(1);
//        arrayList.remove(0);
//        System.out.println(getCapacity(arrayList));

    }

    public static int getCapacity(ArrayList<?> arr) throws NoSuchFieldException, IllegalAccessException {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[])dataField.get(arr)).length;
    }
}
