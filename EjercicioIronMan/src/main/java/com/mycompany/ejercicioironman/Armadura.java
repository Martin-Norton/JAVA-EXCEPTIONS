/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioironman;

import java.util.Scanner;

/**
 *
 * @author Martin Norton
 */
public class Armadura {

    Scanner leer = new Scanner(System.in);
    int salud = 100;
    int resistencia = 100;
    Float energiaTotal = Float.MAX_VALUE;
    int porcBateria = 100;
    String color1;
    String color2;
    Botas bota;
    Guantes guante;
    Consola cons;
    Sintetizador sint;

//constructores
    public Armadura() {
        this.bota = new Botas();
        this.guante = new Guantes();
        this.cons = new Consola();
        this.sint = new Sintetizador();
    }

    public Armadura(int salud, int resistencia, String color1, String color2, Botas bota, Guantes guante, Consola cons, Sintetizador sint, int porcBateria) {
        this.salud = salud;
        this.resistencia = resistencia;
        this.color1 = color1;
        this.color2 = color2;
        this.bota = bota;
        this.guante = guante;
        this.cons = cons;
        this.sint = sint;
        this.porcBateria = 100;
    }
//getter y setter 

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public String getColor1() {
        return color1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public Botas getBota() {
        return bota;
    }

    public void setBota(Botas bota) {
        this.bota = bota;
    }

    public Guantes getGuante() {
        return guante;
    }

    public void setGuante(Guantes guante) {
        this.guante = guante;
    }

    public Consola getCons() {
        return cons;
    }

    public void setCons(Consola cons) {
        this.cons = cons;
    }

    public Sintetizador getSint() {
        return sint;
    }

    public void setSint(Sintetizador sint) {
        this.sint = sint;
    }

    public Float getEnergiaTotal() {
        return energiaTotal;
    }

    public void setEnergiaTotal(Float energiaTotal) {
        this.energiaTotal = energiaTotal;
    }

    public int getPorcBateria() {
        return porcBateria;
    }

    public void setPorcBateria(int porcBateria) {
        this.porcBateria = porcBateria;
    }

//metodos usar del dispositivo
    public void crearArmadura() {
        System.out.println("ingrese el color principal de la armadura");
        color1 = leer.next();
        System.out.println("ingrese el color secundario de la armadura");
        color2 = leer.next();
    }

    public void descontarET() {
        energiaTotal = (energiaTotal * (porcBateria / 100f));
        mostrarBatyPor();
    }

    public void caminar() {
        mostrarBatyPor();
        System.out.println("cuanto tiempo va a caminar");
        int time = leer.nextInt();
        porcBateria = (porcBateria - (bota.getConsumo() * time));
        descontarET();
        bota.damage = sufriendoDaños();

    }

    public void correr() {
        mostrarBatyPor();
        System.out.println("cuanto tiempo va a correr");
        int time = leer.nextInt();
        porcBateria = (porcBateria - ((bota.getConsumo() * 2) * time));
        descontarET();
        bota.damage = sufriendoDaños();

    }

    public void propulsarse() {
        mostrarBatyPor();
        System.out.println("cuanto tiempo va a propulsarse?");
        int time = leer.nextInt();
        porcBateria = (porcBateria - ((bota.getConsumo() * 3) * time));
        descontarET();
        bota.damage = sufriendoDaños();
    }

    public void volar() {
        mostrarBatyPor();
        System.out.println("cuanto tiempo va a volar?");
        int time = leer.nextInt();
        porcBateria = (porcBateria - (((bota.getConsumo() * 3) + (guante.getConsumo() * 2)) * time));
        descontarET();
        bota.damage = sufriendoDaños();
        guante.damage = sufriendoDaños();
    }

    public void disparar() {
        mostrarBatyPor();
        System.out.println("cuanto tiempo va a disparar?");
        int time = leer.nextInt();
        porcBateria = (porcBateria - ((guante.getConsumo() * 3) * time));
        descontarET();
        guante.damage = sufriendoDaños();
    }

    public void consumoConsola() {
        porcBateria = (porcBateria - cons.getConsumo());
        descontarET();
    }

    public void consumoSintetizador() {
        porcBateria = (porcBateria - sint.getConsumo());
        descontarET();
    }
//    Mostrando Estado

    public void mostrandoEstado() {
        System.out.println("estado de la armadura");
        System.out.println("color primario " + color1);
        System.out.println("color secundario " + color2);
        System.out.println("nivel de resistencia " + resistencia);
        System.out.println("nivel de salud " + salud);
        mostrarBatyPor();
        System.out.println("consumo de la bota " + bota.getConsumo() + " el estado de daño es " + bota.getDamage());
        System.out.println("consumo del guante " + guante.getConsumo() + " el estado de daño es " + guante.getDamage());
        System.out.println("consumo del sintetizador " + sint.getConsumo());
        System.out.println("consumo de la consola " + cons.getConsumo());

    }
//    Estado de la Batería

    public void mostrarBatyPor() {
        System.out.println("energia total " + energiaTotal);
        System.out.println("porcentaje de bateria " + porcBateria + " %");
    }

//    Mostrar Información del Reactor
    public void estadoReactor() {
        System.out.println("Energia actual (en Kilojulios)");
        System.out.println(energiaTotal / 1000f);
        System.out.println("Energia actual (en Watt/S)");
        System.out.println(energiaTotal);
        System.out.println("Energia actual (Kilocalorias)");
        System.out.println((energiaTotal) * 0.00023885f);
    }
//    Sufriendo Daños
//La armadura solo podrá utilizar dispositivos que no se encuentren dañados.

    public Boolean sufriendoDaños() {
        Boolean dano;
        Double aux = Math.random();
        if (aux <= 0.3) {
            dano = true;
            System.out.println("el dispositivo se daño!!!");
        } else {
            dano = false;
        }
        return dano;
    }
//    Reparando Daños

    public boolean reparandoDaños() {
        Boolean dano;
        Double aux = Math.random();
        if (aux <= 0.4) {
            dano = false;
            System.out.println("el dispositivo se reparo con exito!!");
        } else {
            dano = true;
            System.out.println("el dispositivo no pudo repararse :(");
        }
        return dano;
    }
//    Revisando Dispositivos

    public void revisarDispositivos() {
        if (bota.getDamage()) {
            do {
                System.out.println("se encontraron daños en la bota , intentando reparar");
                bota.setDamage(reparandoDaños());
                
            } while (bota.getDamage());
        }
        if (guante.getDamage()) {
            do {
                System.out.println("se encontraron daños en el guante , intentando reparar");
                reparandoDaños();
            } while (!guante.getDamage());
        }

    }

    public void menuUsarDispositivo() {
        int opc=0;
        crearArmadura();
        do {
            System.out.println("que accion desea realizar?");
            System.out.println("1)caminar");
            System.out.println("2)correr");
            System.out.println("3)propulsarse");
            System.out.println("4)volar");
            System.out.println("5)disparar");
            System.out.println("6)mostrar estado del traje");
            System.out.println("7)mostrar estado de la bateria");
            System.out.println("8) mostrar estado del reactor");
            System.out.println("9)salir");
            opc=leer.nextInt();
            switch (opc) {
                case 1:
                    if (!bota.getDamage()) {
                        caminar();
                    }else{
                        System.out.println("dispositivo dañado");
                        
                        break;
                    }
                    break;
                case 2:
                    if (!bota.getDamage()) {
                        correr();
                    }else{
                        System.out.println("dispositivo dañado");
                        break;
                    }
                    break;
                case 3:
                    if (!bota.getDamage()) {
                        propulsarse();
                    }else{
                        System.out.println("dispositivo dañado");
                        break;
                    }
                    break;
                case 4:
                    if (!bota.getDamage()&&!guante.getDamage()) {
                        volar();
                    }else{
                        System.out.println("dispositivo dañado");
                        break;
                    }
                    break;
                case 5:
                    if (!guante.getDamage()) {
                        disparar();
                    }else{
                        System.out.println("dispositivo dañado");
                        break;
                    }
                    break;
                case 6:
                    mostrandoEstado();
                    break;
                case 7:
                    mostrarBatyPor();
                    break;
                case 8:
                    estadoReactor();

                    break;
            
            }
            revisarDispositivos();
        } while (opc!=9);

    }

}
