package es.ieslosmontecillos.test;
import java.lang.reflect.*;

public class Informacion {
    public static void main(String[] args) {
        try {
            // Pide al usuario el nombre de la clase
            System.out.println("Introduce el nombre completo de la clase:");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            String className = scanner.nextLine();

            // Carga la clase con forName
            Class<?> cls = Class.forName(Informacion.class.getPackageName() + "." + className);

            //  nombre de la clase
            System.out.println("Nombre de la clase: " + cls.getName());

            //  constructores
            System.out.println("Constructores:");
            Constructor<?>[] constructors = cls.getConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println("  " + constructor);
            }

            // Campos
            System.out.println("Campos:");
            Field[] fields = cls.getFields();
            for (Field field : fields) {
                System.out.println("  " + field + " (Modificadores: " + Modifier.toString(field.getModifiers()) + ")");
            }

            // Metodos
            System.out.println("Metodos:");
            Method[] methods = cls.getMethods();
            for (Method method : methods) {
                System.out.println("  " + method + " (Modificadores: " + Modifier.toString(method.getModifiers()) + ")");
            }

            // Muestra los modificadores de la clase
            System.out.println("Modificadores de la clase: " + Modifier.toString(cls.getModifiers()));

        } catch (ClassNotFoundException e) {
            System.out.println("La clase no fue encontrada. Asegúrate de escribir el nombre completo.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
