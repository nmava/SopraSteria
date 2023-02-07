package Test2;

public class Persona {
    private String sexo;
    private int edad;

    public Persona(String sexo, int edad) {
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public String toString() {
        return String.format("------------\n%5s %5s\n", getSexo(), getEdad());
    }
}
