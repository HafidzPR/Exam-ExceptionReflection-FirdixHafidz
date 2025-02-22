package pijat.refleksi;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUtil {public static void inspectClass(Class<?> clazz) {
    System.out.println("Class Name: " + clazz.getSimpleName());

    //getter field
    Field[] fields = clazz.getDeclaredFields();
    System.out.print("Fields: [");
    for (Field field : fields) {
        System.out.print(field.getName() + ", ");
    }
    System.out.println("\b\b]"); // Closing bracket for fields

    // Getter method
    Method[] methods = clazz.getDeclaredMethods();
    System.out.print("Methods: [");
    for (Method method : methods) {
        System.out.print(method.getName() + ", ");
    }
    System.out.println("\b\b]"); // Closing bracket for methods

    // Getter constructors
    Constructor<?>[] constructors = clazz.getDeclaredConstructors();
    System.out.print("Constructors: [");
    for (Constructor<?> constructor : constructors) {
        System.out.print(constructor.getName() + "(), ");
    }
    System.out.println("\b\b]");
}
}

