package Test1;

import Test2.Persona;

import java.util.Scanner;

public class NumeroEntero {

    public int leerNumero(){
        int n = -1;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        if (!reader.hasNextInt()) {
            System.out.println("¡La entrada no es un número entero!");
        } else {
            n = reader.nextInt();
        }
        reader.close();

        return n;
    }

    public void listaNumeros(int numero){
        int parOImpar = numero % 2 == 0 ? 0 : 1;

        for (int i = numero; i >= parOImpar ; i -= 2){
            System.out.println(i);
        }
    }

}