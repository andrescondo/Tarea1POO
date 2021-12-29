package metodorecibeenterodevuelvevectorporteclado;

import java.util.Random;
import java.util.Scanner;

/**
 * Método que recibe un número entero y devuelve un vector del tamaño del número, el número es ingresado por teclado
 *
 * @author Kevin Andres Condo Chaguay
 * @version POO - 2021
 * @since Desde 27-12-2021, 16:45 horas
 */
class DevolverVector {//declaración de clase

    //recibe un parametro, como numero entero
    void numeroAleatorio(int numero) {//declaración de éetodo
        int vector[];//declaración de variables
        // Instanciar clase Random
        Random random = new Random(); //generar un número aleatorio

        vector = new int[numero];

        System.out.println("Número ingresado: " + numero + "\nNúmeros aleatorios del vector");
        for (int contador = 0; contador < numero; contador++) {
            //+ 1, porque puede iniciar con 0
            int numeroRandom = random.nextInt(100) + 1;  // convertir a entero 
            vector[contador] = numeroRandom;//asignación del valor random a la posición del vector
        }

        for (int contador = 0; contador < numero; contador++) {
            System.out.println(vector[contador]);//Impresión de valores del vector
        }
        System.out.println("Fin de los números aleatorios");//mensaje

    }
}

public class MetodoRecibeEnteroDevuelveVectorPorTeclado {

    public static void main(String[] args) {
        int numero = 0;//declaración de  e inicialización
        boolean validador = true; //declación de validador  e inicialización en true

        System.out.println("Ingrese un número entero"); //mensaje para el usuario
        while (validador) {//inicio de ciclo while con variable en true
            try { //inicio del bloque try
                Scanner sc = new Scanner(System.in);//variable para ingreso por teclado
                numero = sc.nextInt();//adición del valor ingresado por teclado, con el método para números enteros
                //cambio a false del validador, cierra el ciclo
                if(numero > 0){
                    validador = false;
                } else {
                    validador = true;
                }
            } catch (Exception e) {//inicio del bloque catch y adición de excepcion
                validador = true; //cambio de true del validador, hace que el ciclo se repita
            }
        }

        // Instanciar clase DevolverVector 
        DevolverVector devolverVector = new DevolverVector();

        //enviando atributos al metodo de la clase 'devolvervector' 
        devolverVector.numeroAleatorio(numero);
    }
}
