import javax.swing.*;
import java.time.LocalDate;
import java.util.Scanner;

/* Crear un menú que se repita hasta que el usuario elija la opción salir.
* Tendrá 3 opciones:
    1. Hola que tal (saludo)
    2. Fecha Actual
    3. Salir
*/

public class Actividad_Propuesta_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String saludo="Hola, ¿que tal?";
        // El tipo fecha peude ser localDate o LocalDateTime
        LocalDate fecha=LocalDate.now();
        String opcion = "";
        int op=0;

        do {
            opcion=JOptionPane.showInputDialog("""
                    Indique una opcion: \
      
                    [1]→ Saludo\
                    
                    [2]→ Fecha\
                    
                    [3]→ Salir""");

            try {
                op=Integer.parseInt(opcion); //Convertimos el valor de String a Numérico
            }catch (Exception e) {
                System.out.println("Opcion invalida");
            }

            switch (op) {
                case 1:
                    System.out.println(saludo);
                case 2:
                    System.out.println(fecha);
            }
        }while (op!=3);
        System.out.println("Adios");;

    }
}
