import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    @DisplayName("Camino 1 - Vector de un elemento -> No entra al primer for")
    void testVectorDeUnElemento() {

        // Arrange
        BubbleSort bubbleSort = new BubbleSort();
        int[] vet = {1};
        int[] expected = {1};

        // Act
        bubbleSort.bubbleSort(vet);

        // Assert
        assertArrayEquals(expected, vet, "Un vector de un solo elemento no debe cambiar");
    }
    
    //El caso 2 es imposible por lo que se omite su caso de prueba
    
    @Test
    @DisplayName("Camino 3 - Vector ordenado -> No entra al if de intercambio")
    void testVectorYaOrdenado() {

        // Arrange
        BubbleSort bubbleSort = new BubbleSort();
        int[] vet = {1, 2};
        int[] expected = {1, 2};

        // Act
        bubbleSort.bubbleSort(vet);

        // Assert
        assertArrayEquals(expected, vet, "Un vector ya ordenado no debe cambiar");
    }

    @Test
    @DisplayName("Camino 4 - Vector desordenado -> Entra al if y realiza el intercambio")
    void testVectorDesordenado() {

        // Arrange
        BubbleSort bubbleSort = new BubbleSort();
        int[] vet = {2, 1};
        int[] expected = {1, 2};

        // Act
        bubbleSort.bubbleSort(vet);

        // Assert
        assertArrayEquals(expected, vet, "El vector desordenado debe quedar ordenado de forma ascendente");
    }
}