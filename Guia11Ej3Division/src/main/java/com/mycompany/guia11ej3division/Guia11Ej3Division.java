/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.guia11ej3division;

import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class Guia11Ej3Division {

    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        DivisionNumero div = new DivisionNumero();
        System.out.print("Ingrese num1: ");
        String num1 = leer.next();
        System.out.print("Ingrese num2: ");
        String num2 = leer.next();
        try {
            div.setNum1(Integer.valueOf(num1));
            div.setNum2(Integer.valueOf(num2));
            div.dividir();
        } catch (NumberFormatException error) {
            System.out.println("no corresponde el tipo de dato");
        }

    }
}
