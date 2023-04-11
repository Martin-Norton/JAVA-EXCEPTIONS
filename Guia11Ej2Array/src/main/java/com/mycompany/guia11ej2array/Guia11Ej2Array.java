/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guia11ej2array;

/**
 *
 * @author Martin Norton
 */
public class Guia11Ej2Array {

    public static void main(String[] args) {
        Array vec = new Array();
        try {
             vec.getVector()[6]=2;
        } catch (Exception e) {
            System.out.println("indice fuera de rango!!");
        } 
       
    }
}
