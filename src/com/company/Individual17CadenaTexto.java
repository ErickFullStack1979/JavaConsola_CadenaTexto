/*
Trabajo individual 17 Cadena de texto
Alumno: Erick Díaz Guerra
*/
package com.company;
import java.util.Scanner;
public class Individual17CadenaTexto {
   public static void main(String[] args) {

      Scanner ingresar = new Scanner(System.in);

      System.out.println("*** Procesamiento de cadenas de texto ***");
      System.out.println("============================== ==============================");

      System.out.println("Ingrese una cadena de texto para ser analizada:");
      String cadena = ingresar.nextLine();
      while (cadena.length() == 0) {
         System.out.println("Ingreso nulo, escriba una cadena de texto para ser analizada:");
         cadena = ingresar.nextLine();
      }

      System.out.println("============================== ==============================");
      System.out.println("Los caracteres aislados del texto son los siguientes:");
      for (int i = 0; i < cadena.length(); i++) {
         if (i > 0 && i%20 == 0) // Para agrupar los caracteres en filas de 20
            System.out.println("");
         System.out.print("["+cadena.charAt(i)+"]");
      }
      System.out.println("");

      int vocales = 0;
      int consonantes = 0;
      for (int i = 0; i < cadena.length(); i++) {
         if (cadena.substring(i, i + 1).matches("[AEIOUaeiou]*")) {
            vocales++;
         }
         else if (cadena.substring(i, i + 1).matches("[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]*")) {
            consonantes++;
         }
      }

      System.out.println("============================== ==============================");
      System.out.println("El texto tiene "+vocales+" vocales y "+consonantes+" consonantes.");
      System.out.print("============================== ==============================");
   }
}