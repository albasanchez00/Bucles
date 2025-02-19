import java.util.Scanner;

/* Ejemplo 1. Vamos a solicitar al usuario un número, u mostrara todos los números del 1 hasta
   el número ingresado
*/

public class EjmploFor_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Indique un número → ");
        num = sc.nextInt();
        for (int i=1;i<=num;i++) {
            System.out.printf("%d-",i);
        }


        /* Ejemplo 2. Escribe un programa que muestre todos los multiplos de 7, menores que 100 */
        int maximo=100;
        System.out.println("\n");
        for (int a=0;a<=maximo;a+=7) {
            System.out.printf("%d-",a);
        }



    }
}
