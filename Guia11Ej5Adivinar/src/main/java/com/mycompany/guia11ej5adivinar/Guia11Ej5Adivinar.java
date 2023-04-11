/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.guia11ej5adivinar;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class Guia11Ej5Adivinar {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int adivinanza = ((int) Math.random() * (500 - 1)) + 1;
        int num = 0;
        int intentos = 0;
        do {
            try {
                System.out.println("ingrese un numero");
                num = leer.nextInt();
                if (num == adivinanza) {
                    System.out.println("lo descubriste! el numero es " + adivinanza);
                    System.out.println("tus intentos fueron " + intentos);
                } else if (num < adivinanza) {
                    System.out.println("el numero a adivinar es mayor que el que ingreso");  
                } else {
                    System.out.println("el numero a ingresar es menor al que ingreso");
                }
            } catch (NumberFormatException e) {
                System.out.println("el formato es erroneo");
                num = leer.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("no se ingreso un valor");
                num = leer.nextInt();
            }

        } while (num != adivinanza);
    }
}
