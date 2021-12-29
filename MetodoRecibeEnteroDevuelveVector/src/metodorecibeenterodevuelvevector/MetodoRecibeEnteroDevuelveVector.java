package metodorecibeenterodevuelvevector;
import java.util.Random;
/**
 * Método que recibe un número entero y devuelve un vector del tamaño del número entero
 *
 * @author Kevin Andres Condo Chaguay
 * @version POO - 2021
 * @since Desde 27-12-2021, 16:45 horas
 */
class DevolverVector{//declaración de clase
    
    //recibe un parametro, como numero entero
    void numeroAleatorio(int numero){//declaración de éetodo
        int vector[];//declaración de variables
        // Instanciar clase Random
        Random random = new Random(); //generar un número aleatorio
        
        vector = new int[numero];
        
        System.out.println("Número ingresado: "+ numero + "\nNúmeros aleatorios del vector");
        for(int contador = 0; contador < numero; contador++){
            //+ 1, porque puede iniciar con 0
            int numeroRandom = random.nextInt(100) + 1;  // convertir a entero 
            vector[contador] = numeroRandom;//asignación del valor random a la posición del vector
        }
        
        for(int contador = 0; contador < numero; contador++){
            System.out.println(vector[contador]);//Impresión de valores del vector
        }
        System.out.println("Fin de los números aleatorios");//mensaje
        
    }
}
        
public class MetodoRecibeEnteroDevuelveVector {
    public static void main(String[] args) {
        int numero = 10;//declaración de variable
        
        // Instanciar clase DevolverVector 
        DevolverVector devolverVector = new DevolverVector();
        
        //enviando atributos al metodo de la clase 'devolvervector' 
        devolverVector.numeroAleatorio(numero);
    }
}
