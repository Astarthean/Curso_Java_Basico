package com.ana;

public class WhileLoop {
    public static void main(String[] args) {


        int count = 0;
        while(count < 10){

            System.out.println("Hola mundo " + count);
            count++; //Condición, si no se pone, seria infinito el bucle
        }
/*
En este caso hacemos un if, cuando count llega a 6, salta y no imprime
Hola mundo + count

        while(count < 10) {
            if(count == 6)
                continue; //Salta a la siguiente iteración
            System.out.println("Hola mundo " + count);
        }

En este caso break rompe el flujo de ejecución del bucle por lo que directamente
en 6 sale del bucle y deja de imprimir
        while(count < 10) {
            if(count == 6)
                break; //Rompe el bucle
            System.out.println("Hola mundo " + count);
        }
 */
        System.out.println("Fin");
    }
}
