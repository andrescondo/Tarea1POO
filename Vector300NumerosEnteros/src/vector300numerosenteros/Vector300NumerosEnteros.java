package vector300numerosenteros;
import java.util.Random;
/**
 *  Guardar un vector de 300 números enteros aleatorios, e imprimir de forma descendente
 *
 * @author Kevin Andres Condo Chaguay
 * @version POO - 2021
 * @since Desde 27-12-2021, 16:45 horas
 */
public class Vector300NumerosEnteros {
    public static void main(String[] args) {
        int vector[], valorVector = 300; //incialización de variables
        
        vector = new int[valorVector]; //creacion del arreglo
        // Instanciar clase Random
        Random random = new Random(); //generar un número aleatorio
        
        for(int contador = 0; contador < valorVector ; contador++){
            //+ 1, porque puede iniciar con 0
            int numeroRandom = random.nextInt(100) + 1;  // convertir a entero 
            vector[contador] = numeroRandom;//asignación del valor random a la posición del vector
        }

        for(int contador = (valorVector - 1); contador >=0; contador--){
            System.out.println(vector[contador]); //impresión de valores del vector de forma descendente
        }
    }
}
