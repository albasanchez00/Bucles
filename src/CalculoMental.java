import javax.swing.*;
import java.util.Scanner;

/* Desarrolla un juego que ayude a mejorar el cálculo mental de la suma.
    * El jugador tendrá que introducir la solución de la suma de dos números aleatorios, comprendidos entre 1 y 100.
    * Mientras la respuesta sea correcta el juego continuara e irá contando el número de respuestas correctas que lleva el jugador.
    * Al escribir una erronea, se saldrá del juego y mostrara el numero de aciertos que ha tenido.

* PISTAS....
        * Número aleatorios num1=(int)(Math.random()*101)
        * Si la suma num1+num2==respuestaUsuarios
           Incrementamos el contador++;
        * El bucle do{} se repetirá mientras num1+num2==respuestaUsuarios
*/


public class CalculoMental {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int respuesta;
       int num1,num2;
       int respuestaCorrecta;
       int contador=0;
       String mensaje="";

        do {
            respuesta=0;
            num1=(int)(Math.random()*101);
            num2=(int)(Math.random()*101);
            respuestaCorrecta=num1+num2;
            String respuestaT= JOptionPane.showInputDialog("Indique la suma de "+num1+" + "+num2+" = ");
            try {
                respuesta=Integer.parseInt(respuestaT);
            }catch(NumberFormatException e) {
                mensaje="El valor introducido no es valido";
            }
            contador++;
        }while (respuesta==respuestaCorrecta);
        JOptionPane.showMessageDialog(null, "El numero de aciertos son: " + contador);
    }
}
