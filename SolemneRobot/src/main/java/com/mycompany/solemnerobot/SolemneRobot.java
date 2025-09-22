/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.solemnerobot;

import java.util.ArrayList;

/**
 *
 * @author Lester
 */
public class SolemneRobot {

    public static void main(String[] args) {
        ArrayList<Robot> rbs = new ArrayList<>();
        
        for (int i = 0; i <= 10 ; i++) {
            boolean n = Generador.generarBooleanAlAzar();
            if (n){
                rbs.add(new RobotBasico(Generador.generarBooleanAlAzar(),i,0,5));
            }
            else{
                rbs.add(new RobotAvanzado(Generador.generarBooleanAlAzar(),Generador.generarBooleanAlAzar(),i,0,5));
            }
        }
        
        System.out.println("CREAR ROBOTS---------------------------------");
        for (Robot r: rbs) {
            System.out.println(r.toString());
        }
        
        System.out.println("");
        System.out.println("MOVER ROBOTS---------------------------------");
        for (Robot r: rbs) {
            while (r.nivelBateria > 0) {
                boolean n = Generador.generarBooleanAlAzar();
                if (n) {
                    r.avanzar();
                }
                else {
                    boolean m = Generador.generarBooleanAlAzar();
                    if (m) {
                        r.girarDerecha90Grados();
                    }
                    else {
                        r.girarIzquierda90Grados();
                    }
                }
            }
        }
        
        System.out.println("");
        System.out.println("RESULTADOS ROBOTS----------------------------");
        int mayor = 0, menor = 5, idmayor = 0, idmenor = 0;
        for (Robot r: rbs) {
            System.out.println(r.toString());
            
            if (r.distanciaRecorrida > mayor) {
                mayor = r.distanciaRecorrida;
                idmayor = r.getId();
            }
            if (r.distanciaRecorrida < menor) {
                menor = r.distanciaRecorrida;
                idmenor = r.getId();
            }
        }
        System.out.println("");
        for (Robot r: rbs) {
            if (r.getId() == idmayor) {
                System.out.println("MAYOR "+r.toString());
            }
            if (r.getId() == idmenor) {
                System.out.println("MENOR "+r.toString());
            }
        }
    }
}
