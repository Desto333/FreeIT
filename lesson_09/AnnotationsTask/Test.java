package lesson_09.AnnotationsTask;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        checkClass(MyService.class);
        checkClass(String.class);
    }

    public static <T> void checkClass(Class<T> className) throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        if (className.isAnnotationPresent(Version.class)) {        // check if class is annotated by Version annotation
            MyService myService = new MyService();                 // if is annotated we create a new object of MyService class...

            Field date = myService.getClass().getDeclaredField("date");        // ...we get access to and make changes to private fields of the class...
            date.setAccessible(true);
            date.set(myService, "2019");

            Field auth_name = myService.getClass().getDeclaredField("author_name");
            auth_name.setAccessible(true);
            auth_name.set(myService, "John Deer");

            Field size = myService.getClass().getDeclaredField("size");
            size.setAccessible(true);
            size.setInt(myService, 500);

            Method thClssInf = MyService.class.getDeclaredMethod("thisClassInfo", null);        // ... and we call a private method of the class
            thClssInf.setAccessible(true);
            thClssInf.invoke(myService, null);

            System.out.println(myService.toString());          // print out the object of the class we created to make sure that we really got access to private fields of the class
        } else System.out.println("\n" + "Аннотации не обнаружено");
    }


}
