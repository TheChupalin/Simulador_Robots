/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solemnerobot;

/**
 *
 * @author Lester
 */
public abstract class Robot implements IMovilizable, IGirable {
    protected int id;
    protected int distanciaRecorrida;
    protected int nivelBateria;

    public Robot() {
    }

    public Robot(int id, int distanciaRecorrida, int nivelBateria) {
        this.id = id;
        this.distanciaRecorrida = distanciaRecorrida;
        this.nivelBateria = nivelBateria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(int distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }
    
    public abstract void avanzar();

    @Override
    public String toString() {
        return "Robot{" + "id=" + id + ", distanciaRecorrida=" + distanciaRecorrida + ", nivelBateria=" + nivelBateria + '}';
    }
    
    public void finalize() {
        System.out.println("muerte");
    }
}
