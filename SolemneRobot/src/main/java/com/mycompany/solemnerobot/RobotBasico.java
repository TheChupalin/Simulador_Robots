/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solemnerobot;

/**
 *
 * @author Lester
 */
public class RobotBasico extends Robot {
    private boolean tarjetaExpansible;

    public RobotBasico() {
    }

    public RobotBasico(boolean tarjetaExpansible, int id, int distanciaRecorrida, int nivelBateria) {
        super(id, distanciaRecorrida, nivelBateria);
        this.tarjetaExpansible = tarjetaExpansible;
    }

    public boolean isTarjetaExpansible() {
        return tarjetaExpansible;
    }

    public void setTarjetaExpansible(boolean tarjetaExpansible) {
        this.tarjetaExpansible = tarjetaExpansible;
    }

    @Override
    public void avanzar() {
        distanciaRecorrida ++;
        nivelBateria --;
        System.out.println("Robot ID = "+id+" TIPO=RobotBasico, Avanzando en 1 CM..., totalAvanceHastaElMomentoEnCM="+distanciaRecorrida+" BateriaRestante="+nivelBateria);
    }
    
    public void girarDerecha90Grados() {
        nivelBateria --;
        System.out.println("Robot ID = "+id+" TIPO=RobotBasico, Girando a la Derecha en 90 grados, BateriaRestante="+nivelBateria);
    }
    
    public void girarIzquierda90Grados() {
        nivelBateria --;
        System.out.println("Robot ID = "+id+" TIPO=RobotBasico, Girando a la Izquierda en 90 grados, BateriaRestante="+nivelBateria);
    }

    @Override
    public String toString() {
        return "RobotBasico{" + super.toString() + "tarjetaExpansible=" + tarjetaExpansible + '}';
    }
    
    public void finalize() {
        System.out.println("muerte");
    }
}
