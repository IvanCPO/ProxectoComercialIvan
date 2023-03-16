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
        int numPuntos=0;
        if (valorCompra>0 && vip) {
            this.puntos+=valorCompra/10;
            return true;
        }else   if (valorCompra>0) {
            this.puntos+=valorCompra/20;
            return true;
        }
        return false;
    }
    
    public boolean abonarGaraxe(){
        if (this.puntos>=1){
		this.puntos--;
		return true;
	}
	return false;
    }
    
    public int obterRegalo(int numPuntosRegalo){
        int resultado=0;
	if (this.puntos<numPuntosRegalo){
		resultado=-1;
	}else if (this.puntos==numPuntosRegalo){
		this.puntos=resultado;
	}else{
		this.puntos-=numPuntosRegalo;
		resultado=1;
	}
	return resultado;
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
