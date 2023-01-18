/*
   Ejercicio Extra _ 5

   Crea una clase en Java donde declares una variable de tipo array de Strings que
   contenga los doce meses del año, en minúsculas. A continuación, declara una variable
   mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
   mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
   usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
   el mes secreto. Un ejemplo de ejecución del programa podría ser este:
   Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
   No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
   ¡Ha acertado!
 */
package ejercicio_extra_5;

import ejercicio_extra_5.Entidades.meses;

import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_Extra_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String intentoMes= "";
        String maskIntentoMes="";
        boolean intentoPrimero=true;
        System.out.println("Adivine el mes Secreto:");
        
        meses m1 = new meses(false);
        
        do {
            if (intentoPrimero) {
                System.out.print("Instroduzca el nombre del mes en minusculas: "); 
            } else {
                System.out.println("No ha acertado.");
                System.out.print("Intente nuevamente intruduciento otro mes: "); 
            }
           
            intentoMes = leer.next();
            maskIntentoMes=intentoMes.toLowerCase();
            m1.setAcertado(!m1.getMesSecreto().equals(maskIntentoMes));
            intentoPrimero=false;
        } while (m1.esAcertado());
        System.out.println("¡Ha acertado!");
        
    }
}
