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

    /**
     * Genera un objeto con nulls
     */
    public TarxetaFidelizacion() {
    }

    /**
     * Genera objeto dandole valor a los puntos
     * @param puntosIniciais Introduce los puntos al objeto
     */
    public TarxetaFidelizacion(int puntosIniciais) {
        this.puntos = puntosIniciais;
    }
    
    /**
     * Obtener puntos a partir de ciertos criterios los cuales son el valor de la compra de los puntos
     * y si eres vip o no, que esto influira para tener mas o menos puntos a un precio
     * @param valorCompra da un valor que sirve para intercambiar por puntos
     * @param vip Indica si eres vip o no
     * @return devuelve si obtuviste puntos o no
     */
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
    
    /**
     * Sirve ofrecer aparcamientos sin limite de tiempo en el garage del centro 
     * por puntos
     * @return devuelve si tienes suficientes puntos para pagar el aparcamiento
     */
    public boolean abonarGaraxe(){
        if (this.puntos>=1){
		this.puntos--;
		return true;
	}
	return false;
    }
    
    /**
     * Intercambia los puntos por objetos regalo
     * @param numPuntosRegalo valor del regalo que quieres tener
     * @return devuelve 
     */
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

    /**
     * Indica si te faltan puntos para conseguir un regalo
     * @param numPuntosRegalo Numero de puntos necesarios para el Regalo
     * @return Devuelve si es capaz de pagarlo con los puntos o no
     */
    public boolean faltanPuntosRegalo(int numPuntosRegalo) {
        return this.puntos<numPuntosRegalo;
    }
    
    /*
    El codigo antiguo estaba mal ya que usaba la variable p en vez de la variable puntos
    y era poco eficiente ya que chequeabas los puntos a partir de if.
    La forma mas rapida y comoda en estos casos es un switch donde indicas los puntos y
    los valores que puede tomar
    */
    
    /**
     *  Consulta los regalos que puedes conseguir a partir de los puntos que tengas
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

    /**
     * Devuelve los puntos de objeto
     * @return Devuelve los puntos de objeto
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     *Inserta los puntos para el objeto objeto
     * @param puntos puntos que quieres poner en el objeto
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    /**
     * Imprimir el contenido del objeto con solo escribir el nombre de este
     * @return Valor que quieres que imprima
     */
    @Override
    public String toString() {
        return "TarxetaFidelizacion{" + "puntos=" + puntos + '}';
    }
    
    
}
