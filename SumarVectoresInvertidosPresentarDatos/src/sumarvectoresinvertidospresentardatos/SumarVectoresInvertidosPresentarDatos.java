package sumarvectoresinvertidospresentardatos;

import java.util.Random;

/**
 * Método que recibe un número entero y devuelve un vector del tamaño del
 * número, el número es ingresado por teclado
 *
 * @author Kevin Andres Condo Chaguay
 * @version POO - 2021
 * @since Desde 27-12-2021, 16:45 horas
 */
class ManejarVectores {

    int sumaDeVectores[];

    //declaracion de tipo de elemento va a devolver (vectores de enteros)
    int[] SumarVectores(int vector1[], int vector2[], int longitud) {
        //contador 2 recibe la lontigud  del vector - 1
        int contador = 0, contador2 = longitud - 1; //declaracion de variables
        sumaDeVectores = new int[longitud];//asignación de longitud
 
        boolean validador = true;//declaracion de variables

        while (validador) {
             /**
              *contador1 va en incremento ose desde 1 a n cantidad
              * contador2 va en decremento desde n cantidad hasta 0 
              */
            sumaDeVectores[contador] = vector1[contador] + vector2[contador2]; // suma de vectores por posiciones
            contador++;
            contador2--;
            if (contador >= longitud) {
                validador = false;
            }
        }

        return sumaDeVectores; //retorno la suma de los vectores
    }

    //método para presentar datos por pantalla
    // recibe el vector con los datos correspondientes y la longitud
    void PresentarDatos(int sumaDeVector[], int longitud) {
        int contador = 0; // declaracion de variables
        boolean validador = true; //declaracion de variables

        while (validador) {
            int indicador = contador + 1;
            System.out.println("El valor " + indicador + " es: " + sumaDeVector[contador]);
            contador++;
            if (contador >= longitud) {
                validador = false;
            }
        }
    }
}

public class SumarVectoresInvertidosPresentarDatos {

    public static void main(String[] args) {
        int vector1[], vector2[], sumaVectores[], longitudVectores = 8, contador = 0;//declaración de variables
        boolean validador = true;
        Random random = new Random(); //generar un número aleatorio

        ManejarVectores manejarVectores = new ManejarVectores();//Instanciar Clase ManejarVectores

        vector1 = new int[longitudVectores];//asignación de longitud
        vector2 = new int[longitudVectores];//asignación de longitud
        sumaVectores = new int[longitudVectores];//asignación de longitud

        while (validador) {
            //+ 1, porque puede iniciar con 0
            int random1 = random.nextInt(100) + 1;  // convertir a entero 
            vector1[contador] = random1;//asignación del valor random a la posición del vector
            int random2 = random.nextInt(100) + 1;  // convertir a entero 
            vector2[contador] = random2;//asignación del valor random a la posición del vector

            contador++;
            if (contador >= longitudVectores) {
                validador = false;
            }
        }

        /**
         * Se llamo el metodo sumarVectores y se le envió como parametros los
         * dos vectores y la longitud de ambos
         *
         * @params se envio dos vectores con datos y la longitud de ambos
         * @return la suma de los dos vectores
         */
        sumaVectores = manejarVectores.SumarVectores(vector1, vector2, longitudVectores);

        System.out.println("Presentar valores del vector");
        /**
         * Método para presentar datos
         *
         * @params se envia vector con la suma de los vectores, envío de la
         * longitud del vector
         */
        manejarVectores.PresentarDatos(sumaVectores, longitudVectores);

    }

}
