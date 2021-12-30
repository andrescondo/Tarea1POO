package ingresodevalorescondecimales;

import java.util.Scanner;

/**
 * una función que permita ingresar un valor real con dos decimales, y debe
 * devolver su equivalencia en texto
 *
 * https://www.lawebdelprogramador.com/foros/Java/1653056-VALIDAR-NUMEROS-DECIMALES.html
 *
 * @author Kevin Andres Condo Chaguay
 * @version POO - 2021
 * @since Desde 27-12-2021, 16:45 horas
 */
public class IngresoDeValoresConDecimales {

    public static void main(String[] args) {
        String numero = "";
        boolean hayPunto = false;
        int numeroDigitos = 0, posicionDelPunto = 0, numeroDeDecimales = 0;
        double numeroFinal = 0;
        System.out.println("Ingrese una nota con dos decimales");
        Scanner sc = new Scanner(System.in);
        numero = sc.next();

        try {
            //validación de datos ingresados, en caso de error se cierra el programa
            Double.parseDouble(numero);
            numeroDigitos = numero.length();//tamaño del string

            for (int i = 0; i < numero.length(); i++) {
                if (numero.charAt(i) == '.') {  //Detectar si hay un punto decimal en la cadena
                    hayPunto = true;
                }
            }
            if (hayPunto) {   //Si hay punto guardar la posición del mismo
                posicionDelPunto = numero.indexOf('.');

                //medir la cantidad de decimales
                numeroDeDecimales = numeroDigitos - (posicionDelPunto += 1);

                //validación de números decimales (sean solo 2) y que no tengan un punto al principio
                if (posicionDelPunto == 0 || numeroDeDecimales > 2 || numeroDeDecimales < 2) {
                    System.out.println("Ha ingresado un caracter invalido");
                } else {
                    numeroFinal = Double.parseDouble(numero);
                            
                    System.out.println(numeroFinal);

//                    if(){
//                        
//                    }
                }

                //manejo de errores
            } else {
                System.out.println("El número no contiene decimales");
            }

        } catch (Exception e) { //manejo de errores
            System.out.println("Ha ingresado datos invalidos");
        }

    }
}
