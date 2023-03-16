/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectocomercialivan;

/**
 *
 * @author Iván Cabaleiro Poceiro
 */
public class TarxetaFidelizacion {
    private int puntos;

    public TarxetaFidelizacion() {
    }

    
    public TarxetaFidelizacion(int puntosIniciais) {
        this.puntos = puntosIniciais;
    }
    
    public boolean obterPuntos(int valorCompra, boolean vip){
        
    }
    
    public boolean abonarGaraxe(){
        
    }
    
    public int obterRegalo(int numPuntosRegalo){
        
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "TarxetaFidelizacion{" + "puntos=" + puntos + '}';
    }
    
    
}
