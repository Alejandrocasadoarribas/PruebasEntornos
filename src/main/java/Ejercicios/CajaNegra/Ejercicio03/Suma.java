package Ejercicios.CajaNegra.Ejercicio03;

public class Suma {
    public static boolean suma (){
        int suma = 0;
        for (int i = 0; i <=10 ; i++) {
            suma += i;
        }
        if (suma==55){
            return true;
        }else {
            return false;
        }
    }
}
