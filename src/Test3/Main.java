package Test3;

import Test1.NumeroEntero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        SalarioTrabajador st = new SalarioTrabajador();
        double horasTrabajadas = st.leerHorasTrabajadas(reader);

        int tarifa = st.leerTarifa(reader);

        double salario = st.calcularSalario(horasTrabajadas, tarifa);
        System.out.println("El total del salario es: " + salario + "€");

    }
}
