package ReflectionsAnnotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("Y5", "Huawei", 2022);

        getRuntimeInfo();
    }

    public static void getRuntimeInfo() {
        Class cl = Phone.class;

        System.out.println("Class name: " + cl.getName());
        System.out.println("Number of constructors: " + getNumberOfConstructors(cl));
        System.out.println("Number of methods: " + getNumberOfMethods(cl));

        System.out.println();
        listReturnTypes(cl);
        listMethodNames(cl);
        listFieldNames(cl);
        listFieldTypes(cl);
    }

    public static void listReturnTypes(Class<Phone> cl) {
        System.out.println("Return types:");
        for (Method method : cl.getMethods()) {
            if (!method.getReturnType().getName().equals("void"))
                System.out.println("Method " + method.getName() + " returns " + method.getReturnType() + ".");
        }
        System.out.println();
    }

    public static void listMethodNames(Class<Phone> cl) {
        System.out.println("All methods: ");
        for (Method method : cl.getMethods()) {
            System.out.println(method.getName() + "()");
        }
        System.out.println();
    }

    public static void listFieldNames(Class<Phone> cl) {
        System.out.println("All fields:");
        for (Field field : cl.getDeclaredFields()) {
            field.setAccessible(true);
            System.out.println(field.getName());
        }
        System.out.println();
    }

    public static void listFieldTypes(Class<Phone> cl) {
        System.out.println("All field types: ");
        for (Field field : cl.getDeclaredFields()) {
            field.setAccessible(true);
            System.out.println(field.getName() + " has a type of " + field.getType());
        }
        System.out.println();
    }

    public static int getNumberOfMethods(Class<Phone> cl) {
        return cl.getMethods().length;
    }

    public static int getNumberOfConstructors(Class<Phone> cl) {
        return cl.getConstructors().length;
    }


}
