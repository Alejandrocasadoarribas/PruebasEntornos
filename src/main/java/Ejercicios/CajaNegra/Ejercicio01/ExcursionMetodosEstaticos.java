package Ejercicios.CajaNegra.Ejercicio01;

public class ExcursionMetodosEstaticos {

    //El director de una escuela está organizando un viaje de estudios, y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente:
    //Si son 100 alumnos o más, el costo por cada alumno es de 65 euros;
    //de 50 a 99 alumnos, el costo es de 70 euros,
    //de 30 a 49, de 95 euros,
    //y si son menos de 30, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
    //Escribe un programa que, introduciendo el número de alumnos que van de viaje, permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno.
    public static double calcularPrecioAlumno(int numeroAlumnos){
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
    public static double calcularCosteExcursion(int numeroAlumnos){
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
