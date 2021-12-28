package generadornumerosaleatorios;
import java.util.Random;
/**
 * Generador de numeros aleatorios y validacion de 2 y 5
 *
 * @author Kevin Andres Condo Chaguay
 * @version POO - 2021
 * @since Desde 27-12-2021, 16:45 horas
 */
public class GeneradorNumerosAleatorios {

    public static void main(String[] args) {
        // Instanciar clase Random
        Random random = new Random(); //generar un numero aleatorio

        //+ 1, porque puede iniciar con 0
        int numeroRandom = random.nextInt(100) + 1;  // convertir a entero 
        System.out.println("Número aleatorio: " + numeroRandom); //impresión del número aleatorio

        if (numeroRandom % 2 == 0 && numeroRandom % 5 == 0) { //validacion para 2 y 5
            System.out.println("El número es divisible para 2 y 5");//mensaje al usuario
        } else {
            if (numeroRandom % 2 == 0) { //validacion para divisibles para 2
                System.out.println("El número es divisible para 2");//mensaje al usuario
            }
            if (numeroRandom % 5 == 0) { //validacion para divisibles para 5
                System.out.println("El número es divisible para 5");//mensaje al usuario
            }
            if (numeroRandom % 2 != 0 && numeroRandom % 5 != 0) { //validacion para no divisibles para 2 y 5
                System.out.println("El número No es divisible para 2 y 5");//mensaje al usuario
            }
        }

    }

}
