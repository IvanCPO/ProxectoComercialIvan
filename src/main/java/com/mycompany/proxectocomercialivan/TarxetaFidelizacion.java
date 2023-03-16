/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectocomercialivan;

/**
 * Sugerencias del SonarLint:
 * Solo me sugiere eliminar una variable que no utilizo en el obtenerPuntos
 * por lo que decidí eliminarlo. La variable era numPuntos=0
 * 
 * 
 * @author Iván Cabaleiro Poceiro
 */
public class TarxetaFidelizacion {
    private int puntos;
    
    private static final int EUROS_PUNTO_NORMAL = 20;

    public TarxetaFidelizacion() {
    }

    
    public TarxetaFidelizacion(int puntosIniciais) {
        this.puntos = puntosIniciais;
    }
    
    public boolean obterPuntos(int valorCompra, boolean vip){
        if (valorCompra>0 && vip) {
            this.puntos+=valorCompra/10;
            return true;
        }else   if (valorCompra>0) {
            this.puntos+=valorCompra/EUROS_PUNTO_NORMAL;
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
	if (faltanPuntosRegalo(numPuntosRegalo)){
		resultado=-1;
	}else if (this.puntos==numPuntosRegalo){
		this.puntos=resultado;
	}else{
		this.puntos-=numPuntosRegalo;
		resultado=1;
	}
	return resultado;
    }

    public boolean faltanPuntosRegalo(int numPuntosRegalo) {
        return this.puntos<numPuntosRegalo;
    }
    
    /*
     *  Consulta los regalos que puedes conseguir a partir de los puntos que tengas
     * El codigo antiguo estaba mal ya que usaba la variable p en vez de la variable puntos
     * y era poco eficiente ya que chequeabas los puntos a partir de if.
     * La forma mas rapida y comoda en estos casos es un switch donde indicas los puntos y
     * los valores que puede tomar
     * @return El regalo que puedes obtener con esa cantidad de puntos.
     */
    public String consultarRegalos(){
	String r; //regalo
        r = switch (puntos) {
            case 200 -> "chave";
            case 100 -> "toalla";
            case 75 -> "mochila";
            case 50 -> "camiseta";
            case 30 -> "taza";
            default -> "Número de puntos insuficiente";
        };
	return r;
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
