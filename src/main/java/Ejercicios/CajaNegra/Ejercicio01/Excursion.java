package Ejercicios.CajaNegra.Ejercicio01;

public class Excursion {

    private int numeroAlumnos;

    public Excursion(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    public int getNumeroAlumnos() {
        return numeroAlumnos;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    public double calcularPrecioAlumno(){
        if (numeroAlumnos>=100){
            return 65;
        } else if (numeroAlumnos>=50) {
            return 70;
        } else if (numeroAlumnos>=30) {
            return 95;
        }else {
            return 4000 /numeroAlumnos;
        }
    }

    public double calcularCosteExcursion(){
        if (numeroAlumnos>=100){
            return numeroAlumnos*65;
        } else if (numeroAlumnos>=50) {
            return numeroAlumnos*70;
        } else if (numeroAlumnos>=30) {
            return numeroAlumnos*95;
        }else {
            return 4000;
        }
    }
}
