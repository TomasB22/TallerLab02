import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {

    @Test
    public void generarArreglo() {

    }

    @Test
    public void validarMenu() {
    }

    @Test
    public void mostrarProductoMayor(){
        //Prueba 1
        int[] uno = {1};
        assertEquals(main.mostrarMayorProducto(uno),0);
        //Prueba 4
        int[] prueba = {3, 6, -2, -5, 7, 3};
        assertEquals(main.mostrarMayorProducto(prueba),21);
        //Prueba 5
        int[] arrnegativo = {-1,-2};
        assertEquals(main.mostrarMayorProducto(arrnegativo),2);
        //Prueba 6
        int[] arr = {1, 0, 1, 0, 1000};
        assertEquals(main.mostrarMayorProducto(arr),0);

    }
}