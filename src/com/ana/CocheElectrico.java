package com.ana;

public class CocheElectrico extends Clase_Coche{
    //La palabra extends permite heredar las clases de otra clase

    String motorElectrico;

    public CocheElectrico(){

    }

    public CocheElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    /*
    Aquí vamos a hacer un método super que hace que podamos asignar los parámetros
    de la clase base a la clase hija sin tener que replicar código
     */

    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo, String motorElectrico){
        super(color, fabricante, modelo, peso, largo);
        this.motorElectrico = motorElectrico;
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
