package sumarvectoresypresentardatos;
import java.util.Random;
/**
 * Método que recibe un número entero y devuelve un vector del tamaño del número, el número es ingresado por teclado
 *
 * @author Kevin Andres Condo Chaguay
 * @version POO - 2021
 * @since Desde 27-12-2021, 16:45 horas
 */
class ManejarVectores{
    int sumaDeVectores[];
    
    //declaracion de tipo de elemento va a devolver (vectores de enteros)
    int[] SumarVectores(int vector1[], int vector2[], int longitud){
        sumaDeVectores = new int[longitud];//asignación de longitud

        for(int contador = 0; contador < longitud; contador++){
            sumaDeVectores[contador] = vector1[contador] + vector2[contador]; // suma de vectores por posiciones
        }
        return sumaDeVectores; //retorno la suma de los vectores
    }
    
    //método para presentar datos por pantalla
    // recibe el vector con los datos correspondientes y la longitud
    void PresentarDatos(int sumaDeVector[], int longitud){
        for(int contador = 0; contador < longitud; contador++){
            int indicador = contador + 1;
            System.out.println("El valor " + indicador + " es: " + sumaDeVector[contador] );
        }
    }
}


public class SumarVectoresYPresentarDatos {
    public static void main(String[] args) {
        int vector1[], vector2[], sumaVectores[], longitudVectores = 8;//declaración de variables
        Random random = new Random(); //generar un número aleatorio
        
        ManejarVectores manejarVectores = new ManejarVectores();//Instanciar Clase ManejarVectores

        vector1 = new int[longitudVectores];//asignación de longitud
        vector2 = new int[longitudVectores];//asignación de longitud
        sumaVectores = new int[longitudVectores];//asignación de longitud

        for (int contador = 0; contador < longitudVectores; contador++) {
            //+ 1, porque puede iniciar con 0
            int random1 = random.nextInt(100) + 1;  // convertir a entero 
            vector1[contador] = random1;//asignación del valor random a la posición del vector
            int random2 = random.nextInt(100) + 1;  // convertir a entero 
            vector2[contador] = random2;//asignación del valor random a la posición del vector
        }
        
        /**
        *Se llamo el metodo sumarVectores  y se le envió como parametros los dos vectores y la longitud de ambos
        * @params se envio dos vectores con datos y la longitud de ambos
        * @return la suma de los dos vectores
        */
        sumaVectores = manejarVectores.SumarVectores(vector1, vector2, longitudVectores);
        
        System.out.println("Presentar valores del vector");
        /**
         * Método para presentar datos
         * @params se envia vector con la suma de los vectores, envío de la longitud del vector
         */
        manejarVectores.PresentarDatos(sumaVectores, longitudVectores);
        
    }
}
