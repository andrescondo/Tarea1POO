package algoritmovariasinstrucciones;

/**
 * Considere el siguiente algoritmo que consiste de varias instrucciones a
 * ejecutarse.
 *
 * @author Kevin Andres Condo Chaguay
 * @version POO - 2021
 * @since Desde 27-12-2021, 16:45 horas
 */
public class AlgoritmoVariasInstrucciones {

    public static void main(String[] args) {
        //Declaracion de variables
        int i , j , k ;
        double suma , division;
        boolean estado;
        char letra;

        //asifnacion de datos
        i = 0;
        j = 0;
        k = 0;
        estado = false;
        letra = 'a';
        
        //desarrollo de procesos
        i = i + 1;
        j = 5 ^ 2;
        k = j % (i * 2);
        division = j / (i + k);
        suma = i + k + division;
        estado = ( i < k) && ( j > suma);
        letra = estado;
        
    }
    
}
