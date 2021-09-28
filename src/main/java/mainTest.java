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
        int[] arr = {1, 0, 1, 0, 1000};
        assertEquals(main.mostrarMayorProducto(arr),0);

    }
}