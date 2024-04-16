package EjemplosSueltos;

import java.util.Arrays;
import java.util.Scanner;

public class SaliendoDeLaCrisis {
    public static void main(String[] args) {
        //Mientras no introduzcamos un 0 seguimos pidiendo numeros
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();teclado.nextLine();
        while(numero!=0){
            String cadena = teclado.nextLine();
            String[] numeros = cadena.split(" ");
            System.out.println(Arrays.toString(numeros));



            numero = teclado.nextInt();teclado.nextLine();
        }
    }
}
