/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia11ej3division;

/**
 *
 * @author Martin Norton
 */
public class DivisionNumero {

    Integer num1;
    Integer num2;
    Integer res;

    public Integer getRes() {
        return res;
    }

    public void setRes(Integer res) {
        this.res = res;
    }

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public void dividir() throws Exception {
        try {
            res = num1 / num2;
            System.out.println("el resultado de la division es " + res);
        }catch(ArithmeticException error){
            System.out.println("division por cero");
        }

    }

}
