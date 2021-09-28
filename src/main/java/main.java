import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    mostrarMenu ();
    }

    public static void generarArreglo(int[] Arreglito ) {
        Arreglito = new int[10];
        int nroAleatorio = (int) Math.random () * 1000 + 1;
        for (int i = 0; i < Arreglito.length; i++) {
            Arreglito[i] = nroAleatorio;
            System.out.println ("[" + Arreglito[i] + "]");
        }
    }

    public static void mostrarMenu (){
        System.out.println ("------------------------------------------");
        System.out.println ("1. Mostrar pares adyacentes");
        System.out.println ("2. Mostrar el mayor valor de producto");
        System.out.println ("3.  Salir (S/N)");
        System.out.println ("------------------------------------------");
    }
    public static void switchesMenuAnalisis(){
        switch (validarMenu (3)){
            case 1:
                mostrarParesAdyacentes();
                break;
            case 2:
                break;
            case 3:
                System.out.println ("Programa finalizado");
                break;
        }
    }

    private static void mostrarParesAdyacentes(int [] Arr) {
        System.out.println ("Pares adyacentes :");
        for(int i = 1; i<Arr.length;i++){
            System.out.println ("["+Arr[i-1]+","+Arr[i]+"]");
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
