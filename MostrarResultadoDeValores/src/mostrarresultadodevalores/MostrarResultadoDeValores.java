package mostrarresultadodevalores;
import java.lang.Math;
/**
 * 
 * 
 * @author Kevin Andres Condo Chaguay
 * @version POO - 2021
 * @since Desde 27-12-2021, 16:45 horas
 */
public class MostrarResultadoDeValores {
    public static void main(String[] args) {
        //Impresión de resultados, y envio de parametros
        System.out.println("A) " + ProblemaA(1,2,3));
        System.out.println("B) " + ProblemaB(5, 8));
        System.out.println("C Positivo) " + ProblemaCPositivo(1,3,2));
        System.out.println("C Negativo) " + ProblemaCNegativo(1,3,2));
    }
    
    public static float ProblemaA(int valorX, int valorY,int valorW){ //recepccion de atributos e inicializacion de Clase
        return ((2*valorX) / (3*valorY)) - ((((5*valorW) * 2) + 1) /2);//retorno de resultado
    }//fin de clase
    
    public static float ProblemaB(int valorX, int valorW){//recepccion de atributos e inicializacion de Clase
        return ((5*valorW) * 2) * (((7 * valorX) / (valorW + 1)) + ((9 + valorW) / ((3 * valorX) * 2)));//retorno de resultado
    }//fin de clase
    
    public static double ProblemaCPositivo(int valorA, int valorB, int valorC){//recepccion de atributos e inicializacion de Clase
        double valorRaiz = (valorB * 2) - (4 * valorC * valorA);//resultado de 
        return (-valorB) + Math.sqrt( -valorRaiz )/ (2 * valorA) ;
    }//fin de clase
    
    public static double ProblemaCNegativo(int valorA, int valorB, int valorC){//recepccion de atributos e inicializacion de Clase
        //System.out.println(Math.sqrt(25));
        double valorRaiz = (valorB * 2) - (4 * valorC * valorA);
        return (-valorB) - Math.sqrt( -valorRaiz )/ (2 * valorA) ;
    }//fin de clase
}
