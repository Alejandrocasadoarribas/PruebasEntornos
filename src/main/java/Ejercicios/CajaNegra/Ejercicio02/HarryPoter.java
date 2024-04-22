package Ejercicios.CajaNegra.Ejercicio02;

public class HarryPoter {
    public static String casa(String casa){
        if (casa.equalsIgnoreCase("gryffindor")){
            return "valentia";
        }else if (casa.equalsIgnoreCase("hufflepuff")){
            return "lealtad";
        }else if (casa.equalsIgnoreCase("slytherin")){
            return "astucia";
        }else if (casa.equalsIgnoreCase("ravenclaw")){
            return "intelecto";
        }else {
            return "No es una casa valida";
        }
    }
}
