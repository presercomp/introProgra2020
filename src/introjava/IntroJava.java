/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

/*
Añadimos las librerias necesarias para operar con los datos
ingresados por el usuario
*/
import java.util.Scanner;
/**
 * Clase de aprendizaje de Java para Consolas
 * @author Sebastian Solar
 */
public class IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definir edad como Real
        /* Tipos de datos en JAVA */
        /*
        Entero   : int 
        Real     : float | double
        Caracter : String
        Lógico   : boolean
        */
        int edad, edadPareja;
        //edad <- 25;
        edad = 25;
        // double edad = 25;
        // Escribir "La edad propuesta es ", edad;
        System.out.println("La edad propuesta es "+edad);
        // Leer edad;
        System.out.print("Ingrese su edad real: ");
        Scanner t = new Scanner(System.in);
        edad = t.nextInt();
        // Escribir...
        System.out.println("La edad indicada por usted es "+edad);
        System.out.print("Que edad tiene su pareja: ");
        edadPareja = t.nextInt();
        System.out.println("La edad de su pareja es "+edadPareja);
        // Nuevo cambio
        System.out.println("Hemos aprendido a trabajar con Git (algo)");        
    }
}
