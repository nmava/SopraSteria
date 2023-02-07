package Test2;

import java.util.Random;

public class ClasificacionPersonas {
    public Persona[] leerPersonas (){
        Persona[] personas = new Persona[50];
        int edad;
        String sexo;

        Random numAleatorio = new Random();

        for (int i = 0 ; i < personas.length ; i++ ){
            edad = numAleatorio.nextInt(70 - 1) + 1;
            sexo = numAleatorio.nextBoolean() ? "F" : "M";
            personas[i] = new Persona(sexo, edad);
        }
        return personas;
    }

    public void clasificacion(Persona[] personas){
        int mayorEdad = 0;
        int menorEdad = 0;
        int mascMayorE = 0;
        int femMenorE = 0;
        int porcentajeMayE;
        int porcentajeFem;
        int fem = 0;

        int edad;
        String sexo;

        for (Persona persona: personas){
            edad = persona.getEdad();
            sexo = persona.getSexo();

            if (sexo.equals("F"))
                fem++;

            if (edad < 18) {
                menorEdad++;
                femMenorE += sexo.equals("F") ? 1 : 0;
            }
            else{
                mayorEdad++;
                mascMayorE += sexo.equals("M") ? 1 : 0;
            }
        }
        porcentajeMayE = (mayorEdad * 100) / personas.length;
        porcentajeFem = (fem * 100) / personas.length;

        System.out.println("Cantidad de personas mayores de edad (18 años o más): " + mayorEdad);
        System.out.println("Cantidad de personas menores de edad: " + menorEdad);
        System.out.println("Cantidad de personas masculinas mayores de edad.: " + mascMayorE);
        System.out.println("Cantidad de personas femeninas menores de edad: " + femMenorE);
        System.out.println("Porcentaje que representan las personas mayores de edad respecto al total de personas: " + porcentajeMayE + "%");
        System.out.println("Porcentaje que representan las mujeres respecto al total de personas.: " + porcentajeFem + "%");
    }
}
