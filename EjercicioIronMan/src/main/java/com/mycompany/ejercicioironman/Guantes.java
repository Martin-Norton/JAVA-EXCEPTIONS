/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioironman;

/**
 *
 * @author Martin Norton
 */
public class Guantes {
    int consumo;
    Boolean damage;

    public Guantes() {
        this.consumo=1;
        this.damage=false;
    }

    public Guantes(int consumo, Boolean damage) {
        this.consumo = consumo;
        this.damage = damage;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public Boolean getDamage() {
        return damage;
    }

    public void setDamage(Boolean damage) {
        this.damage = damage;
    }
    


}
