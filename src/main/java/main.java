import java.util.Scanner;

public class main {
    public static void main(String[] args) {

    }

    public static int[] generarArreglo() {
        int [] Arreglito = new int[10];
        for (int i = 0; i < Arreglito.length; i++) {
            int nroAleatorio = (int) (Math.random() * 1000) +1;
            Arreglito[i] = nroAleatorio;
            System.out.println ("[" + Arreglito[i] + "]");
        }
        return Arreglito;
    }

    public static void mostrarMenu (){
        System.out.println ("------------------------------------------");
        System.out.println ("1. Mostrar pares adyacentes");
        System.out.println ("2. Mostrar el mayor valor de producto");
        System.out.println ("3.  Salir (S/N)");
        System.out.println ("------------------------------------------");
        switchesMenuAnalisis();
    }
    public static void switchesMenuAnalisis(){
        int [] Arreglo = generarArreglo();
        boolean salir = true;
        do {
            switch (validarMenu (3)){
                case 1:
                    mostrarParesAdyacentes(Arreglo);
                    break;
                case 2:
                    Mostrar(mostrarMayorProducto(Arreglo));
                    break;
                case 3:
                    System.out.println ("Programa finalizado");
                    salir = false;
                    break;
            }
        }while (salir);

    }
    public static void Mostrar(int a){
        System.out.println(a);

    }

    public static int mostrarMayorProducto(int[] arreglo) {
        int productomayor = 0;
        for(int i = 1; i<arreglo.length;i++){
            int producto = arreglo[i-1]*arreglo[i];
            if (producto>productomayor){
                productomayor=producto;
            }
        }
        return productomayor;
    }


    public static void mostrarParesAdyacentes(int [] Arr) {
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

