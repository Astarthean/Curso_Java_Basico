package com.ana;

public class Clase_Coche {

        //Atributos
        String color;
        String fabricante;
        String modelo;
        Double peso;
        Double largo;
        Integer velocidad = 0;

        //Constructores
        // Métodos especiales, permiten crear objetos de la clase. Si no añadimos nada habra un constructor vacio
        //que permitirá crear coches sin asignar valores a los parámetros atributos
        //Si queremos podemos crear otros constructores con otros parámetros

    public Clase_Coche(){

    }
    public Clase_Coche(String color, String fabricante, String modelo, Double peso, Double largo) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
        }

    //Comportamiento
    public void acelerar(Integer cantidad){
        if(cantidad > 0 && cantidad <= 120){
            this.velocidad += cantidad;
        }
    }

    @Override
    //Esto es un método llamado to String
    //Hace un sout con el valor de todas las propiedades
    public String toString() {
        return "Clase_Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
