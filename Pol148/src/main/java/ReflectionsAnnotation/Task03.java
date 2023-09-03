package ReflectionsAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Task03 {
    public static void main(String[] args) {
        Class<Phone> cl = Phone.class;
        Constructor<?> constructor = cl.getConstructors()[0];

        try {
            Phone phone = (Phone) constructor.newInstance("Samsung", "Galaxy S5", 2022);
            List<Method> methods = findMethodsWithAnnotation(phone.getClass(), "SuperMethod");
            if (!methods.isEmpty())
                System.out.println("Support's going to last until the year " + methods.get(0).invoke(phone, 4));

        } catch (InstantiationException e) {
            System.out.println("AaaaaAaAAAA!");
        } catch (IllegalAccessException e) {
            System.out.println("Ratunku!");
        } catch (InvocationTargetException e) {
            System.out.println("Au secours!");
        }
    }

    private static List<Method> findMethodsWithAnnotation(Class<? extends Phone> cl, String annotationName) {
        List<Method> methods = new ArrayList<>();

        for (Method method : cl.getDeclaredMethods()) {

            for (Annotation anno : method.getAnnotations()) {
                String annoName = anno.annotationType().getName();
                if (annoName.contains(annotationName))
                    methods.add(method);
            }

        }
        return methods;
    }

}
