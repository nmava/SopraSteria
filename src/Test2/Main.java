package Test2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClasificacionPersonas clasificacionPersonas = new ClasificacionPersonas();
        Persona[] personas = clasificacionPersonas.leerPersonas();

        Scanner reader = new Scanner(System.in);
        int n;
        System.out.println("¿Quiere ver la tabla generada? 1- Si 2-No");

        if (!reader.hasNextInt()) {
            System.out.println("¡La entrada no es un número entero!");
        } else {
            n = reader.nextInt();


        reader.close();

        if (n == 1)
            for (Persona persona: personas)
                System.out.println(persona.toString());

        clasificacionPersonas.clasificacion(personas);
        }
    }
}
