package lesson_09.AnnotationsTask;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if(MyService.class.isAnnotationPresent(Version.class)) {        // check if MyService class is annotated by Version annotation
            MyService mS = new MyService();                 // if ia annotated we create a new object of the class...

            Field date = mS.getClass().getDeclaredField("date");        // ...we get access to and make changes to private fields of the class...
            date.setAccessible(true);
            date.set(mS, "2019");

            Field auth_name = mS.getClass().getDeclaredField("author_name");
            auth_name.setAccessible(true);
            auth_name.set(mS, "John Deer");

            Field size = mS.getClass().getDeclaredField("size");
            size.setAccessible(true);
            size.setInt(mS, 500);

            Method thClssInf = MyService.class.getDeclaredMethod("thisClassInfo", null);        // ... and we call a private method of the class
            thClssInf.setAccessible(true);
            thClssInf.invoke(mS, null);

            System.out.println(mS.toString());          // print out the object of the class we created to make sure that we really got access to private fields of the class
        } else System.out.println("Аннотации не обнаружено");


    }
}