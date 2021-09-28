import java.sql.Array;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

    }

    public static void generarArreglo(){
        int
        int Arreglito [] = new Array [];

    }
    public static void llenarArreglo(int Arreglito[]){

    }

    public static void mostrarMenu (){
        System.out.println ("------------------------------------------");
        System.out.println ("1. Mostrar pares adyacentes");
        System.out.println ("2. Mostrar el mayor valor de producto");
        System.out.println ("3.  Salir (S/N)");
        System.out.println ("------------------------------------------");
    }
    public static void switchesMenuAnalisis(){
        switch (validarMenu (4)){
            case 1:
                break;
            case 2:
                break;
            case 3:
                System.out.println ("Programa finalizado");
                break;
        }
    }
    public static int validarMenu ( int x) {
        int n = -1;
        do {
            //Scanner ponerlo dentro del DO, y dentro de una funcion
            Scanner teclado = new Scanner (System.in);
            //System.out.println("ingrese otro numero");
            try {
                n = teclado.nextInt ();
            } catch (Exception e) {
                System.out.println ("Error");
            }
            if (n < 0 || n > x) {
                System.out.println ("Ingrese un numero valido");
            }
        } while (n < 0 || n > x);
        return n;
    }



}
