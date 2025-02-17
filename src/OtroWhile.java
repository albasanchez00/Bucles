import javax.swing.*;
import java.util.Scanner;

/* Actividad. Diseña un programa que por cada número ingresado por el usuario,
* Indique si es → Par, positivo y su cuadrado
* Para salir del programa el usuario debe ingresar 0
*/

public class OtroWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mensaje="";
        String numT =JOptionPane.showInputDialog("Ingrese un numero");
        boolean par, positivo;
        double num = 0;
        try {
            num=Double.parseDouble(numT); //→ Pasamos el numero a double
        }catch (Exception e) {
            mensaje="Ingrese un numero valido";
        }

        while (num!=0){
            par=num%2==0;
            positivo=num>=0;
            double cuadrado=Math.pow(num,2);

            //Mostramos el resulado
            mensaje="¿Es par? "+par+" ¿Es positivo? "+positivo+" Su cuadrado es → "+cuadrado;
            JOptionPane.showMessageDialog(null, mensaje);
            numT=JOptionPane.showInputDialog("Ingrese un numero");
            try {
                num=Double.parseDouble(numT); //→ Pasamos el numero a double
            }catch (Exception e) {
                mensaje="Ingrese un numero valido";
            }
        }


    }
}
