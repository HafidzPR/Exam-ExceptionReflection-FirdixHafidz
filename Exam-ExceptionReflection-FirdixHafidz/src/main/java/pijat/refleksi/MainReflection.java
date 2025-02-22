package pijat.refleksi;

import invalidage.User;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainReflection {
    public static void main(String[] args) {
        // Reflection code here
        Class<?> userClass = User.class;

        // Get class name
        System.out.println("Class Name: " + userClass.getSimpleName());

        // Get fields
        Field[] fields = userClass.getDeclaredFields();
        System.out.print("Fields: [");
        for (Field field : fields) {
            System.out.print(field.getName() + ", ");
        }
        System.out.println("\b\b]"); // Closing bracket for fields

        // Get methods
        Method[] methods = userClass.getDeclaredMethods();
        System.out.print("Methods: [");
        for (Method method : methods) {
            System.out.print(method.getName() + ", ");
        }
        System.out.println("\b\b]"); // Closing bracket for methods

        // Get constructors
        Constructor<?>[] constructors = userClass.getDeclaredConstructors();
        System.out.print("Constructors: [");
        for (Constructor<?> constructor : constructors) {
            System.out.print(constructor.getName() + "(), ");
        }
        System.out.println("\b\b]"); // Closing bracket for constructors

        // Access private field
        try {
            User user = new User();
            Field nameField = userClass.getDeclaredField("name");
            nameField.setAccessible(true);
            System.out.println("Private Field Value (Before Modification): " + nameField.get(user));

            // Modify private field
            nameField.set(user, "Jane Doe");
            System.out.println("Private Field Value (After Modification): " + nameField.get(user));

            // Invoke method
            String methodName = "getName"; // Name of the method to call
            Method method = userClass.getDeclaredMethod(methodName);
            String nameValue = (String) method.invoke(user);
            System.out.println("Value from method " + methodName + ": " + nameValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}