/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ittg.u2; //Paquete fuente

/**
 *
 * @author Yuliani
 */
public class Celular {//inicio de la clase

    String marca;
    String modelo;
    String color;
    String so;
    double tamanio;
    String resolucion;

    //Metodos get y set de marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String m) {
        this.marca = m;
    }

    public void encender() {
        System.out.println("Encendiendo telefono");
    }

    public void apagar() {
        System.out.println("Apagando  telefono");
    }

    public void bajarVolumen() {
        System.out.println("Bajando volumen");
    }

    public void llamar() {
        System.out.println("Llamando");
    }

    public void enviarMensaje() {
        System.out.println("Enviando mensaje");
    }

    public void reproducirMultimedia() {
        System.out.println("Reproduciendo multimedia");
    }

    public void recibirMensaje() {
        System.out.println("Recibiendo mensaje");
    }

    public void bloquearPantalla() {
        System.out.println("Bloqueando pantalla");
    }

    public static void main(String[] args) {
        //sintaxis para crear un objeto en java
        //NombreClase nombreObjeto=new nombreClase();
        Celular c1 = new Celular();
        c1.setMarca("Huawei");
        System.out.println(c1.getMarca());
    }

}//fin de la clase
