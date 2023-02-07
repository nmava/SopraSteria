package Test3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SalarioTrabajador {

    public SalarioTrabajador() {
    }

    public double leerHorasTrabajadas(Scanner reader){
        double horasTrabajadas = -1.0;

        System.out.println("Introduce horas trabajadas(Formato HH:mm): ");
        if (!reader.hasNext(Pattern.compile("..:.."))) System.out.println("La entrada no está en el formato indicado");
        else {
            String horaMinutos = reader.next();
            String[] auxArray = horaMinutos.split(":");

             horasTrabajadas = Double.parseDouble(auxArray[0]) + (Double.parseDouble(auxArray[1]) / 60);
        }

        return horasTrabajadas;
    }

    public int leerTarifa(Scanner reader){
        int tarifa = -1;

        System.out.println("Introduce la tarifa como numero entero: ");

        if (!reader.hasNextInt()) System.out.println("La entrada no está en el formato indicado");
        else {
            tarifa = reader.nextInt();
        }
        reader.close();

        return tarifa;
    }

    public double calcularSalario(double horasTrabajadas, int tarifa){
        return horasTrabajadas > 40 ? (40 * tarifa) + (horasTrabajadas - 40) * (tarifa * 1.5) : horasTrabajadas * tarifa;
    }
}
