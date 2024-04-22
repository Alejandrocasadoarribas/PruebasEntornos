package Ejemplos.Ejemplo02;

public class ComprobarDia {
        public static int recargo (int dia){
            if (dia>=1 && dia<=10){
                return 0;
            }else if (dia>10 && dia<=20){
                return 2;
            }else {
                return 4;
            }
        }

}
