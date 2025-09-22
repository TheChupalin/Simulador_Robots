/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solemnerobot;

/**
 *
 * @author Lester
 */
public class RobotAvanzado extends Robot {
    private boolean tieneSensorInfrarojoDelantero;
    private boolean esProgramableEnC;

    public RobotAvanzado() {
    }

    public RobotAvanzado(boolean tieneSensorInfrarojoDelantero, boolean esProgramableEnC, int id, int distanciaRecorrida, int nivelBateria) {
        super(id, distanciaRecorrida, nivelBateria);
        this.tieneSensorInfrarojoDelantero = tieneSensorInfrarojoDelantero;
        this.esProgramableEnC = esProgramableEnC;
    }

    public boolean isTieneSensorInfrarojoDelantero() {
        return tieneSensorInfrarojoDelantero;
    }

    public void setTieneSensorInfrarojoDelantero(boolean tieneSensorInfrarojoDelantero) {
        this.tieneSensorInfrarojoDelantero = tieneSensorInfrarojoDelantero;
    }

    public boolean isEsProgramableEnC() {
        return esProgramableEnC;
    }

    public void setEsProgramableEnC(boolean esProgramableEnC) {
        this.esProgramableEnC = esProgramableEnC;
    }
    
    @Override
    public void avanzar() {
        distanciaRecorrida +=2;
        nivelBateria --;
        System.out.println("Robot ID = "+id+" TIPO=RobotAvanzado, Avanzando en 2 CM..., totalAvanceHastaElMomentoEnCM="+distanciaRecorrida+" BateriaRestante="+nivelBateria);
    }
    
    public void girarDerecha90Grados() {
        nivelBateria --;
        System.out.println("Robot ID = "+id+" TIPO=RobotAvanzado, Girando a la Derecha en 90 grados, BateriaRestante="+nivelBateria);
    }
    
    public void girarIzquierda90Grados() {
        nivelBateria --;
        System.out.println("Robot ID = "+id+" TIPO=RobotAvanzado, Girando a la Izquierda en 90 grados, BateriaRestante="+nivelBateria);
    }

    @Override
    public String toString() {
        return "RobotAvanzado{" + super.toString() + "tieneSensorInfrarojoDelantero=" + tieneSensorInfrarojoDelantero + ", esProgramableEnC=" + esProgramableEnC + '}';
    }
    
    public void finalize() {
        System.out.println("muerte");
    }
}
